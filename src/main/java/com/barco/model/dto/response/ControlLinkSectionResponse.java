package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import javax.persistence.Column;

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
    private String disabledPattern;
    private String visiblePattern;
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

    public String getDisabledPattern() {
        return disabledPattern;
    }

    public void setDisabledPattern(String disabledPattern) {
        this.disabledPattern = disabledPattern;
    }

    public String getVisiblePattern() {
        return visiblePattern;
    }

    public void setVisiblePattern(String visiblePattern) {
        this.visiblePattern = visiblePattern;
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
