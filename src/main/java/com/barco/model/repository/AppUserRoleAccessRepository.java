package com.barco.model.repository;

import com.barco.model.pojo.AppUserRoleAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserRoleAccessRepository extends CrudRepository<AppUserRoleAccess, Long> {
}
