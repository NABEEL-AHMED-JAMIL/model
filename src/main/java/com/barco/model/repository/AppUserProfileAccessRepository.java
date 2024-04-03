package com.barco.model.repository;

import com.barco.model.pojo.AppUserProfileAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserProfileAccessRepository extends CrudRepository<AppUserProfileAccess, Long> {
}
