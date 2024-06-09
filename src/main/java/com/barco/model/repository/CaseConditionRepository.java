package com.barco.model.repository;

import com.barco.model.pojo.CaseCondition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface CaseConditionRepository extends CrudRepository<CaseCondition, Long> {
}
