package com.barco.model.repository;

import com.barco.model.pojo.AppSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppSettingRepository extends JpaRepository<AppSetting, Long> {

    @Query(value = "SELECT settingValue FROM AppSetting", nativeQuery = true)
    public String findBySettingKey(String settingKey);

}
