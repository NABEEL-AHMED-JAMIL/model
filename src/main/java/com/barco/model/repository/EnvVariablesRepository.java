package com.barco.model.repository;

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

    public Optional<EnvVariables> findByIdAndStatusNot(Long id, APPLICATION_STATUS status);

    public Optional<EnvVariables> findByEnvKeyAndStatusNot(String envKey, APPLICATION_STATUS status);

    public List<EnvVariables> findAllByStatusNot(APPLICATION_STATUS status);
}
