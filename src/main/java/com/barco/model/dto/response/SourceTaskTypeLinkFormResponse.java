package com.barco.model.dto.response;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTaskTypeLinkFormResponse extends BaseEntity {

    private String formName;
    private GLookup formType;
    private Boolean linkStatus;
    private Long sttLinkForm;

    public SourceTaskTypeLinkFormResponse() {
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

    public Long getSttLinkForm() {
        return sttLinkForm;
    }

    public void setSttLinkForm(Long sttLinkForm) {
        this.sttLinkForm = sttLinkForm;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
