package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTaskRequest extends RequestFilter {

    private String taskName;
    private STTRequest sourceTaskType;
    private FormRequest formRequest;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
