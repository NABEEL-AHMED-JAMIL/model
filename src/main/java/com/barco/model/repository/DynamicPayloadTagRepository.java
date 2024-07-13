package com.barco.model.repository;

import com.barco.model.pojo.DynamicPayloadTag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface DynamicPayloadTagRepository extends CrudRepository<DynamicPayloadTag, Long> {
}
