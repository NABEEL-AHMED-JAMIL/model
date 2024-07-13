package com.barco.model.repository;

import com.barco.model.pojo.EnableAndVisibilityConfig;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface EnableAndVisibilityConfigRepository extends CrudRepository<EnableAndVisibilityConfig, Long> {
}
