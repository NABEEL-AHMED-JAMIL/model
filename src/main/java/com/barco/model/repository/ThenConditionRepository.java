package com.barco.model.repository;

import com.barco.model.pojo.ThenCondition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface ThenConditionRepository extends CrudRepository<ThenCondition, Long> {
}
