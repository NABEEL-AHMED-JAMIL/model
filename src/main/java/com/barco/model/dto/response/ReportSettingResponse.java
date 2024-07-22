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
public class ReportSettingResponse extends BaseEntity {

    private String name;
    private GLookup dateFilter;
    private GLookup fetchRate;
    private GLookup groupType;
    private String description;
    private GLookup payloadRef;
    private GLookup isPdf;
    private EventBridgeResponse pdfBridge;
    private GLookup isXlsx;
    private EventBridgeResponse xlsxBridge;
    private GLookup isCsv;
    private EventBridgeResponse csvBridge;
    private GLookup isData;
    private EventBridgeResponse dataBridge;
    private GLookup isFirstDimension;
    private EventBridgeResponse firstDimensionBridge;
    private GLookup firstDimensionLKValue;
    private GLookup isSecondDimension;
    private EventBridgeResponse secondDimensionBridge;
    private GLookup secondDimensionLKValue;
    private GLookup isThirdDimension;
    private EventBridgeResponse thirdDimensionBridge;
    private GLookup thirdDimensionLKValue;
    private GLookup distinctLKValue;
    private GLookup aggLKValue;
    private FormResponse formResponse;

    public ReportSettingResponse() {
    }

    public ReportSettingResponse(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GLookup getDateFilter() {
        return dateFilter;
    }

    public void setDateFilter(GLookup dateFilter) {
        this.dateFilter = dateFilter;
    }

    public GLookup getFetchRate() {
        return fetchRate;
    }

    public void setFetchRate(GLookup fetchRate) {
        this.fetchRate = fetchRate;
    }

    public GLookup getGroupType() {
        return groupType;
    }

    public void setGroupType(GLookup groupType) {
        this.groupType = groupType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GLookup getPayloadRef() {
        return payloadRef;
    }

    public void setPayloadRef(GLookup payloadRef) {
        this.payloadRef = payloadRef;
    }

    public GLookup getIsPdf() {
        return isPdf;
    }

    public void setIsPdf(GLookup isPdf) {
        this.isPdf = isPdf;
    }

    public EventBridgeResponse getPdfBridge() {
        return pdfBridge;
    }

    public void setPdfBridge(EventBridgeResponse pdfBridge) {
        this.pdfBridge = pdfBridge;
    }

    public GLookup getIsXlsx() {
        return isXlsx;
    }

    public void setIsXlsx(GLookup isXlsx) {
        this.isXlsx = isXlsx;
    }

    public EventBridgeResponse getXlsxBridge() {
        return xlsxBridge;
    }

    public void setXlsxBridge(EventBridgeResponse xlsxBridge) {
        this.xlsxBridge = xlsxBridge;
    }

    public GLookup getIsCsv() {
        return isCsv;
    }

    public void setIsCsv(GLookup isCsv) {
        this.isCsv = isCsv;
    }

    public EventBridgeResponse getCsvBridge() {
        return csvBridge;
    }

    public void setCsvBridge(EventBridgeResponse csvBridge) {
        this.csvBridge = csvBridge;
    }

    public GLookup getIsData() {
        return isData;
    }

    public void setIsData(GLookup isData) {
        this.isData = isData;
    }

    public EventBridgeResponse getDataBridge() {
        return dataBridge;
    }

    public void setDataBridge(EventBridgeResponse dataBridge) {
        this.dataBridge = dataBridge;
    }

    public GLookup getIsFirstDimension() {
        return isFirstDimension;
    }

    public void setIsFirstDimension(GLookup isFirstDimension) {
        this.isFirstDimension = isFirstDimension;
    }

    public EventBridgeResponse getFirstDimensionBridge() {
        return firstDimensionBridge;
    }

    public void setFirstDimensionBridge(EventBridgeResponse firstDimensionBridge) {
        this.firstDimensionBridge = firstDimensionBridge;
    }

    public GLookup getFirstDimensionLKValue() {
        return firstDimensionLKValue;
    }

    public void setFirstDimensionLKValue(GLookup firstDimensionLKValue) {
        this.firstDimensionLKValue = firstDimensionLKValue;
    }

    public GLookup getIsSecondDimension() {
        return isSecondDimension;
    }

    public void setIsSecondDimension(GLookup isSecondDimension) {
        this.isSecondDimension = isSecondDimension;
    }

    public EventBridgeResponse getSecondDimensionBridge() {
        return secondDimensionBridge;
    }

    public void setSecondDimensionBridge(EventBridgeResponse secondDimensionBridge) {
        this.secondDimensionBridge = secondDimensionBridge;
    }

    public GLookup getSecondDimensionLKValue() {
        return secondDimensionLKValue;
    }

    public void setSecondDimensionLKValue(GLookup secondDimensionLKValue) {
        this.secondDimensionLKValue = secondDimensionLKValue;
    }

    public GLookup getIsThirdDimension() {
        return isThirdDimension;
    }

    public void setIsThirdDimension(GLookup isThirdDimension) {
        this.isThirdDimension = isThirdDimension;
    }

    public EventBridgeResponse getThirdDimensionBridge() {
        return thirdDimensionBridge;
    }

    public void setThirdDimensionBridge(EventBridgeResponse thirdDimensionBridge) {
        this.thirdDimensionBridge = thirdDimensionBridge;
    }

    public GLookup getThirdDimensionLKValue() {
        return thirdDimensionLKValue;
    }

    public void setThirdDimensionLKValue(GLookup thirdDimensionLKValue) {
        this.thirdDimensionLKValue = thirdDimensionLKValue;
    }

    public GLookup getDistinctLKValue() {
        return distinctLKValue;
    }

    public void setDistinctLKValue(GLookup distinctLKValue) {
        this.distinctLKValue = distinctLKValue;
    }

    public GLookup getAggLKValue() {
        return aggLKValue;
    }

    public void setAggLKValue(GLookup aggLKValue) {
        this.aggLKValue = aggLKValue;
    }

    public FormResponse getFormResponse() {
        return formResponse;
    }

    public void setFormResponse(FormResponse formResponse) {
        this.formResponse = formResponse;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
