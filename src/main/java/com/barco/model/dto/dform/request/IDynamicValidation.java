package com.barco.model.dto.dform.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IDynamicValidation {

    private String validator;
    private String message;
    private String pattern;

    public IDynamicValidation() {
    }

    public IDynamicValidation(String validator,
        String message) {
        this.validator = validator;
        this.message = message;
    }

    public IDynamicValidation(String validator,
        String message, String pattern) {
        this.validator = validator;
        this.message = message;
        this.pattern = pattern;
    }

    public String getValidator() {
        return validator;
    }

    public void setValidator(String validator) {
        this.validator = validator;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
