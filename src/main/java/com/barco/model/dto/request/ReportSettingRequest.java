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
    private Long dateFilter;
    private Long recordReport;
    private Long fetchRate;
    private String name;
    private String groupType;
    private String description;
    private Long payloadRef;
    private Long isPdf;
    private Long pdfBridgeId;
    private Long isXlsx;
    private Long xlsxBridgeId;
    private Long isCsv;
    private Long csvBridgeId;
    private Long isData;
    private Long dataBridgeId;
    private Long isFirstDimension;
    private Long firstDimensionBridgeId;
    private String firstDimensionLKValue;
    private Long isSecondDimension;
    private Long secondDimensionBridgeId;
    private String secondDimensionLKValue;
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

    public Long getDateFilter() {
        return dateFilter;
    }

    public void setDateFilter(Long dateFilter) {
        this.dateFilter = dateFilter;
    }

    public Long getRecordReport() {
        return recordReport;
    }

    public void setRecordReport(Long recordReport) {
        this.recordReport = recordReport;
    }

    public Long getFetchRate() {
        return fetchRate;
    }

    public void setFetchRate(Long fetchRate) {
        this.fetchRate = fetchRate;
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

    public Long getPdfBridgeId() {
        return pdfBridgeId;
    }

    public void setPdfBridgeId(Long pdfBridgeId) {
        this.pdfBridgeId = pdfBridgeId;
    }

    public Long getIsXlsx() {
        return isXlsx;
    }

    public void setIsXlsx(Long isXlsx) {
        this.isXlsx = isXlsx;
    }

    public Long getXlsxBridgeId() {
        return xlsxBridgeId;
    }

    public void setXlsxBridgeId(Long xlsxBridgeId) {
        this.xlsxBridgeId = xlsxBridgeId;
    }

    public Long getIsCsv() {
        return isCsv;
    }

    public void setIsCsv(Long isCsv) {
        this.isCsv = isCsv;
    }

    public Long getCsvBridgeId() {
        return csvBridgeId;
    }

    public void setCsvBridgeId(Long csvBridgeId) {
        this.csvBridgeId = csvBridgeId;
    }

    public Long getIsData() {
        return isData;
    }

    public void setIsData(Long isData) {
        this.isData = isData;
    }

    public Long getDataBridgeId() {
        return dataBridgeId;
    }

    public void setDataBridgeId(Long dataBridgeId) {
        this.dataBridgeId = dataBridgeId;
    }

    public Long getIsFirstDimension() {
        return isFirstDimension;
    }

    public void setIsFirstDimension(Long isFirstDimension) {
        this.isFirstDimension = isFirstDimension;
    }

    public Long getFirstDimensionBridgeId() {
        return firstDimensionBridgeId;
    }

    public void setFirstDimensionBridgeId(Long firstDimensionBridgeId) {
        this.firstDimensionBridgeId = firstDimensionBridgeId;
    }

    public String getFirstDimensionLKValue() {
        return firstDimensionLKValue;
    }

    public void setFirstDimensionLKValue(String firstDimensionLKValue) {
        this.firstDimensionLKValue = firstDimensionLKValue;
    }

    public Long getIsSecondDimension() {
        return isSecondDimension;
    }

    public void setIsSecondDimension(Long isSecondDimension) {
        this.isSecondDimension = isSecondDimension;
    }

    public Long getSecondDimensionBridgeId() {
        return secondDimensionBridgeId;
    }

    public void setSecondDimensionBridgeId(Long secondDimensionBridgeId) {
        this.secondDimensionBridgeId = secondDimensionBridgeId;
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
