package com.barco.model.repository;

import com.barco.model.pojo.DynamicPayload;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface DynamicPayloadRepository extends CrudRepository<DynamicPayload, Long> {
}
