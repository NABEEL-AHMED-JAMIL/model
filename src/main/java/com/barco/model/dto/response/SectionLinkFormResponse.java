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
public class SectionLinkFormResponse extends BaseEntity {

    private String formName;
    private GLookup formType;
    private Boolean linkStatus;
    private Long sectionOrder;
    private Long sectionLinkForm;

    public SectionLinkFormResponse() {
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public GLookup getFormType() {
        return formType;
    }

    public void setFormType(GLookup formType) {
        this.formType = formType;
    }

    public Boolean getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(Boolean linkStatus) {
        this.linkStatus = linkStatus;
    }

    public Long getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(Long sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    public Long getSectionLinkForm() {
        return sectionLinkForm;
    }

    public void setSectionLinkForm(Long sectionLinkForm) {
        this.sectionLinkForm = sectionLinkForm;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
