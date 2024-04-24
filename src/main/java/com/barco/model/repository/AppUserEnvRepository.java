package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.AppUserEnv;
import com.barco.model.pojo.EnvVariables;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserEnvRepository extends CrudRepository<AppUserEnv, Long> {

    Optional<AppUserEnv> findAppUserEnvByEnvVariablesAndAppUser(EnvVariables envVariables, AppUser appUser);

}
