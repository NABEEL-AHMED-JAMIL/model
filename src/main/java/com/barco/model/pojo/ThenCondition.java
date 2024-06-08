package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "then_condition")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThenCondition extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "section_id", referencedColumnName = "id")
    private GenSection section;

    @ManyToOne
    @JoinColumn(name = "control_id", referencedColumnName = "id")
    private GenControl genControl;

    @Column(name = "action", nullable = false)
    private Boolean action;

    public ThenCondition() {
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

    public GenSection getSection() {
        return section;
    }

    public void setSection(GenSection section) {
        this.section = section;
    }

    public GenControl getGenControl() {
        return genControl;
    }

    public void setGenControl(GenControl genControl) {
        this.genControl = genControl;
    }

    public Boolean getAction() {
        return action;
    }

    public void setAction(Boolean action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
