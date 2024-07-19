package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.DynamicPayload;
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
public interface DynamicPayloadRepository extends CrudRepository<DynamicPayload, Long> {

    String FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT = "SELECT dynamicPayload FROM DynamicPayload dynamicPayload " +
        "WHERE dynamicPayload.id = ?1 AND dynamicPayload.createdBy.username = ?2 AND dynamicPayload.status != ?3";
    String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT = "SELECT reportSetting FROM ReportSetting reportSetting " +
        "WHERE reportSetting.dateCreated BETWEEN ?1 AND ?2 AND reportSetting.createdBy.username = ?3 AND reportSetting.status != ?4";

    @Query(value = FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT)
    public Optional<DynamicPayload> findByIdAndUsernameAndStatusNot(Long id, String username, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT)
    public List<DynamicPayload> findAllByDateCreatedBetweenAndUsernameAndStatusNot(
            Date startDate, Date endDate, String username, APPLICATION_STATUS status);

    public List<DynamicPayload> findAllByCreatedByAndStatusNot(AppUser createdBy, APPLICATION_STATUS status);

    public List<DynamicPayload> findAllByIdIn(List<Long> ids);

}
