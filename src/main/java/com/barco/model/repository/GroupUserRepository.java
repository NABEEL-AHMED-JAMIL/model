package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.GroupUser;
import com.barco.model.pojo.Groups;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.barco.model.util.lookup.GROUP_USER_TYPE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface GroupUserRepository extends CrudRepository<GroupUser, Long> {

    public Optional<GroupUser> findByAppUserAndGroupsAndUserTypeAndStatus(
        AppUser appUser, Groups groups, GROUP_USER_TYPE userType, APPLICATION_STATUS status);

    public List<GroupUser> findByGroupsAndUserTypeAndStatus(
        Groups groups, GROUP_USER_TYPE userType, APPLICATION_STATUS status);
}
