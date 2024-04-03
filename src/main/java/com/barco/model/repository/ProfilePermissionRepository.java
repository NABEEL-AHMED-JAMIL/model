package com.barco.model.repository;

import com.barco.model.pojo.ProfilePermission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface ProfilePermissionRepository extends CrudRepository<ProfilePermission, Long> {
}
