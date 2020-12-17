package com.barco.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessServiceDto {

    private Long id;
    private String serviceName;
    private String internalServiceName;

    public AccessServiceDto() { }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getInternalServiceName() {
        return internalServiceName;
    }
    public void setInternalServiceName(String internalServiceName) {
        this.internalServiceName = internalServiceName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
