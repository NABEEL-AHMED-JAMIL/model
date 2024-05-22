package com.barco.model.dto.dform.response;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.Map;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormData {

    private int id;
    private String name;
    private Map<String, Section> sections;

    public FormData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Section> getSections() {
        return sections;
    }

    @JsonAnySetter
    public void setSections(Map<String, Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
