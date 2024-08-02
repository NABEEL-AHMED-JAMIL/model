package com.barco.model.pojo;

import com.barco.model.util.lookup.FETCH_LIMIT;
import com.barco.model.util.lookup.PAYLOAD_REF;
import com.barco.model.util.lookup.UI_LOOKUP;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "report_setting")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportSetting extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "data_filter", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP dateFilter;

    @Column(name = "record_report", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP recordReport;

    @Column(name = "fetch_rate", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private FETCH_LIMIT fetchRate;

    @ManyToOne
    @JoinColumn(name = "group_type")
    private LookupData groupType;

    @Column(name = "description",
        columnDefinition = "text",
        nullable = false)
    private String description;

    // if its form ref then have to give the ref of form
    @Column(name = "payload_ref", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private PAYLOAD_REF payloadRef;

    @Column(name = "is_pdf", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isPdf;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pdf_bridge")
    private EventBridge pdfBridge;

    @Column(name = "is_xlsx", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isXlsx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "xlsx_bridge")
    private EventBridge xlsxBridge;

    @Column(name = "is_csv", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isCsv;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "csv_bridge")
    private EventBridge csvBridge;

    @Column(name = "is_data", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isData;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "data_bridge")
    private EventBridge dataBridge;

    @Column(name = "is_fd", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isFirstDimension;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fd_bridge")
    private EventBridge firstDimensionBridge;

    @Column(name = "fd_lkv")
    private String firstDimensionLKValue;

    @Column(name = "is_sd", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isSecondDimension;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sd_bridge")
    private EventBridge secondDimensionBridge;

    @Column(name = "sd_lkv")
    private String secondDimensionLKValue;

    @Column(name = "distinct_lkv")
    private String distinctLKValue;

    // aggregation
    @Column(name = "agg_lkv")
    private String aggLKValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_id")
    private GenForm genForm;

    @OneToMany(mappedBy = "report", fetch = FetchType.LAZY)
    private List<GenForm> genForms;

    public ReportSetting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UI_LOOKUP getDateFilter() {
        return dateFilter;
    }

    public void setDateFilter(UI_LOOKUP dateFilter) {
        this.dateFilter = dateFilter;
    }

    public UI_LOOKUP getRecordReport() {
        return recordReport;
    }

    public void setRecordReport(UI_LOOKUP recordReport) {
        this.recordReport = recordReport;
    }

    public FETCH_LIMIT getFetchRate() {
        return fetchRate;
    }

    public void setFetchRate(FETCH_LIMIT fetchRate) {
        this.fetchRate = fetchRate;
    }

    public LookupData getGroupType() {
        return groupType;
    }

    public void setGroupType(LookupData groupType) {
        this.groupType = groupType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PAYLOAD_REF getPayloadRef() {
        return payloadRef;
    }

    public void setPayloadRef(PAYLOAD_REF payloadRef) {
        this.payloadRef = payloadRef;
    }

    public UI_LOOKUP getIsPdf() {
        return isPdf;
    }

    public void setIsPdf(UI_LOOKUP isPdf) {
        this.isPdf = isPdf;
    }

    public EventBridge getPdfBridge() {
        return pdfBridge;
    }

    public void setPdfBridge(EventBridge pdfBridge) {
        this.pdfBridge = pdfBridge;
    }

    public UI_LOOKUP getIsXlsx() {
        return isXlsx;
    }

    public void setIsXlsx(UI_LOOKUP isXlsx) {
        this.isXlsx = isXlsx;
    }

    public EventBridge getXlsxBridge() {
        return xlsxBridge;
    }

    public void setXlsxBridge(EventBridge xlsxBridge) {
        this.xlsxBridge = xlsxBridge;
    }

    public UI_LOOKUP getIsCsv() {
        return isCsv;
    }

    public void setIsCsv(UI_LOOKUP isCsv) {
        this.isCsv = isCsv;
    }

    public EventBridge getCsvBridge() {
        return csvBridge;
    }

    public void setCsvBridge(EventBridge csvBridge) {
        this.csvBridge = csvBridge;
    }

    public UI_LOOKUP getIsData() {
        return isData;
    }

    public void setIsData(UI_LOOKUP isData) {
        this.isData = isData;
    }

    public EventBridge getDataBridge() {
        return dataBridge;
    }

    public void setDataBridge(EventBridge dataBridge) {
        this.dataBridge = dataBridge;
    }

    public UI_LOOKUP getIsFirstDimension() {
        return isFirstDimension;
    }

    public void setIsFirstDimension(UI_LOOKUP isFirstDimension) {
        this.isFirstDimension = isFirstDimension;
    }

    public EventBridge getFirstDimensionBridge() {
        return firstDimensionBridge;
    }

    public void setFirstDimensionBridge(EventBridge firstDimensionBridge) {
        this.firstDimensionBridge = firstDimensionBridge;
    }

    public String getFirstDimensionLKValue() {
        return firstDimensionLKValue;
    }

    public void setFirstDimensionLKValue(String firstDimensionLKValue) {
        this.firstDimensionLKValue = firstDimensionLKValue;
    }

    public UI_LOOKUP getIsSecondDimension() {
        return isSecondDimension;
    }

    public void setIsSecondDimension(UI_LOOKUP isSecondDimension) {
        this.isSecondDimension = isSecondDimension;
    }

    public EventBridge getSecondDimensionBridge() {
        return secondDimensionBridge;
    }

    public void setSecondDimensionBridge(EventBridge secondDimensionBridge) {
        this.secondDimensionBridge = secondDimensionBridge;
    }

    public String getSecondDimensionLKValue() {
        return secondDimensionLKValue;
    }

    public void setSecondDimensionLKValue(String secondDimensionLKValue) {
        this.secondDimensionLKValue = secondDimensionLKValue;
    }

    public String getDistinctLKValue() {
        return distinctLKValue;
    }

    public void setDistinctLKValue(String distinctLKValue) {
        this.distinctLKValue = distinctLKValue;
    }

    public String getAggLKValue() {
        return aggLKValue;
    }

    public void setAggLKValue(String aggLKValue) {
        this.aggLKValue = aggLKValue;
    }

    public GenForm getGenForm() {
        return genForm;
    }

    public void setGenForm(GenForm genForm) {
        this.genForm = genForm;
    }

    public List<GenForm> getGenForms() {
        return genForms;
    }

    public void setGenForms(List<GenForm> genForms) {
        this.genForms = genForms;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
