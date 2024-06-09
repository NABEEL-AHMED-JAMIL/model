package com.barco.model.repository;

import com.barco.model.pojo.VisibilityConfig;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface VisibilityConfigRepository extends CrudRepository<VisibilityConfig, Long> {
}
