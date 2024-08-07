package com.barco.model.pojo;

import com.barco.model.util.lookup.UI_LOOKUP;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "lookup_data")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LookupData extends BaseEntity {

    @Column(name = "lookup_type", unique = true)
    private String lookupType;

    @Column(name = "lookup_code")
    private Long lookupCode;

    @Column(name = "lookup_value",
        columnDefinition = "text")
    private String lookupValue;

    @Column(name = "description",
        columnDefinition = "text")
    private String description;

    @ManyToOne
    @JoinColumn(name = "parent_lookup_id")
    protected LookupData parentLookup;

    @OneToMany(mappedBy = "parentLookup", fetch = FetchType.LAZY)
    protected Set<LookupData> lookupChildren;

    @Column(name = "ui_lookup")
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP uiLookup;

    @OneToMany(mappedBy = "groupType", fetch = FetchType.LAZY)
    private List<DashboardSetting> dashboardSettings;

    @OneToMany(mappedBy = "groupType", fetch = FetchType.LAZY)
    private List<ReportSetting> reportSettings;

    @OneToMany(mappedBy = "homePage", fetch = FetchType.LAZY)
    private List<GenForm> genForms;

    @OneToMany(mappedBy = "fieldLkValue", fetch = FetchType.LAZY)
    private List<GenControl> genControls;

    public LookupData() { }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getLookupValue() {
        return lookupValue;
    }

    public void setLookupValue(String lookupValue) {
        this.lookupValue = lookupValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LookupData getParentLookup() {
        return parentLookup;
    }

    public void setParentLookup(LookupData parentLookup) {
        this.parentLookup = parentLookup;
    }

    public Set<LookupData> getLookupChildren() {
        return lookupChildren;
    }

    public void setLookupChildren(Set<LookupData> lookupChildren) {
        this.lookupChildren = lookupChildren;
    }

    public UI_LOOKUP getUiLookup() {
        return uiLookup;
    }

    public void setUiLookup(UI_LOOKUP uiLookup) {
        this.uiLookup = uiLookup;
    }

    public List<DashboardSetting> getDashboardSettings() {
        return dashboardSettings;
    }

    public void setDashboardSettings(List<DashboardSetting> dashboardSettings) {
        this.dashboardSettings = dashboardSettings;
    }

    public List<ReportSetting> getReportSettings() {
        return reportSettings;
    }

    public void setReportSettings(List<ReportSetting> reportSettings) {
        this.reportSettings = reportSettings;
    }

    public List<GenForm> getGenForms() {
        return genForms;
    }

    public void setGenForms(List<GenForm> genForms) {
        this.genForms = genForms;
    }

    public List<GenControl> getGenControls() {
        return genControls;
    }

    public void setGenControls(List<GenControl> genControls) {
        this.genControls = genControls;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}