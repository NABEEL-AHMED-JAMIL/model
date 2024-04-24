package com.barco.model.repository.specification;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.NotificationAudit;
import com.barco.model.util.ModelUtil;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
public class NotificationSpecification extends SearchSpecification<AppUser, NotificationAudit>  {

    private static final long serialVersionUID = 1L;

    private static final String STATUS = "status";
    private static final String SEND_TO = "sendTo";
    private static final String EXPIRE_TIME = "expireTime";
    private Long days;

    public NotificationSpecification(AppUser appUser, Long days) {
        super(appUser);
        this.days = days;
    }

    /**
     * Method user to predicate the Notification audit
     * @param root
     * @param query
     * @param criteriaBuilder
     * @param appUser
     * */
    @Override
    public Predicate toPredicate(Root<NotificationAudit> root, CriteriaQuery<?> query,
        CriteriaBuilder criteriaBuilder, AppUser appUser) {
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(criteriaBuilder.equal(root.get(STATUS), APPLICATION_STATUS.ACTIVE));
        if (ModelUtil.isNotBlank(appUser.getUsername())) {
            predicates.add(criteriaBuilder.equal(root.get(SEND_TO), appUser));
        }
        predicates.add(criteriaBuilder.between(root.get(EXPIRE_TIME), new Timestamp(System.currentTimeMillis()),
            addDays(new Timestamp(System.currentTimeMillis()), this.days)));
        return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
    }

    /**
     * Method use to add days into timestamp
     * */
    private Timestamp addDays(Timestamp date, Long days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days.intValue());
        return new Timestamp(cal.getTime().getTime());
    }
}
