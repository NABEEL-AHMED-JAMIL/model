package com.barco.model.dto.response;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormResponse extends BaseEntity {

    private String formName;
    private String description;
    private GLookup homePage;
    private ReportSettingResponse report;
    private DashboardSettingResponse dashboard;
    private String serviceId;
    private GLookup formType;
    private Long totalSection;
    private Long totalStt;

    public FormResponse() {
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

    public GLookup getHomePage() {
        return homePage;
    }

    public void setHomePage(GLookup homePage) {
        this.homePage = homePage;
    }

    public ReportSettingResponse getReport() {
        return report;
    }

    public void setReport(ReportSettingResponse report) {
        this.report = report;
    }

    public DashboardSettingResponse getDashboard() {
        return dashboard;
    }

    public void setDashboard(DashboardSettingResponse dashboard) {
        this.dashboard = dashboard;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public GLookup getFormType() {
        return formType;
    }

    public void setFormType(GLookup formType) {
        this.formType = formType;
    }

    public Long getTotalSection() {
        return totalSection;
    }

    public void setTotalSection(Long totalSection) {
        this.totalSection = totalSection;
    }

    public Long getTotalStt() {
        return totalStt;
    }

    public void setTotalStt(Long totalStt) {
        this.totalStt = totalStt;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
