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
@Table(name = "gs_link_gf")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenSectionLinkGenForm extends BaseEntity {

    @Column(name = "section_order")
    private Long sectionOrder;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "section_id", nullable = false)
    private GenSection genSection;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "form_id", nullable = false)
    private GenForm genForm;

    @OneToMany(mappedBy = "genControl", fetch = FetchType.LAZY)
    private List<GenControlLinkGenSection> genControlLinkGenSections;

    public GenSectionLinkGenForm() {
    }

    public Long getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(Long sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    public GenSection getGenSection() {
        return genSection;
    }

    public void setGenSection(GenSection genSection) {
        this.genSection = genSection;
    }

    public GenForm getGenForm() {
        return genForm;
    }

    public void setGenForm(GenForm genForm) {
        this.genForm = genForm;
    }

    public List<GenControlLinkGenSection> getGenControlLinkGenSections() {
        return genControlLinkGenSections;
    }

    public void setGenControlLinkGenSections(List<GenControlLinkGenSection> genControlLinkGenSections) {
        this.genControlLinkGenSections = genControlLinkGenSections;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
