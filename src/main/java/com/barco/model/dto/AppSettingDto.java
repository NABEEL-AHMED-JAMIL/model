package com.barco.model.dto;

import com.barco.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppSettingDto {

    private Long appSettingId;
    private String settingKey;
    private String settingValue;
    private String description;
    private Timestamp modifiedAt;
    private Long modifiedBy;
    private Timestamp createdAt;
    private Long createdBy;
    private Status status;

    public AppSettingDto() {}

    public AppSettingDto(String settingKey, String settingValue, String description,
        Long createdBy, Status status) {
        this.settingKey = settingKey;
        this.settingValue = settingValue;
        this.description = description;
        this.createdBy = createdBy;
        this.status = status;
    }

    public Long getAppSettingId() {
        return appSettingId;
    }
    public void setAppSettingId(Long appSettingId) {
        this.appSettingId = appSettingId;
    }

    public String getSettingKey() {
        return settingKey;
    }
    public void setSettingKey(String settingKey) {
        this.settingKey = settingKey;
    }

    public String getSettingValue() {
        return settingValue;
    }
    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }
    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }
    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}