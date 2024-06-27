package com.barco.model.dto.request;

import com.barco.model.enums.ACTION;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionRequest extends RequestFilter {

    private Long id;
    private String sectionName;
    private String description;
    private Long status;
    private SessionUser sessionUser;
    //
    private ACTION action; // delete|insert
    private List<Long> controlId;
    private List<Long> sectionLinkControl;
    private Long controlOrder;
    private Long fieldWidth;
    //
    private List<Long> formId;
    private List<Long> sectionLinkForm;
    private Long sectionOrder;

    public SectionRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public ACTION getAction() {
        return action;
    }

    public void setAction(ACTION action) {
        this.action = action;
    }

    public List<Long> getControlId() {
        return controlId;
    }

    public void setControlId(List<Long> controlId) {
        this.controlId = controlId;
    }

    public List<Long> getSectionLinkControl() {
        return sectionLinkControl;
    }

    public void setSectionLinkControl(List<Long> sectionLinkControl) {
        this.sectionLinkControl = sectionLinkControl;
    }

    public Long getControlOrder() {
        return controlOrder;
    }

    public void setControlOrder(Long controlOrder) {
        this.controlOrder = controlOrder;
    }

    public Long getFieldWidth() {
        return fieldWidth;
    }

    public void setFieldWidth(Long fieldWidth) {
        this.fieldWidth = fieldWidth;
    }

    public List<Long> getFormId() {
        return formId;
    }

    public void setFormId(List<Long> formId) {
        this.formId = formId;
    }

    public List<Long> getSectionLinkForm() {
        return sectionLinkForm;
    }

    public void setSectionLinkForm(List<Long> sectionLinkForm) {
        this.sectionLinkForm = sectionLinkForm;
    }

    public Long getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(Long sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }
}
