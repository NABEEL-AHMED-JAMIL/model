package com.barco.model.repository;

import com.barco.model.pojo.UserGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface UserGroupRepository extends CrudRepository<UserGroup, Long> {
}
