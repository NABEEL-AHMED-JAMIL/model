package com.barco.model.pojo;

import com.barco.model.util.lookup.COMPARISON_OPERATORS;
import com.barco.model.util.lookup.DYNAMIC_CONDITION;
import com.barco.model.util.lookup.LOGICAL_OPERATORS;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "case_condition")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaseCondition extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "dynamic_condition")
    @Enumerated(EnumType.ORDINAL)
    private DYNAMIC_CONDITION dynamicCondition;

    @Column(name = "logical_operators")
    @Enumerated(EnumType.ORDINAL)
    private LOGICAL_OPERATORS logicalOperators;

    @Column(name = "comparison_operators")
    @Enumerated(EnumType.ORDINAL)
    private COMPARISON_OPERATORS comparisonOperators;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private GenSection genSection;

    @ManyToOne
    @JoinColumn(name = "control_id")
    private GenControl genControl;

    @Column(name = "case_value")
    private String caseValue;

    public CaseCondition() {
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

    public DYNAMIC_CONDITION getDynamicCondition() {
        return dynamicCondition;
    }

    public void setDynamicCondition(DYNAMIC_CONDITION dynamicCondition) {
        this.dynamicCondition = dynamicCondition;
    }

    public LOGICAL_OPERATORS getLogicalOperators() {
        return logicalOperators;
    }

    public void setLogicalOperators(LOGICAL_OPERATORS logicalOperators) {
        this.logicalOperators = logicalOperators;
    }

    public COMPARISON_OPERATORS getComparisonOperators() {
        return comparisonOperators;
    }

    public void setComparisonOperators(COMPARISON_OPERATORS comparisonOperators) {
        this.comparisonOperators = comparisonOperators;
    }

    public GenSection getGenSection() {
        return genSection;
    }

    public void setGenSection(GenSection genSection) {
        this.genSection = genSection;
    }

    public GenControl getGenControl() {
        return genControl;
    }

    public void setGenControl(GenControl genControl) {
        this.genControl = genControl;
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
