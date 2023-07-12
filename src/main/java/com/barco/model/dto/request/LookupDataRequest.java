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

    private Long lookupId;
    private Long lookupCode;
    private String lookupType;
    private String lookupValue;
    private String description;
    private Timestamp dateCreated;
    private Long parentLookupId;
    private boolean validate;
    private boolean uiLookup;
    private ParseRequest accessUserDetail;

    public LookupDataRequest() {
    }

    public Long getLookupId() {
        return lookupId;
    }

    public void setLookupId(Long lookupId) {
        this.lookupId = lookupId;
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

    public boolean isValidate() {
        return validate;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    public boolean isUiLookup() {
        return uiLookup;
    }

    public void setUiLookup(boolean uiLookup) {
        this.uiLookup = uiLookup;
    }

    public ParseRequest getAccessUserDetail() {
        return accessUserDetail;
    }

    public void setAccessUserDetail(ParseRequest accessUserDetail) {
        this.accessUserDetail = accessUserDetail;
    }

    public void addAccessUserDetail(String username) {
        ParseRequest accessUserDetail = new ParseRequest();
        accessUserDetail.setUsername(username);
        this.setAccessUserDetail(accessUserDetail);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
