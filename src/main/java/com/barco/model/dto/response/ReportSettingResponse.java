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
    private GLookup groupType;
    private String description;
    private GLookup payloadRef;
    private GLookup isPdf;
    private String pdfUrl;
    private String pdfApiToken;
    private GLookup isXlsx;
    private String xlsxUrl;
    private String xlsxApiToken;
    private GLookup isCsv;
    private String csvUrl;
    private String csvApiToken;
    private GLookup isData;
    private String dataUrl;
    private String dataApiToken;
    private GLookup isFirstDimension;
    private String firstDimensionUrl;
    private GLookup firstDimensionLKValue;
    private String firstDimensionApiToken;
    private GLookup isSecondDimension;
    private String secondDimensionUrl;
    private GLookup secondDimensionLKValue;
    private String secondDimensionApiToken;
    private GLookup isThirdDimension;
    private String thirdDimensionUrl;
    private GLookup thirdDimensionLKValue;
    private String thirdDimensionApiToken;
    private GLookup distinctLKValue;
    private GLookup aggLKValue;
    private FormResponse formResponse;

    public ReportSettingResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public GLookup getIsXlsx() {
        return isXlsx;
    }

    public void setIsXlsx(GLookup isXlsx) {
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

    public GLookup getIsCsv() {
        return isCsv;
    }

    public void setIsCsv(GLookup isCsv) {
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

    public GLookup getIsData() {
        return isData;
    }

    public void setIsData(GLookup isData) {
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

    public GLookup getIsFirstDimension() {
        return isFirstDimension;
    }

    public void setIsFirstDimension(GLookup isFirstDimension) {
        this.isFirstDimension = isFirstDimension;
    }

    public String getFirstDimensionUrl() {
        return firstDimensionUrl;
    }

    public void setFirstDimensionUrl(String firstDimensionUrl) {
        this.firstDimensionUrl = firstDimensionUrl;
    }

    public GLookup getFirstDimensionLKValue() {
        return firstDimensionLKValue;
    }

    public void setFirstDimensionLKValue(GLookup firstDimensionLKValue) {
        this.firstDimensionLKValue = firstDimensionLKValue;
    }

    public String getFirstDimensionApiToken() {
        return firstDimensionApiToken;
    }

    public void setFirstDimensionApiToken(String firstDimensionApiToken) {
        this.firstDimensionApiToken = firstDimensionApiToken;
    }

    public GLookup getIsSecondDimension() {
        return isSecondDimension;
    }

    public void setIsSecondDimension(GLookup isSecondDimension) {
        this.isSecondDimension = isSecondDimension;
    }

    public String getSecondDimensionUrl() {
        return secondDimensionUrl;
    }

    public void setSecondDimensionUrl(String secondDimensionUrl) {
        this.secondDimensionUrl = secondDimensionUrl;
    }

    public GLookup getSecondDimensionLKValue() {
        return secondDimensionLKValue;
    }

    public void setSecondDimensionLKValue(GLookup secondDimensionLKValue) {
        this.secondDimensionLKValue = secondDimensionLKValue;
    }

    public String getSecondDimensionApiToken() {
        return secondDimensionApiToken;
    }

    public void setSecondDimensionApiToken(String secondDimensionApiToken) {
        this.secondDimensionApiToken = secondDimensionApiToken;
    }

    public GLookup getIsThirdDimension() {
        return isThirdDimension;
    }

    public void setIsThirdDimension(GLookup isThirdDimension) {
        this.isThirdDimension = isThirdDimension;
    }

    public String getThirdDimensionUrl() {
        return thirdDimensionUrl;
    }

    public void setThirdDimensionUrl(String thirdDimensionUrl) {
        this.thirdDimensionUrl = thirdDimensionUrl;
    }

    public GLookup getThirdDimensionLKValue() {
        return thirdDimensionLKValue;
    }

    public void setThirdDimensionLKValue(GLookup thirdDimensionLKValue) {
        this.thirdDimensionLKValue = thirdDimensionLKValue;
    }

    public String getThirdDimensionApiToken() {
        return thirdDimensionApiToken;
    }

    public void setThirdDimensionApiToken(String thirdDimensionApiToken) {
        this.thirdDimensionApiToken = thirdDimensionApiToken;
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
