package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "condition_logic")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalLogic extends BaseEntity {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "case_id")
    private List<CaseCondition> caseConditions;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "then_id")
    private List<ThenCondition> thenConditions;

    public ConditionalLogic() {
    }

    public List<CaseCondition> getCaseConditions() {
        return caseConditions;
    }

    public void setCaseConditions(List<CaseCondition> caseConditions) {
        this.caseConditions = caseConditions;
    }

    public List<ThenCondition> getThenConditions() {
        return thenConditions;
    }

    public void setThenConditions(List<ThenCondition> thenConditions) {
        this.thenConditions = thenConditions;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
