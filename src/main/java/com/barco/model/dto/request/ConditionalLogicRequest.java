package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalLogicRequest {

    private List<CaseConditionRequest> caseConditions;
    private List<ThenConditionRequest> thenConditions;

    public ConditionalLogicRequest() {
    }

    public List<CaseConditionRequest> getCaseConditions() {
        return caseConditions;
    }

    public void setCaseConditions(List<CaseConditionRequest> caseConditions) {
        this.caseConditions = caseConditions;
    }

    public List<ThenConditionRequest> getThenConditions() {
        return thenConditions;
    }

    public void setThenConditions(List<ThenConditionRequest> thenConditions) {
        this.thenConditions = thenConditions;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
