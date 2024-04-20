package com.barco.model.dto.request;

import com.barco.model.util.lookup.ACTION;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormRequest extends RequestFilter {

    private Long id;
    private String formName;
    private String description;
    private String homePage;
    private String serviceId;
    private Long formType;
    private Long status;
    private SessionUser sessionUser;
    //
    private ACTION action; // delete|insert
    private List<Long> sectionId;
    private List<Long> formLinkSection;
    private Long sectionOrder;

    public FormRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Long getFormType() {
        return formType;
    }

    public void setFormType(Long formType) {
        this.formType = formType;
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

    public List<Long> getFormLinkSection() {
        return formLinkSection;
    }

    public void setFormLinkSection(List<Long> formLinkSection) {
        this.formLinkSection = formLinkSection;
    }

    public Long getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(Long sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
