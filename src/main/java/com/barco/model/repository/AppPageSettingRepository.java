package com.barco.model.repository;

import com.barco.model.pojo.AppPageSetting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppPageSettingRepository extends CrudRepository<AppPageSetting, Long> {
}
