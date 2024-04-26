package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportSettingRequest extends RequestFilter {

    private Long id;
    private String name;
    private String groupType;
    private String description;
    private Long payloadRef;
    private Boolean isPdf;
    private String pdfUrl;
    private String pdfApiToken;
    private Boolean isXlsx;
    private String xlsxUrl;
    private String xlsxApiToken;
    private Boolean isCsv;
    private String csvUrl;
    private String csvApiToken;
    private String dataUrl;
    private String dataApiToken;
    private String firstDimensionUrl;
    private String firstDimensLKValue;
    private String firstDimensionApiToken;
    private String secondDimensionUrl;
    private String secondDimensionLKValue;
    private String secondDimensionApiToken;
    private String thirdDimensionUrl;
    private String thirdDimensionLKValue;
    private String thirdDimensionApiToken;
    private String distinctLKValue;
    private FormRequest formRequest;

    public ReportSettingRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPayloadRef() {
        return payloadRef;
    }

    public void setPayloadRef(Long payloadRef) {
        this.payloadRef = payloadRef;
    }

    public Boolean getPdf() {
        return isPdf;
    }

    public void setPdf(Boolean pdf) {
        isPdf = pdf;
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

    public Boolean getXlsx() {
        return isXlsx;
    }

    public void setXlsx(Boolean xlsx) {
        isXlsx = xlsx;
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

    public Boolean getCsv() {
        return isCsv;
    }

    public void setCsv(Boolean csv) {
        isCsv = csv;
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

    public String getFirstDimensionUrl() {
        return firstDimensionUrl;
    }

    public void setFirstDimensionUrl(String firstDimensionUrl) {
        this.firstDimensionUrl = firstDimensionUrl;
    }

    public String getFirstDimensLKValue() {
        return firstDimensLKValue;
    }

    public void setFirstDimensLKValue(String firstDimensLKValue) {
        this.firstDimensLKValue = firstDimensLKValue;
    }

    public String getFirstDimensionApiToken() {
        return firstDimensionApiToken;
    }

    public void setFirstDimensionApiToken(String firstDimensionApiToken) {
        this.firstDimensionApiToken = firstDimensionApiToken;
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

    public String getThirdDimensionUrl() {
        return thirdDimensionUrl;
    }

    public void setThirdDimensionUrl(String thirdDimensionUrl) {
        this.thirdDimensionUrl = thirdDimensionUrl;
    }

    public String getThirdDimensionLKValue() {
        return thirdDimensionLKValue;
    }

    public void setThirdDimensionLKValue(String thirdDimensionLKValue) {
        this.thirdDimensionLKValue = thirdDimensionLKValue;
    }

    public String getThirdDimensionApiToken() {
        return thirdDimensionApiToken;
    }

    public void setThirdDimensionApiToken(String thirdDimensionApiToken) {
        this.thirdDimensionApiToken = thirdDimensionApiToken;
    }

    public String getDistinctLKValue() {
        return distinctLKValue;
    }

    public void setDistinctLKValue(String distinctLKValue) {
        this.distinctLKValue = distinctLKValue;
    }

    public FormRequest getFormRequest() {
        return formRequest;
    }

    public void setFormRequest(FormRequest formRequest) {
        this.formRequest = formRequest;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
