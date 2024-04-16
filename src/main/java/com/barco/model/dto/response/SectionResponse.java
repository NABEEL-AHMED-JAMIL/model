package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionResponse extends BaseEntity {

    private String sectionName;
    private String description;
    private Long totalControl;
    private Long totalForm;

    public SectionResponse() {
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

    public Long getTotalControl() {
        return totalControl;
    }

    public void setTotalControl(Long totalControl) {
        this.totalControl = totalControl;
    }

    public Long getTotalForm() {
        return totalForm;
    }

    public void setTotalForm(Long totalForm) {
        this.totalForm = totalForm;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
