package com.barco.model.repository;

import com.barco.model.pojo.AppSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppSettingRepository extends JpaRepository<AppSetting, Long> {

    public Optional<AppSetting> findBySettingKey(String settingKey);

}
