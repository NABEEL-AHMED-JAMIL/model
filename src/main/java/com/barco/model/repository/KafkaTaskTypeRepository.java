package com.barco.model.repository;

import com.barco.model.pojo.KafkaTaskType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface KafkaTaskTypeRepository extends CrudRepository<KafkaTaskType, Long> {
}
