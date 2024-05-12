package com.barco.model.dto.dashboard;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SettingDashboard {

    private Long count;
    private String type;
    private GLookup status;

    private List<SettingDashboard> subDetail;

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GLookup getStatus() {
        return status;
    }

    public void setStatus(GLookup status) {
        this.status = status;
    }

    public List<SettingDashboard> getSubDetail() {
        return subDetail;
    }

    public void setSubDetail(List<SettingDashboard> subDetail) {
        this.subDetail = subDetail;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
