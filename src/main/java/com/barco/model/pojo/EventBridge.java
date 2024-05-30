package com.barco.model.pojo;

import com.barco.model.util.lookup.EVENT_BRIDGE_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "event_bridge")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventBridge extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "bridge_url", nullable = false)
    private String bridgeUrl;

    @Column(name = "description", nullable = false)
    private String description;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "bridge_type", nullable = false)
    private EVENT_BRIDGE_TYPE bridgeType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credential_id")
    private Credential credential;

    @OneToMany(mappedBy = "eventBridge",
        fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AppUserEventBridge> appUserEventBridges;

    @OneToMany(mappedBy = "pdfBridge", fetch = FetchType.LAZY)
    private List<ReportSetting> reportPdfBridgeSettings;

    @OneToMany(mappedBy = "xlsxBridge", fetch = FetchType.LAZY)
    private List<ReportSetting> reportXlsxBridgeSettings;

    @OneToMany(mappedBy = "csvBridge", fetch = FetchType.LAZY)
    private List<ReportSetting> reportCsvBridgeSettings;

    @OneToMany(mappedBy = "dataBridge", fetch = FetchType.LAZY)
    private List<ReportSetting> reportDataBridgeSettings;

    @OneToMany(mappedBy = "firstDimensionBridge", fetch = FetchType.LAZY)
    private List<ReportSetting> reportFistDimBridgeSettings;

    @OneToMany(mappedBy = "secondDimensionBridge", fetch = FetchType.LAZY)
    private List<ReportSetting> reportSecDimBridgeSettings;

    public EventBridge() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBridgeUrl() {
        return bridgeUrl;
    }

    public void setBridgeUrl(String bridgeUrl) {
        this.bridgeUrl = bridgeUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EVENT_BRIDGE_TYPE getBridgeType() {
        return bridgeType;
    }

    public void setBridgeType(EVENT_BRIDGE_TYPE bridgeType) {
        this.bridgeType = bridgeType;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public List<AppUserEventBridge> getAppUserEventBridges() {
        return appUserEventBridges;
    }

    public void setAppUserEventBridges(List<AppUserEventBridge> appUserEventBridges) {
        this.appUserEventBridges = appUserEventBridges;
    }

    public List<ReportSetting> getReportPdfBridgeSettings() {
        return reportPdfBridgeSettings;
    }

    public void setReportPdfBridgeSettings(List<ReportSetting> reportPdfBridgeSettings) {
        this.reportPdfBridgeSettings = reportPdfBridgeSettings;
    }

    public List<ReportSetting> getReportXlsxBridgeSettings() {
        return reportXlsxBridgeSettings;
    }

    public void setReportXlsxBridgeSettings(List<ReportSetting> reportXlsxBridgeSettings) {
        this.reportXlsxBridgeSettings = reportXlsxBridgeSettings;
    }

    public List<ReportSetting> getReportCsvBridgeSettings() {
        return reportCsvBridgeSettings;
    }

    public void setReportCsvBridgeSettings(List<ReportSetting> reportCsvBridgeSettings) {
        this.reportCsvBridgeSettings = reportCsvBridgeSettings;
    }

    public List<ReportSetting> getReportDataBridgeSettings() {
        return reportDataBridgeSettings;
    }

    public void setReportDataBridgeSettings(List<ReportSetting> reportDataBridgeSettings) {
        this.reportDataBridgeSettings = reportDataBridgeSettings;
    }

    public List<ReportSetting> getReportFistDimBridgeSettings() {
        return reportFistDimBridgeSettings;
    }

    public void setReportFistDimBridgeSettings(List<ReportSetting> reportFistDimBridgeSettings) {
        this.reportFistDimBridgeSettings = reportFistDimBridgeSettings;
    }

    public List<ReportSetting> getReportSecDimBridgeSettings() {
        return reportSecDimBridgeSettings;
    }

    public void setReportSecDimBridgeSettings(List<ReportSetting> reportSecDimBridgeSettings) {
        this.reportSecDimBridgeSettings = reportSecDimBridgeSettings;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
