package com.barco.model.repository;

import com.barco.model.pojo.WebHook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface WebHookRepository extends CrudRepository<WebHook, Long> {
}
