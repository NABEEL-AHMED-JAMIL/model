package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.DashboardSetting;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.barco.model.util.lookup.DASHBOARD_TYPE;
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
public interface DashboardSettingRepository extends CrudRepository<DashboardSetting, Long> {

    String FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT = "SELECT dashSetting FROM DashboardSetting dashSetting " +
            "WHERE dashSetting.id = ?1 AND dashSetting.createdBy.username = ?2 AND dashSetting.status != ?3";

    String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT = "SELECT dashSetting FROM DashboardSetting dashSetting " +
            "WHERE dashSetting.dateCreated BETWEEN ?1 AND ?2 AND dashSetting.createdBy.username = ?3 AND dashSetting.status != ?4";

    @Query(value = FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT)
    public Optional<DashboardSetting> findByIdAndUsernameAndStatusNot(Long id, String username, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT)
    public List<DashboardSetting> findAllByDateCreatedBetweenAndUsernameAndStatusNot(Date startDate, Date endDate, String username, APPLICATION_STATUS status);

    public List<DashboardSetting> findAllByCreatedByAndStatusNot(AppUser createdBy, APPLICATION_STATUS status);

    public List<DashboardSetting> findAllByCreatedByAndBoardTypeAndStatusNot(AppUser createdBy, DASHBOARD_TYPE boardType, APPLICATION_STATUS status);

    public List<DashboardSetting> findAllByIdIn(List<Long> ids);
}
