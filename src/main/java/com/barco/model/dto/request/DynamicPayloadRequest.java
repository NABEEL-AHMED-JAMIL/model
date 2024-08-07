package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicPayloadRequest extends RequestFilter {

    private Long id;
    private String name;
    private String description;
    private String payload;
    private Long payloadType;
    private Long status;
    private ConfigurationMakerRequest dynamicPayloadTags;
    private SessionUser sessionUser;

    public DynamicPayloadRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Long getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(Long payloadType) {
        this.payloadType = payloadType;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public ConfigurationMakerRequest getDynamicPayloadTags() {
        return dynamicPayloadTags;
    }

    public void setDynamicPayloadTags(ConfigurationMakerRequest dynamicPayloadTags) {
        this.dynamicPayloadTags = dynamicPayloadTags;
    }

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
