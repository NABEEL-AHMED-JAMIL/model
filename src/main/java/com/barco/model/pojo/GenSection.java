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

    @OneToMany(mappedBy="genSection", fetch = FetchType.LAZY)
    private List<GenSectionLinkGenForm> genSectionLinkGenForms;

    @OneToMany(mappedBy="genSection", fetch = FetchType.LAZY)
    private List<GenControlLinkGenSection> genControlLinkGenSections;

    @OneToMany(mappedBy = "sourceTask", fetch = FetchType.LAZY)
    private List<SourceTaskData> sourceTaskData;

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

    public List<GenControlLinkGenSection> getGenControlLinkGenSections() {
        return genControlLinkGenSections;
    }

    public void setGenControlLinkGenSections(List<GenControlLinkGenSection> genControlLinkGenSections) {
        this.genControlLinkGenSections = genControlLinkGenSections;
    }

    public List<SourceTaskData> getSourceTaskData() {
        return sourceTaskData;
    }

    public void setSourceTaskData(List<SourceTaskData> sourceTaskData) {
        this.sourceTaskData = sourceTaskData;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}