package com.barco.model.dto.dform.data;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.text.Normalizer;
import java.util.HashMap;
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

    public static void main(String[] args) {
        FormData formData = new FormData();
        formData.setId(123);
        formData.setName("Nabeel");
        Map<String, Section> secion = new HashMap<>();
        secion.put("section1", getSection());
        secion.put("section2", getSection());
        secion.put("section3", getSection());
        formData.setSections(secion);
        System.out.println(formData);
    }

    public static Section getSection() {
        Section section = new Section();
        section.setId(11);
        section.setName("asdfa");
        return section;
    }
}
