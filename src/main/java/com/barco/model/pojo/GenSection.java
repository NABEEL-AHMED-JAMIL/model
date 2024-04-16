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
@Table(name = "gen_section")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenSection extends BaseEntity {

    @Column(name = "section_name")
    private String sectionName;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy="genSection")
    private List<GenSectionLinkGenForm> genSectionLinkGenForms;

    public GenSection() {}

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<GenSectionLinkGenForm> getGenSectionLinkGenForms() {
        return genSectionLinkGenForms;
    }

    public void setGenSectionLinkGenForms(List<GenSectionLinkGenForm> genSectionLinkGenForms) {
        this.genSectionLinkGenForms = genSectionLinkGenForms;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}