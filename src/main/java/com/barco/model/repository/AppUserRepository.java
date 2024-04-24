package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
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

    String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_PARENT_AND_STATUS_NOT_ORDER_BY_APP_USER_ID = "SELECT au FROM AppUser au " +
        "INNER JOIN SubAppUser sau ON sau.appUserChild = au.id " +
        "WHERE au.dateCreated BETWEEN ?1 AND ?2 AND sau.appUserParent = ?3 AND au.status != ?4 " +
        "ORDER BY au.id DESC";
    String FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_PARENT_AND_APP_USER_ID_AND_STATUS_NOT_ORDER_BY_APP_USER_ID = "SELECT au FROM AppUser au " +
        "INNER JOIN SubAppUser sau ON sau.appUserChild = au.id " +
        "WHERE au.dateCreated BETWEEN ?1 AND ?2 AND sau.appUserParent = ?3 AND au.id IN ?4 AND au.status != ?5 " +
        "ORDER BY au.id DESC";

    public Optional<AppUser> findByIdAndStatus(Long id, APPLICATION_STATUS status);

    public Optional<AppUser> findByUsernameAndStatus(String username, APPLICATION_STATUS status);

    public Optional<AppUser> findByEmailAndStatus(String email, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_PARENT_AND_STATUS_NOT_ORDER_BY_APP_USER_ID)
    public List<AppUser> findAllByDateCreatedBetweenAndAppUserParentAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, AppUser appUserParent, APPLICATION_STATUS status);

    @Query(value = FIND_ALL_BY_DATE_CREATED_BETWEEN_AND_APP_USER_PARENT_AND_APP_USER_ID_AND_STATUS_NOT_ORDER_BY_APP_USER_ID)
    public List<AppUser> findAllByDateCreatedBetweenAndAppUserParentAndAppUserIdInAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, AppUser appUserParent, List<Long> appUserIds ,APPLICATION_STATUS status);

    public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);

}
