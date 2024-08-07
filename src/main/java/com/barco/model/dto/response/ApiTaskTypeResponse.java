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
public class ApiTaskTypeResponse {

    private Long apiTaskTypeId;
    private String apiUrl; // yes
    private GLookup httpMethod; // yes

    public ApiTaskTypeResponse() {
    }

    public Long getApiTaskTypeId() {
        return apiTaskTypeId;
    }

    public void setApiTaskTypeId(Long apiTaskTypeId) {
        this.apiTaskTypeId = apiTaskTypeId;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public GLookup getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(GLookup httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
