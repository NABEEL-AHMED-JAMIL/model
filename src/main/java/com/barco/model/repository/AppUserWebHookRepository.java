package com.barco.model.repository;

import com.barco.model.pojo.AppUserWebHook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserWebHookRepository extends CrudRepository<AppUserWebHook, Long> {
}
