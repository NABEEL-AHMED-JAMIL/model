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

    private Long sttId;
    private String description; // yes
    private String serviceName; // yes
    private Long status;
    private Long taskType; // yes
    private String homePage;
    private String serviceId;
    private Long formId;
    private Long credentialId;
    private Boolean deleteAble;
    private KafkaTaskTypeRequest kafkaTaskType; // base on task type
    private ApiTaskTypeRequest apiTaskType; // base on task type
    private ParseRequest accessUserDetail; // yes

    public STTRequest() {}

    public Long getSttId() {
        return sttId;
    }

    public void setSttId(Long sttId) {
        this.sttId = sttId;
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

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Long getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(Long credentialId) {
        this.credentialId = credentialId;
    }

    public Boolean getDeleteAble() {
        return deleteAble;
    }

    public void setDeleteAble(Boolean deleteAble) {
        this.deleteAble = deleteAble;
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

    public ParseRequest getAccessUserDetail() {
        return accessUserDetail;
    }

    public void setAccessUserDetail(ParseRequest accessUserDetail) {
        this.accessUserDetail = accessUserDetail;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}