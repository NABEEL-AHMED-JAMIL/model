package com.barco.model.repository;

import com.barco.model.pojo.AppUserEnv;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserEnvRepository extends CrudRepository<AppUserEnv, Long> {
}
