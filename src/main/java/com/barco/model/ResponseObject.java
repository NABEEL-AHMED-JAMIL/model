package com.barco.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.Map;

/**
 * @author Nabeel.amd
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseObject {

    private String returnType = "";
    private Integer returnCode = 0;
    private String returnMessage = "";
    private Map<?,?> returnData;
    private String queryTimeInMilli	= "";

    public ResponseObject() { }

    public String getReturnType() { return returnType; }
    public void setReturnType(String returnType) { this.returnType = returnType; }

    public Integer getReturnCode() { return returnCode; }
    public void setReturnCode(Integer returnCode) { this.returnCode = returnCode; }

    public String getReturnMessage() { return returnMessage; }
    public void setReturnMessage(String returnMessage) { this.returnMessage = returnMessage; }

    public Map<?, ?> getReturnData() { return returnData; }
    public void setReturnData(Map<?, ?> returnData) { this.returnData = returnData; }

    public String getQueryTimeInMilli() { return queryTimeInMilli; }
    public void setQueryTimeInMilli(String queryTimeInMilli) { this.queryTimeInMilli = queryTimeInMilli; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
