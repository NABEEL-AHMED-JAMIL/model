package com.barco.model.pojo;

import com.barco.model.util.lookup.DASHBOARD_TYPE;
import com.barco.model.util.lookup.UI_LOOKUP;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "group_type")
    private LookupData groupType;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "board_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DASHBOARD_TYPE boardType;

    @Column(name = "dashboard_url", nullable = false)
    private String dashboardUrl;

    @Column(name = "iframe", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP iframe;

    @OneToMany(mappedBy = "dashboard", fetch = FetchType.LAZY)
    private List<GenForm> genForms;

    public DashboardSetting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LookupData getGroupType() {
        return groupType;
    }

    public void setGroupType(LookupData groupType) {
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

    public UI_LOOKUP getIframe() {
        return iframe;
    }

    public void setIframe(UI_LOOKUP iframe) {
        this.iframe = iframe;
    }

    public List<GenForm> getGenForms() {
        return genForms;
    }

    public void setGenForms(List<GenForm> genForms) {
        this.genForms = genForms;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
