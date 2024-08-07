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
public class DashboardSettingResponse extends BaseEntity {

    private String name;
    private GLookup groupType;
    private String description;
    private GLookup boardType;
    private String dashboardUrl;
    private GLookup iframe;

    public DashboardSettingResponse() {
    }

    public DashboardSettingResponse(Long id, String name) {
        super(id);
        this.name = name;
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

    public GLookup getBoardType() {
        return boardType;
    }

    public void setBoardType(GLookup boardType) {
        this.boardType = boardType;
    }

    public String getDashboardUrl() {
        return dashboardUrl;
    }

    public void setDashboardUrl(String dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
    }

    public GLookup getIframe() {
        return iframe;
    }

    public void setIframe(GLookup iframe) {
        this.iframe = iframe;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
