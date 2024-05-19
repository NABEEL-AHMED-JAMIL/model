package com.barco.model.enums;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public enum DownloadType {

    PDF("PDF"),
    XLSX("XLSX"),
    CSV("CSV");

    private String downloadType;

    DownloadType(String downloadType) {
        this.downloadType = downloadType;
    }

    public String getDownloadType() {
        return downloadType;
    }

    public void setDownloadType(String downloadType) {
        this.downloadType = downloadType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
