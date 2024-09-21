package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThenConditionRequest {

    private Long id;
    private String uuid;
    private String name;
    private String description;
    private SectionRequest section;
    private ControlRequest control;
    private Long status;
    private Boolean action;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
