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
public class SectionLinkControlResponse extends BaseEntity {

    private String controlName;
    private GLookup fieldType;
    private Long controlOrder;
    private Long  fieldWidth;
    private Boolean linkedSection;
    private Long linkControlId;

    public SectionLinkControlResponse() {
    }

    public String getControlName() {
        return controlName;
    }

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    public GLookup getFieldType() {
        return fieldType;
    }

    public void setFieldType(GLookup fieldType) {
        this.fieldType = fieldType;
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

    public Boolean getLinkedSection() {
        return linkedSection;
    }

    public void setLinkedSection(Boolean linkedSection) {
        this.linkedSection = linkedSection;
    }

    public Long getLinkControlId() {
        return linkControlId;
    }

    public void setLinkControlId(Long linkControlId) {
        this.linkControlId = linkControlId;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
