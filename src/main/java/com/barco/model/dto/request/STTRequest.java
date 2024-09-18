package com.barco.model.dto.request;

import com.barco.model.enums.Action;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class STTRequest extends RequestFilter {

    private Long id;
    private String uuid;
    private String description; // yes
    private String serviceName; // yes
    private Long status;
    private Long taskType; // yes
    private Long credentialId;
    private KafkaTaskTypeRequest kafkaTaskType; // base on task type
    private ApiTaskTypeRequest apiTaskType; // base on task type
    private SessionUser sessionUser;
    //
    private Action action; // delete|insert
    private List<Long> formId;
    private List<Long> sttLinkForm;

    public STTRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public List<Long> getFormId() {
        return formId;
    }

    public void setFormId(List<Long> formId) {
        this.formId = formId;
    }

    public List<Long> getSttLinkForm() {
        return sttLinkForm;
    }

    public void setSttLinkForm(List<Long> sttLinkForm) {
        this.sttLinkForm = sttLinkForm;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}