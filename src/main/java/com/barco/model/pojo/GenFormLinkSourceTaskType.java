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
@Table(name = "sttf_link_stt")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenFormLinkSourceTaskType extends BaseEntity {

    @Column(name = "form_order", nullable = false)
    private Long formOrder;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "form_id", nullable = false)
    private GenForm genForm;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "stt_id", nullable = false)
    private SourceTaskType sourceTaskType;

    @OneToMany(mappedBy = "genSection", fetch = FetchType.LAZY)
    private List<GenSectionLinkGenForm> genSectionLinkGenForms;

    public GenFormLinkSourceTaskType() {
    }

    public Long getFormOrder() {
        return formOrder;
    }

    public void setFormOrder(Long formOrder) {
        this.formOrder = formOrder;
    }

    public GenForm getGenForm() {
        return genForm;
    }

    public void setGenForm(GenForm genForm) {
        this.genForm = genForm;
    }

    public SourceTaskType getSourceTaskType() {
        return sourceTaskType;
    }

    public void setSourceTaskType(SourceTaskType sourceTaskType) {
        this.sourceTaskType = sourceTaskType;
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
