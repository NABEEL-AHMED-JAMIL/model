package com.barco.model.repository;

import com.barco.model.pojo.EnableAbilityConfig;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface EnableAbilityConfigRepository extends CrudRepository<EnableAbilityConfig, Long> {
}
