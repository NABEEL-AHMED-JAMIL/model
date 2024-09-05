package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_page_sub_setting")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppPageSubSetting extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "parent_link", nullable = false)
    private AppPageSetting parentLink;

    @ManyToOne
    @JoinColumn(name = "child_link", nullable = false)
    private AppPageSetting childLink;

    public AppPageSubSetting() {
    }

    public AppPageSubSetting(AppPageSetting parentLink, AppPageSetting childLink) {
        this.parentLink = parentLink;
        this.childLink = childLink;
    }

    public AppPageSetting getParentLink() {
        return parentLink;
    }

    public void setParentLink(AppPageSetting parentLink) {
        this.parentLink = parentLink;
    }

    public AppPageSetting getChildLink() {
        return childLink;
    }

    public void setChildLink(AppPageSetting childLink) {
        this.childLink = childLink;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
