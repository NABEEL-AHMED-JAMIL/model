package com.barco.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Nabeel.amd
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationDecorator {

    private Set<String> errors = new HashSet<String>();
    private Map<String, String> info = new HashMap<String, String>();
    private Map<String, Object>	responseMap	= new HashMap<String, Object>();
    private String responseMessage = null;
    private Object dataBean;
    private String queryTime = "";
    private String apiRequestName = "";
    private Integer	returnCode;
    private String success = "SUCCESS";
    private String failure = "FAILURE";
    private String apiName;

    public ApplicationDecorator() { }

    public Set<String> getErrors() { return errors; }
    public void setErrors(Set<String> errors) { this.errors = errors; }

    public Map<String, String> getInfo() { return info; }
    public void setInfo(Map<String, String> info) { this.info = info; }

    public Map<String, Object> getResponseMap() { return responseMap; }
    public void setResponseMap(Map<String, Object> responseMap) { this.responseMap = responseMap; }

    public String getResponseMessage() { return responseMessage; }
    public void setResponseMessage(String responseMessage) { this.responseMessage = responseMessage; }

    public Object getDataBean() { return dataBean; }
    public void setDataBean(Object dataBean) { this.dataBean = dataBean; }

    public String getQueryTime() { return queryTime; }
    public void setQueryTime(String queryTime) { this.queryTime = queryTime; }

    public String getApiRequestName() { return apiRequestName; }
    public void setApiRequestName(String apiRequestName) { this.apiRequestName = apiRequestName; }

    public Integer getReturnCode() { return returnCode; }
    public void setReturnCode(Integer returnCode) { this.returnCode = returnCode; }

    public String getSuccess() { return success; }
    public void setSuccess(String success) { this.success = success; }

    public String getFailure() { return failure; }
    public void setFailure(String failure) { this.failure = failure; }

    public String getApiName() { return apiName; }
    public void setApiName(String apiName) { this.apiName = apiName; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
