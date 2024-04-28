package com.barco.model.pojo;

import com.barco.model.util.lookup.DASHBOARD_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "dashboard_setting")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardSetting extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "group_type", nullable = false)
    private String groupType;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "board_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DASHBOARD_TYPE boardType;

    @Column(name = "dashboard_url", nullable = false)
    private String dashboardUrl;

    @Column(name = "iframe", nullable = false)
    private Boolean iframe; // in case of POWER_BI|TABLEAU => true and false, for

    public DashboardSetting() {
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

    public DASHBOARD_TYPE getBoardType() {
        return boardType;
    }

    public void setBoardType(DASHBOARD_TYPE boardType) {
        this.boardType = boardType;
    }

    public String getDashboardUrl() {
        return dashboardUrl;
    }

    public void setDashboardUrl(String dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
    }

    public Boolean getIframe() {
        return iframe;
    }

    public void setIframe(Boolean iframe) {
        this.iframe = iframe;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
