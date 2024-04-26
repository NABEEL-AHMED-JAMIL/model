package com.barco.model.repository;

import com.barco.model.pojo.ReportSetting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface ReportSettingRepository extends CrudRepository<ReportSetting, Long> {
}
