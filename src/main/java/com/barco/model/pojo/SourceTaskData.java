package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "source_task_data")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTaskData extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "task_id")
    private SourceTask sourceTask;

    @ManyToOne
    @JoinColumn(name = "gf_link_stt_id")
    private GenFormLinkSourceTaskType genFormLinkSourceTaskType;

    @ManyToOne
    @JoinColumn(name = "gs_link_gf_id")
    private GenSectionLinkGenForm genSectionLinkGenForm;

    @ManyToOne
    @JoinColumn(name = "gc_link_gs_id")
    private GenControlLinkGenSection genControlLinkGenSection;

    @Lob
    @Column(name = "value", nullable = false)
    private String value;

    public SourceTaskData() {
    }

    public SourceTask getSourceTask() {
        return sourceTask;
    }

    public void setSourceTask(SourceTask sourceTask) {
        this.sourceTask = sourceTask;
    }

    public GenFormLinkSourceTaskType getGenFormLinkSourceTaskType() {
        return genFormLinkSourceTaskType;
    }

    public void setGenFormLinkSourceTaskType(GenFormLinkSourceTaskType genFormLinkSourceTaskType) {
        this.genFormLinkSourceTaskType = genFormLinkSourceTaskType;
    }

    public GenSectionLinkGenForm getGenSectionLinkGenForm() {
        return genSectionLinkGenForm;
    }

    public void setGenSectionLinkGenForm(GenSectionLinkGenForm genSectionLinkGenForm) {
        this.genSectionLinkGenForm = genSectionLinkGenForm;
    }

    public GenControlLinkGenSection getGenControlLinkGenSection() {
        return genControlLinkGenSection;
    }

    public void setGenControlLinkGenSection(GenControlLinkGenSection genControlLinkGenSection) {
        this.genControlLinkGenSection = genControlLinkGenSection;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
