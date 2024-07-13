package com.barco.model.dto.request;

import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
public class DynamicPayloadRequest {

    private Long id;
    private String name;
    private String description;
    private Long status;
    private SessionUser sessionUser;
    private List<DynamicPayloadTagRequest> dynamicPayloadTags;

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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }

    public List<DynamicPayloadTagRequest> getDynamicPayloadTags() {
        return dynamicPayloadTags;
    }

    public void setDynamicPayloadTags(List<DynamicPayloadTagRequest> dynamicPayloadTags) {
        this.dynamicPayloadTags = dynamicPayloadTags;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
