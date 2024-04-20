package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormLinkSectionResponse extends BaseEntity {

    private String sectionName;
    private String description;
    private Boolean linkStatus;
    private Long sectionOrder;
    private Long formLinkSection;

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

    public Long getFormLinkSection() {
        return formLinkSection;
    }

    public void setFormLinkSection(Long formLinkSection) {
        this.formLinkSection = formLinkSection;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
