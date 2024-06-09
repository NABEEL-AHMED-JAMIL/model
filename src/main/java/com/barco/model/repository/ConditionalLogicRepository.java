package com.barco.model.repository;

import com.barco.model.pojo.ConditionalLogic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface ConditionalLogicRepository extends CrudRepository<ConditionalLogic, Long> {
}
