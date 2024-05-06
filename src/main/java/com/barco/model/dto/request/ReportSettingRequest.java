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
    private Long isPdf;
    private String pdfUrl;
    private String pdfApiToken;
    private Long isXlsx;
    private String xlsxUrl;
    private String xlsxApiToken;
    private Long isCsv;
    private String csvUrl;
    private String csvApiToken;
    private Long isData;
    private String dataUrl;
    private String dataApiToken;
    private Long isFirstDimension;
    private String firstDimensionUrl;
    private String firstDimensionLKValue;
    private String firstDimensionApiToken;
    private Long isSecondDimension;
    private String secondDimensionUrl;
    private String secondDimensionLKValue;
    private String secondDimensionApiToken;
    private String distinctLKValue;
    private String aggLKValue;
    private Long formRequestId;
    private Long status;
    private SessionUser sessionUser;

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

    public Long getIsPdf() {
        return isPdf;
    }

    public void setIsPdf(Long isPdf) {
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

    public Long getIsXlsx() {
        return isXlsx;
    }

    public void setIsXlsx(Long isXlsx) {
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

    public Long getIsCsv() {
        return isCsv;
    }

    public void setIsCsv(Long isCsv) {
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

    public Long getIsData() {
        return isData;
    }

    public void setIsData(Long isData) {
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

    public Long getIsFirstDimension() {
        return isFirstDimension;
    }

    public void setIsFirstDimension(Long isFirstDimension) {
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

    public Long getIsSecondDimension() {
        return isSecondDimension;
    }

    public void setIsSecondDimension(Long isSecondDimension) {
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

    public Long getFormRequestId() {
        return formRequestId;
    }

    public void setFormRequestId(Long formRequestId) {
        this.formRequestId = formRequestId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
