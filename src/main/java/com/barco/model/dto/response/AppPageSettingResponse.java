package com.barco.model.dto.response;

import com.barco.model.dto.request.PermissionRequest;
import com.barco.model.dto.request.RoleRequest;
import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.List;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppPageSettingResponse extends BaseEntity {

    private String name;
    private String description;
    private String icon;
    private GLookup isParent;
    private String pageUrl;
    // link roles and permissions
    private Set<RoleRequest> appPageRoles;
    private Set<PermissionRequest> appPagePermissions;
    private List<AppPageSettingResponse> appPageChildLinks;

    public AppPageSettingResponse() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public GLookup getIsParent() {
        return isParent;
    }

    public void setIsParent(GLookup isParent) {
        this.isParent = isParent;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public Set<RoleRequest> getAppPageRoles() {
        return appPageRoles;
    }

    public void setAppPageRoles(Set<RoleRequest> appPageRoles) {
        this.appPageRoles = appPageRoles;
    }

    public Set<PermissionRequest> getAppPagePermissions() {
        return appPagePermissions;
    }

    public void setAppPagePermissions(Set<PermissionRequest> appPagePermissions) {
        this.appPagePermissions = appPagePermissions;
    }

    public List<AppPageSettingResponse> getAppPageChildLinks() {
        return appPageChildLinks;
    }

    public void setAppPageChildLinks(List<AppPageSettingResponse> appPageChildLinks) {
        this.appPageChildLinks = appPageChildLinks;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}