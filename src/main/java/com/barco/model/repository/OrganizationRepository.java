package com.barco.model.repository;

import com.barco.model.pojo.Organization;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {

    public String FIND_BY_ID_AND_USERNAME = "SELECT org FROM Organization org " +
        "WHERE org.id = ?1 AND org.createdBy.username = ?2";

    public String FIND_BY_ORG_ID_AND_USERNAME_AND_STATUS_NOT = "SELECT org FROM Organization org " +
        "WHERE org.id = ?1 AND org.createdBy.username = ?2 AND org.status != ?3";

    @Query(value = FIND_BY_ID_AND_USERNAME)
    public Optional<Organization> findByIdAndUsername(Long id, String username);

    @Query(value = FIND_BY_ORG_ID_AND_USERNAME_AND_STATUS_NOT)
    public Optional<Organization> findByIdAndUsernameAndStatusNot(Long id, String username, APPLICATION_STATUS applicationStatus);

    public List<Organization> findAllByIdIn(List<Long> ids);
}
