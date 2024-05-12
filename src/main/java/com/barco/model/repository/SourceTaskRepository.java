package com.barco.model.repository;

import com.barco.model.pojo.SourceTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface SourceTaskRepository extends CrudRepository<SourceTask, Long> {
}
