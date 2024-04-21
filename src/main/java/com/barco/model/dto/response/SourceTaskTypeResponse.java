package com.barco.model.dto.response;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTaskTypeResponse extends BaseEntity {

    private String description; // yes
    private String serviceName; // yes
    private GLookup taskType; // yes
    private Long credentialId;
    // base on task type
    private KafkaTaskTypeResponse kafkaTaskType;
    // base on task type
    private ApiTaskTypeResponse apiTaskType;

    public SourceTaskTypeResponse() {
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

    public GLookup getTaskType() {
        return taskType;
    }

    public void setTaskType(GLookup taskType) {
        this.taskType = taskType;
    }

    public Long getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
    }

    public KafkaTaskTypeResponse getKafkaTaskType() {
        return kafkaTaskType;
    }

    public void setKafkaTaskType(KafkaTaskTypeResponse kafkaTaskType) {
        this.kafkaTaskType = kafkaTaskType;
    }

    public ApiTaskTypeResponse getApiTaskType() {
        return apiTaskType;
    }

    public void setApiTaskType(ApiTaskTypeResponse apiTaskType) {
        this.apiTaskType = apiTaskType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
