package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.Credential;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.barco.model.util.lookup.CREDENTIAL_TYPE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface CredentialRepository extends CrudRepository<Credential, Long> {

    String FIND_BY_ID_AND_USERNAME_AND_STATUS = "SELECT credential FROM Credential credential " +
        "WHERE credential.id = ?1 AND credential.createdBy.username = ?2 AND credential.status = ?3";
    String FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT = "SELECT credential FROM Credential credential " +
        "WHERE credential.id = ?1 AND credential.createdBy.username = ?2 AND credential.status != ?3";
    String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT = "SELECT credential FROM Credential credential " +
        "WHERE credential.dateCreated BETWEEN ?1 AND ?2 AND credential.createdBy.username = ?3 AND credential.status != ?4";

    @Query(value = FIND_BY_ID_AND_USERNAME_AND_STATUS)
    public Optional<Credential> findByIdAndUsernameAndStatus(Long id, String username, APPLICATION_STATUS status);

    @Query(value = FIND_BY_ID_AND_USERNAME_AND_STATUS_NOT)
    public Optional<Credential> findByIdAndUsernameAndStatusNot(Long id, String username, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_USERNAME_AND_STATUS_NOT)
    public List<Credential> findAllByDateCreatedBetweenAndUsernameAndStatusNot(Date startDate, Date endDate, String username, APPLICATION_STATUS status);

    public List<Credential> findAllByCreatedByAndStatusNot(AppUser createdBy, APPLICATION_STATUS status);

    public List<Credential> findAllByCreatedByAndTypeInAndStatusNot(AppUser createdBy, Set<CREDENTIAL_TYPE> types, APPLICATION_STATUS status);

    public List<Credential> findAllByIdIn(List<Long> ids);

}
