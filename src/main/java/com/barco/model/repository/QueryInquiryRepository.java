package com.barco.model.repository;

import com.barco.model.pojo.QueryInquiry;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface QueryInquiryRepository extends CrudRepository<QueryInquiry, Long> {

    public String FIND_ALL_BY_USERNAME_AND_STATUS_NOT_IN = "SELECT queryInquiry FROM QueryInquiry queryInquiry " +
        "WHERE queryInquiry.createdBy.username = ?1 AND queryInquiry.status NOT IN ?2 ORDER BY queryInquiry.dateCreated DESC";

    public String FIND_ALL_BY_USERNAME_IN_AND_STATUS_NOT_IN = "SELECT queryInquiry FROM QueryInquiry queryInquiry " +
            "WHERE queryInquiry.createdBy.username IN ?1 AND queryInquiry.status NOT IN ?2 ORDER BY queryInquiry.dateCreated DESC";

    public String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT_IN = "SELECT queryInquiry FROM QueryInquiry queryInquiry " +
        "WHERE queryInquiry.dateCreated BETWEEN ?1 AND ?2 AND queryInquiry.createdBy.username = ?3 AND queryInquiry.status NOT IN ?4";

    public String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_IN_AND_STATUS_NOT_IN = "SELECT queryInquiry FROM QueryInquiry queryInquiry " +
        "WHERE queryInquiry.dateCreated BETWEEN ?1 AND ?2 AND queryInquiry.createdBy.username IN ?3 AND queryInquiry.status NOT IN ?4";

    public Optional<QueryInquiry> findByUuidAndStatusNot(String uuid, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_USERNAME_AND_STATUS_NOT_IN)
    public List<QueryInquiry> findAllByUsernameAndStatusNotInOrderByDateCreatedDesc(String username, List<APPLICATION_STATUS> status);

    @Query(value = FIND_ALL_BY_USERNAME_IN_AND_STATUS_NOT_IN)
    public List<QueryInquiry> findAllByUsernameInAndStatusNotInOrderByDateCreatedDesc(List<String> username, List<APPLICATION_STATUS> status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT_IN)
    public List<QueryInquiry> findAllByDateCreatedBetweenAndUsernameAndStatusNotIn(Date startDate, Date endDate, String username, List<APPLICATION_STATUS> status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_IN_AND_STATUS_NOT_IN)
    public List<QueryInquiry> findAllByDateCreatedBetweenAndUsernameInAndStatusNotIn(Date startDate, Date endDate, List<String> username, List<APPLICATION_STATUS> status);

    public List<QueryInquiry> findAllByUuidInAndStatusNot(List<String> ids, APPLICATION_STATUS status);

}
