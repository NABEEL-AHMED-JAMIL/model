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
public class ControlResponse extends BaseEntity {

    private String controlName;
    private String description;
    private GLookup fieldType;
    private String fieldTitle;
    private String fieldName;
    private String placeHolder;
    private Long minLength;
    private Long maxLength;
    private String fieldLkValue;
    private String apiLkValue;
    private GLookup mandatory;
    private GLookup isDefault;
    private String defaultValue;
    private String pattern;
    private Long totalSection;

    public ControlResponse() {
    }

    public String getControlName() {
        return controlName;
    }

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GLookup getFieldType() {
        return fieldType;
    }

    public void setFieldType(GLookup fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldTitle() {
        return fieldTitle;
    }

    public void setFieldTitle(String fieldTitle) {
        this.fieldTitle = fieldTitle;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public Long getMinLength() {
        return minLength;
    }

    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    public Long getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    public String getFieldLkValue() {
        return fieldLkValue;
    }

    public void setFieldLkValue(String fieldLkValue) {
        this.fieldLkValue = fieldLkValue;
    }

    public String getApiLkValue() {
        return apiLkValue;
    }

    public void setApiLkValue(String apiLkValue) {
        this.apiLkValue = apiLkValue;
    }

    public GLookup getMandatory() {
        return mandatory;
    }

    public void setMandatory(GLookup mandatory) {
        this.mandatory = mandatory;
    }

    public GLookup getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(GLookup isDefault) {
        this.isDefault = isDefault;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Long getTotalSection() {
        return totalSection;
    }

    public void setTotalSection(Long totalSection) {
        this.totalSection = totalSection;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
