package com.barco.model.repository;

import com.barco.model.pojo.ApiTaskType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface ApiTaskTypeRepository extends CrudRepository<ApiTaskType, Long> {
}
