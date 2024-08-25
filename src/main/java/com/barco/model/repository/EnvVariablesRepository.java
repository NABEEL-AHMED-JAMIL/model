package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.EnvVariables;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface EnvVariablesRepository extends CrudRepository<EnvVariables, Long> {

    public Optional<EnvVariables> findByEnvKeyAndStatusNot(String envKey, APPLICATION_STATUS status);

    public List<EnvVariables> findAllByStatusNotOrderByDateCreatedDesc(APPLICATION_STATUS status);

    public List<EnvVariables> findAllByCreatedByAndStatusNotOrderByDateCreatedDesc(AppUser createdBy, APPLICATION_STATUS status);

    public List<EnvVariables> findAllByIdInAndStatusNotOrderByDateCreatedDesc(List<Long> ids, APPLICATION_STATUS status);

    public List<EnvVariables> findAllByIdIn(List<Long> ids);
}
