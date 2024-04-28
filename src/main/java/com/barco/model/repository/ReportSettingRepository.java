package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.ReportSetting;
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
public interface ReportSettingRepository extends CrudRepository<ReportSetting, Long> {

    String FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT = "SELECT reportSetting FROM ReportSetting reportSetting " +
            "WHERE reportSetting.id = ?1 AND reportSetting.createdBy.username = ?2 AND reportSetting.status != ?3";
    String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT = "SELECT reportSetting FROM ReportSetting reportSetting " +
            "WHERE reportSetting.dateCreated BETWEEN ?1 AND ?2 AND reportSetting.createdBy.username = ?3 AND reportSetting.status != ?4";

    @Query(value = FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT)
    public Optional<ReportSetting> findByIdAndUsernameAndStatusNot(Long credentialId, String username, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT)
    public List<ReportSetting> findAllByDateCreatedBetweenAndUsernameAndStatusNot(Date startDate, Date endDate, String username, APPLICATION_STATUS status);

    public List<ReportSetting> findAllByCreatedByAndStatusNot(AppUser createdBy, APPLICATION_STATUS status);

    public List<ReportSetting> findAllByIdIn(List<Long> ids);
}
