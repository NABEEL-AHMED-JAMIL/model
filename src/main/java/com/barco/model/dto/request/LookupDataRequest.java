package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LookupDataRequest {

    private Long id;
    private Long lookupCode;
    private String lookupType;
    private String lookupValue;
    private String description;
    private Timestamp dateCreated;
    private Long parentLookupId;
    private Long status;
    private Long uiLookup;
    private SessionUser sessionUser;

    public LookupDataRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public String getLookupValue() {
        return lookupValue;
    }

    public void setLookupValue(String lookupValue) {
        this.lookupValue = lookupValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Long getParentLookupId() {
        return parentLookupId;
    }

    public void setParentLookupId(Long parentLookupId) {
        this.parentLookupId = parentLookupId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getUiLookup() {
        return uiLookup;
    }

    public void setUiLookup(Long uiLookup) {
        this.uiLookup = uiLookup;
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