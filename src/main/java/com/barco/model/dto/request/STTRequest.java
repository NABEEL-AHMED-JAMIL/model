package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class STTRequest {

    private Long id;
    private String description; // yes
    private String serviceName; // yes
    private Long status;
    private Long taskType; // yes
    private Long credentialId;
    private SessionUser sessionUser;
    private boolean defaultStt;
    private KafkaTaskTypeRequest kafkaTaskType; // base on task type
    private ApiTaskTypeRequest apiTaskType; // base on task type

    public STTRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getTaskType() {
        return taskType;
    }

    public void setTaskType(Long taskType) {
        this.taskType = taskType;
    }

    public Long getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
    }

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }

    public boolean isDefaultStt() {
        return defaultStt;
    }

    public void setDefaultStt(boolean defaultStt) {
        this.defaultStt = defaultStt;
    }

    public KafkaTaskTypeRequest getKafkaTaskType() {
        return kafkaTaskType;
    }

    public void setKafkaTaskType(KafkaTaskTypeRequest kafkaTaskType) {
        this.kafkaTaskType = kafkaTaskType;
    }

    public ApiTaskTypeRequest getApiTaskType() {
        return apiTaskType;
    }

    public void setApiTaskType(ApiTaskTypeRequest apiTaskType) {
        this.apiTaskType = apiTaskType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}