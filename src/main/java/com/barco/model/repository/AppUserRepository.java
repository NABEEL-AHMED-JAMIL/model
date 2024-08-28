package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.Organization;
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
public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    // adding org is null so the super admin will not show in the view
    public String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_STATUS_NOT = "SELECT au FROM AppUser au " +
        "WHERE au.dateCreated BETWEEN ?1 AND ?2 AND au.status != ?3 AND au.createdBy IS NULL AND au.organization IS NULL " +
        "ORDER BY au.id DESC";
    public String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_PARENT_AND_ORG_ID_AND_STATUS_NOT = "SELECT au FROM AppUser au " +
        "INNER JOIN SubAppUser sau ON sau.appUserChild = au.id " +
        "WHERE au.dateCreated BETWEEN ?1 AND ?2 AND sau.appUserParent = ?3 AND au.organization = ?4 AND au.status != ?5 " +
        "ORDER BY au.id DESC";
    public String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_PARENT_AND_ORG_ID_AND_APP_USER_ID_IN_AND_STATUS_NOT = "SELECT au FROM AppUser au " +
        "INNER JOIN SubAppUser sau ON sau.appUserChild = au.id " +
        "WHERE au.dateCreated BETWEEN ?1 AND ?2 AND sau.appUserParent = ?3 AND au.organization = ?4 AND au.id IN ?5 AND au.status != ?6  " +
        "ORDER BY au.id DESC";
    public String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_ID_IN_AND_STATUS_NOT = "SELECT au FROM AppUser au " +
        "WHERE au.dateCreated BETWEEN ?1 AND ?2 AND au.id IN ?3 AND au.createdBy IS NULL AND au.organization IS NULL " +
        "ORDER BY au.id DESC";

    public Optional<AppUser> findByUsernameAndStatus(String username, APPLICATION_STATUS status);

    public Optional<AppUser> findByEmailAndStatus(String email, APPLICATION_STATUS status);

    public Optional<AppUser> findByEmailAndStatusNot(String email, APPLICATION_STATUS status);

    public Optional<AppUser> findByIdAndStatusNot(Long id, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_STATUS_NOT)
    public List<AppUser> findAllByDateCreatedBetweenAndStatusNotOrderByDateCreatedDesc(Date startDate, Date endDate, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_PARENT_AND_ORG_ID_AND_STATUS_NOT)
    public List<AppUser> findAllByDateCreatedBetweenAndAppUserParentAndOrgIdAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, AppUser appUserParent, Organization organization, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_PARENT_AND_ORG_ID_AND_APP_USER_ID_IN_AND_STATUS_NOT)
    public List<AppUser> findAllByDateCreatedBetweenAndAppUserParentAndOrgIdAndAppUserIdInAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, AppUser appUserParent, Organization organization, List<Long> appUserIds, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_ID_IN_AND_STATUS_NOT)
    public List<AppUser> findAllByDateCreatedBetweenAndAppUserIdInAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, List<Long> appUserIds, APPLICATION_STATUS status);

    public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);

}
