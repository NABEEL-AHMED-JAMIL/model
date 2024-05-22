package com.barco.model.dto.report;

import com.barco.model.dto.dform.response.FormData;
import com.barco.model.dto.request.RequestFilter;
import com.barco.model.dto.request.SessionUser;
import com.barco.model.enums.DataType;
import com.barco.model.enums.DownloadType;
import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;
import java.util.Set;

/**
 * Basic input from the form submit
 * fetch the url and token from the service and trigger the data
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportRequest extends RequestFilter {

    private Long reportId;
    private GLookup reportGroup;
    private DataType dataType;
    private DownloadType downloadType;
    private GLookup firstDimension;
    private GLookup secondDimension;
    private Set<GLookup> distinctLookup;
    private Set<GLookup> aggregationLookup;
    private List<KeyValue> dynamicPayload;
    private FormData formData;
    private SessionUser sessionUser;

    public ReportRequest() {
    }

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public GLookup getReportGroup() {
        return reportGroup;
    }

    public void setReportGroup(GLookup reportGroup) {
        this.reportGroup = reportGroup;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public DownloadType getDownloadType() {
        return downloadType;
    }

    public void setDownloadType(DownloadType downloadType) {
        this.downloadType = downloadType;
    }

    public GLookup getFirstDimension() {
        return firstDimension;
    }

    public void setFirstDimension(GLookup firstDimension) {
        this.firstDimension = firstDimension;
    }

    public GLookup getSecondDimension() {
        return secondDimension;
    }

    public void setSecondDimension(GLookup secondDimension) {
        this.secondDimension = secondDimension;
    }

    public Set<GLookup> getDistinctLookup() {
        return distinctLookup;
    }

    public void setDistinctLookup(Set<GLookup> distinctLookup) {
        this.distinctLookup = distinctLookup;
    }

    public Set<GLookup> getAggregationLookup() {
        return aggregationLookup;
    }

    public void setAggregationLookup(Set<GLookup> aggregationLookup) {
        this.aggregationLookup = aggregationLookup;
    }

    public List<KeyValue> getDynamicPayload() {
        return dynamicPayload;
    }

    public void setDynamicPayload(List<KeyValue> dynamicPayload) {
        this.dynamicPayload = dynamicPayload;
    }

    public FormData getFormData() {
        return formData;
    }

    public void setFormData(FormData formData) {
        this.formData = formData;
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
