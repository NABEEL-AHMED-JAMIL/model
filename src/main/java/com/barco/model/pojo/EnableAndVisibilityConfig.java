package com.barco.model.pojo;

import com.barco.model.util.lookup.CONDITION_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */

@Entity
@Table(name = "enable_visible_config")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnableAndVisibilityConfig extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "condition_type")
    @Enumerated(EnumType.ORDINAL)
    private CONDITION_TYPE conditionType;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "enable_id")
    private List<ConditionalLogic> enableLogic;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "visible_id")
    private List<ConditionalLogic> visibleLogic;

    @OneToMany(mappedBy="enableAbility")
    private List<GenForm> genForms;

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

    public CONDITION_TYPE getConditionType() {
        return conditionType;
    }

    public void setConditionType(CONDITION_TYPE conditionType) {
        this.conditionType = conditionType;
    }

    public List<ConditionalLogic> getEnableLogic() {
        return enableLogic;
    }

    public void setEnableLogic(List<ConditionalLogic> enableLogic) {
        this.enableLogic = enableLogic;
    }

    public List<ConditionalLogic> getVisibleLogic() {
        return visibleLogic;
    }

    public void setVisibleLogic(List<ConditionalLogic> visibleLogic) {
        this.visibleLogic = visibleLogic;
    }

    public List<GenForm> getGenForms() {
        return genForms;
    }

    public void setGenForms(List<GenForm> genForms) {
        this.genForms = genForms;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
