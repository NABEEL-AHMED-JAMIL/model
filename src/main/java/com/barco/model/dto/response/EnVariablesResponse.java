package com.barco.model.dto.response;

import com.barco.model.dto.request.SessionUser;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnVariablesResponse extends BaseEntity {

    private String envKey;
    private String envValue;
    private String description;
    private SessionUser sessionUser;

    public EnVariablesResponse() {
    }

    public EnVariablesResponse(Long id, String envKey, String envValue, String description) {
        super(id);
        this.envKey = envKey;
        this.envValue = envValue;
        this.description = description;
    }

    public String getEnvKey() {
        return envKey;
    }

    public void setEnvKey(String envKey) {
        this.envKey = envKey;
    }

    public String getEnvValue() {
        return envValue;
    }

    public void setEnvValue(String envValue) {
        this.envValue = envValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
