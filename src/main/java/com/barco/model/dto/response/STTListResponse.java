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
public class STTListResponse extends BaseEntity {

    private String serviceName;
    private String description;
    private GLookup taskType;
    private CredentialResponse credential;
    private KafkaTaskTypeResponse kafkaTaskType;
    private ApiTaskTypeResponse apiTaskType;
    private Long totalUser = 0l;
    private Long totalTask = 0l;
    private Long totalForm = 0l;

    public STTListResponse() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GLookup getTaskType() {
        return taskType;
    }

    public void setTaskType(GLookup taskType) {
        this.taskType = taskType;
    }

    public CredentialResponse getCredential() {
        return credential;
    }

    public void setCredential(CredentialResponse credential) {
        this.credential = credential;
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

    public Long getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(Long totalUser) {
        this.totalUser = totalUser;
    }

    public Long getTotalTask() {
        return totalTask;
    }

    public void setTotalTask(Long totalTask) {
        this.totalTask = totalTask;
    }

    public Long getTotalForm() {
        return totalForm;
    }

    public void setTotalForm(Long totalForm) {
        this.totalForm = totalForm;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
