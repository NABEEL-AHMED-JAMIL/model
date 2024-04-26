package com.barco.model.repository;

import com.barco.model.pojo.EnvVariables;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface DashboardSettingRepository extends CrudRepository<EnvVariables, Long> {
}
