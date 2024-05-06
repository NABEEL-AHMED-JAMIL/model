package com.barco.model.dto.dform;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IDynamicForm {

    private Long id;
    private String name;
    private String description;
    private List<IDynamicSection> sections;

    public IDynamicForm() {
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

    public List<IDynamicSection> getSections() {
        return sections;
    }

    public void setSections(List<IDynamicSection> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
