package com.barco.model.pojo;

import com.barco.model.util.lookup.FORM_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "gen_form")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenForm extends BaseEntity {

    @Column(name = "form_name", nullable = false)
    private String formName;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "home_page")
    private LookupData homePage;

    @Column(name = "service_id")
    private String serviceId;

    @Column(name = "form_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private FORM_TYPE formType;

    @OneToMany(mappedBy="genForm")
    private List<GenSectionLinkGenForm> genSectionLinkGenForms;

    @OneToMany(mappedBy="genForm")
    private List<GenFormLinkSourceTaskType> genFormLinkSourceTaskTypes;

    @OneToMany(mappedBy="genForm")
    private List<ReportSetting> reportSettings;

    @OneToMany(mappedBy = "sourceTaskType", fetch = FetchType.LAZY)
    private List<SourceTask> sourceTasks;

    @OneToMany(mappedBy = "sourceTask", fetch = FetchType.LAZY)
    private List<SourceTaskData> sourceTaskData;

    @ManyToOne
    @JoinColumn(name = "enable_id")
    private EnableAbilityConfig enableAbility;

    @ManyToOne
    @JoinColumn(name = "visible_id")
    private VisibilityConfig visibility;

    public GenForm() {
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LookupData getHomePage() {
        return homePage;
    }

    public void setHomePage(LookupData homePage) {
        this.homePage = homePage;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public FORM_TYPE getFormType() {
        return formType;
    }

    public void setFormType(FORM_TYPE formType) {
        this.formType = formType;
    }

    public List<GenSectionLinkGenForm> getGenSectionLinkGenForms() {
        return genSectionLinkGenForms;
    }

    public void setGenSectionLinkGenForms(List<GenSectionLinkGenForm> genSectionLinkGenForms) {
        this.genSectionLinkGenForms = genSectionLinkGenForms;
    }

    public List<GenFormLinkSourceTaskType> getGenFormLinkSourceTaskTypes() {
        return genFormLinkSourceTaskTypes;
    }

    public void setGenFormLinkSourceTaskTypes(List<GenFormLinkSourceTaskType> genFormLinkSourceTaskTypes) {
        this.genFormLinkSourceTaskTypes = genFormLinkSourceTaskTypes;
    }

    public List<ReportSetting> getReportSettings() {
        return reportSettings;
    }

    public void setReportSettings(List<ReportSetting> reportSettings) {
        this.reportSettings = reportSettings;
    }

    public List<SourceTask> getSourceTasks() {
        return sourceTasks;
    }

    public void setSourceTasks(List<SourceTask> sourceTasks) {
        this.sourceTasks = sourceTasks;
    }

    public List<SourceTaskData> getSourceTaskData() {
        return sourceTaskData;
    }

    public void setSourceTaskData(List<SourceTaskData> sourceTaskData) {
        this.sourceTaskData = sourceTaskData;
    }

    public EnableAbilityConfig getEnableAbility() {
        return enableAbility;
    }

    public void setEnableAbility(EnableAbilityConfig enableAbility) {
        this.enableAbility = enableAbility;
    }

    public VisibilityConfig getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityConfig visibility) {
        this.visibility = visibility;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
