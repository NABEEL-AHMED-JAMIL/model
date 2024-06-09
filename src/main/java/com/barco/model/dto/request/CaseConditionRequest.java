package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaseConditionRequest {

    private Long id;
    private String name;
    private String description;
    private Long dynamicCondition;
    private Long logicalOperators;
    private Long comparisonOperators;
    private SectionRequest section;
    private ControlRequest control;
    private Long status;
    private String caseValue;

    public CaseConditionRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDynamicCondition() {
        return dynamicCondition;
    }

    public void setDynamicCondition(Long dynamicCondition) {
        this.dynamicCondition = dynamicCondition;
    }

    public Long getLogicalOperators() {
        return logicalOperators;
    }

    public void setLogicalOperators(Long logicalOperators) {
        this.logicalOperators = logicalOperators;
    }

    public Long getComparisonOperators() {
        return comparisonOperators;
    }

    public void setComparisonOperators(Long comparisonOperators) {
        this.comparisonOperators = comparisonOperators;
    }

    public SectionRequest getSection() {
        return section;
    }

    public void setSection(SectionRequest section) {
        this.section = section;
    }

    public ControlRequest getControl() {
        return control;
    }

    public void setControl(ControlRequest control) {
        this.control = control;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getCaseValue() {
        return caseValue;
    }

    public void setCaseValue(String caseValue) {
        this.caseValue = caseValue;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
