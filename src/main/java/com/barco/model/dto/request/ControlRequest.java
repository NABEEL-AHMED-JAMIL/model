package com.barco.model.dto.request;

import com.barco.model.enums.ACTION;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControlRequest extends RequestFilter {

    private Long id;
    private String controlName;
    private String description;
    private Long fieldType;
    private String fieldTitle;
    private String fieldName;
    private String placeHolder;
    private Long minLength;
    private Long maxLength;
    private String fieldLkValue;
    private String apiLkValue;
    private Long mandatory;
    private Long isDefault;
    private String defaultValue;
    private String pattern;
    private Long status;
    private SessionUser sessionUser;
    //
    private ACTION action; // delete|insert
    private List<Long> sectionId;
    private List<Long> controlLinkSection;
    private Long fieldWidth;
    private Long controlOrder;

    public ControlRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getFieldType() {
        return fieldType;
    }

    public void setFieldType(Long fieldType) {
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

    public Long getMandatory() {
        return mandatory;
    }

    public void setMandatory(Long mandatory) {
        this.mandatory = mandatory;
    }

    public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Long isDefault) {
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

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }

    public ACTION getAction() {
        return action;
    }

    public void setAction(ACTION action) {
        this.action = action;
    }

    public List<Long> getSectionId() {
        return sectionId;
    }

    public void setSectionId(List<Long> sectionId) {
        this.sectionId = sectionId;
    }

    public List<Long> getControlLinkSection() {
        return controlLinkSection;
    }

    public void setControlLinkSection(List<Long> controlLinkSection) {
        this.controlLinkSection = controlLinkSection;
    }

    public Long getFieldWidth() {
        return fieldWidth;
    }

    public void setFieldWidth(Long fieldWidth) {
        this.fieldWidth = fieldWidth;
    }

    public Long getControlOrder() {
        return controlOrder;
    }

    public void setControlOrder(Long controlOrder) {
        this.controlOrder = controlOrder;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
