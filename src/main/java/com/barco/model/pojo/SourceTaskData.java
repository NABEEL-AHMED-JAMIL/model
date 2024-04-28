package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

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

    @Column(name = "text_value")
    private String textValue;

    @Column(name = "numeric_value")
    private Integer numericValue;

    @Column(name = "date_value")
    private Date dateValue;

    @Column(name = "time_value")
    private Time timeValue;

    @Column(name = "timestamp_value")
    private Timestamp dateTimeValue;

    @Column(name = "checkbox_value")
    private Boolean checkBoxValue;

    // can be used for both single and multi
    @Column(name = "select_value")
    private Long selectValue;

    @Column(name = "rich_text_value")
    private String richTextValue;

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

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public Integer getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(Integer numericValue) {
        this.numericValue = numericValue;
    }

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    public Time getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(Time timeValue) {
        this.timeValue = timeValue;
    }

    public Timestamp getDateTimeValue() {
        return dateTimeValue;
    }

    public void setDateTimeValue(Timestamp dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }

    public Boolean getCheckBoxValue() {
        return checkBoxValue;
    }

    public void setCheckBoxValue(Boolean checkBoxValue) {
        this.checkBoxValue = checkBoxValue;
    }

    public Long getSelectValue() {
        return selectValue;
    }

    public void setSelectValue(Long selectValue) {
        this.selectValue = selectValue;
    }

    public String getRichTextValue() {
        return richTextValue;
    }

    public void setRichTextValue(String richTextValue) {
        this.richTextValue = richTextValue;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
