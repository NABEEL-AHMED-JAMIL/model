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
public class TaskDto {

    private Long id;
    private String taskName;
    private String className;
    private Object taskDetailJson;
    private Timestamp createdAt;
    private Long createdBy;
    private Status status;
    private StorageDetailDto storageDetail;


    public TaskDto() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public Object getTaskDetailJson() { return taskDetailJson; }
    public void setTaskDetailJson(Object taskDetailJson) { this.taskDetailJson = taskDetailJson; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }

    public Long getCreatedBy() { return createdBy; }
    public void setCreatedBy(Long createdBy) { this.createdBy = createdBy; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public StorageDetailDto getStorageDetail() { return storageDetail; }
    public void setStorageDetail(StorageDetailDto storageDetail) { this.storageDetail = storageDetail; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
