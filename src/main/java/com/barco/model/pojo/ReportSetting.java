package com.barco.model.pojo;

import com.barco.model.util.lookup.PAYLOAD_REF;
import com.barco.model.util.lookup.UI_LOOKUP;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "group_type")
    private LookupData groupType;

    @Column(name = "description", nullable = false)
    private String description;

    // if its form ref then have to give the ref of form
    @Column(name = "payload_ref", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private PAYLOAD_REF payloadRef;

    @Column(name = "is_pdf", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isPdf;

    @Column(name = "pdf_url")
    private String pdfUrl;

    @Column(name = "pdf_token")
    private String pdfApiToken;

    @Column(name = "is_xlsx", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isXlsx;

    @Column(name = "xlsx_url")
    private String xlsxUrl;

    @Column(name = "xlsx_token")
    private String xlsxApiToken;

    @Column(name = "is_csv", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isCsv;

    @Column(name = "csv_url")
    private String csvUrl;

    @Column(name = "csv_token")
    private String csvApiToken;

    @Column(name = "is_data", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isData;

    @Column(name = "data_url")
    private String dataUrl;

    @Column(name = "data_token")
    private String dataApiToken;

    @Column(name = "is_fd", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isFirstDimension;

    @Column(name = "fd_url")
    private String firstDimensionUrl;

    @Column(name = "fd_lkv")
    private String firstDimensionLKValue;

    @Column(name = "fd_token")
    private String firstDimensionApiToken;

    @Column(name = "is_sd", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isSecondDimension;

    @Column(name = "sd_url")
    private String secondDimensionUrl;

    @Column(name = "sd_lkv")
    private String secondDimensionLKValue;

    @Column(name = "sd_token")
    private String secondDimensionApiToken;

    @Column(name = "distinct_lkv")
    private String distinctLKValue;

    // aggregation
    @Column(name = "agg_lkv")
    private String aggLKValue;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "form_id")
    private GenForm genForm;

    public ReportSetting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public String getPdfApiToken() {
        return pdfApiToken;
    }

    public void setPdfApiToken(String pdfApiToken) {
        this.pdfApiToken = pdfApiToken;
    }

    public UI_LOOKUP getIsXlsx() {
        return isXlsx;
    }

    public void setIsXlsx(UI_LOOKUP isXlsx) {
        this.isXlsx = isXlsx;
    }

    public String getXlsxUrl() {
        return xlsxUrl;
    }

    public void setXlsxUrl(String xlsxUrl) {
        this.xlsxUrl = xlsxUrl;
    }

    public String getXlsxApiToken() {
        return xlsxApiToken;
    }

    public void setXlsxApiToken(String xlsxApiToken) {
        this.xlsxApiToken = xlsxApiToken;
    }

    public UI_LOOKUP getIsCsv() {
        return isCsv;
    }

    public void setIsCsv(UI_LOOKUP isCsv) {
        this.isCsv = isCsv;
    }

    public String getCsvUrl() {
        return csvUrl;
    }

    public void setCsvUrl(String csvUrl) {
        this.csvUrl = csvUrl;
    }

    public String getCsvApiToken() {
        return csvApiToken;
    }

    public void setCsvApiToken(String csvApiToken) {
        this.csvApiToken = csvApiToken;
    }

    public UI_LOOKUP getIsData() {
        return isData;
    }

    public void setIsData(UI_LOOKUP isData) {
        this.isData = isData;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public String getDataApiToken() {
        return dataApiToken;
    }

    public void setDataApiToken(String dataApiToken) {
        this.dataApiToken = dataApiToken;
    }

    public UI_LOOKUP getIsFirstDimension() {
        return isFirstDimension;
    }

    public void setIsFirstDimension(UI_LOOKUP isFirstDimension) {
        this.isFirstDimension = isFirstDimension;
    }

    public String getFirstDimensionUrl() {
        return firstDimensionUrl;
    }

    public void setFirstDimensionUrl(String firstDimensionUrl) {
        this.firstDimensionUrl = firstDimensionUrl;
    }

    public String getFirstDimensionLKValue() {
        return firstDimensionLKValue;
    }

    public void setFirstDimensionLKValue(String firstDimensionLKValue) {
        this.firstDimensionLKValue = firstDimensionLKValue;
    }

    public String getFirstDimensionApiToken() {
        return firstDimensionApiToken;
    }

    public void setFirstDimensionApiToken(String firstDimensionApiToken) {
        this.firstDimensionApiToken = firstDimensionApiToken;
    }

    public UI_LOOKUP getIsSecondDimension() {
        return isSecondDimension;
    }

    public void setIsSecondDimension(UI_LOOKUP isSecondDimension) {
        this.isSecondDimension = isSecondDimension;
    }

    public String getSecondDimensionUrl() {
        return secondDimensionUrl;
    }

    public void setSecondDimensionUrl(String secondDimensionUrl) {
        this.secondDimensionUrl = secondDimensionUrl;
    }

    public String getSecondDimensionLKValue() {
        return secondDimensionLKValue;
    }

    public void setSecondDimensionLKValue(String secondDimensionLKValue) {
        this.secondDimensionLKValue = secondDimensionLKValue;
    }

    public String getSecondDimensionApiToken() {
        return secondDimensionApiToken;
    }

    public void setSecondDimensionApiToken(String secondDimensionApiToken) {
        this.secondDimensionApiToken = secondDimensionApiToken;
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
