package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControlLinkSectionResponse extends BaseEntity {

    private String sectionName;
    private String description;
    private Boolean linkedControl;
    private Long linkSectionId;
    private Long fieldWidth;
    private Long controlOrder;

    public ControlLinkSectionResponse() {
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

    public Boolean getLinkedControl() {
        return linkedControl;
    }

    public void setLinkedControl(Boolean linkedControl) {
        this.linkedControl = linkedControl;
    }

    public Long getLinkSectionId() {
        return linkSectionId;
    }

    public void setLinkSectionId(Long linkSectionId) {
        this.linkSectionId = linkSectionId;
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
