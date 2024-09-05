package com.barco.model.dto.request;

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
public class AppPageSettingRequest extends RequestFilter {

    private Long id;
    private String name;
    private String description;
    private String icon;
    private Long isParent;
    private String pageUrl;
    // link roles and permissions
    private Set<RoleRequest> appPageRoles;
    private Set<PermissionRequest> appPagePermissions;
    private List<AppPageSettingRequest> appPageChildLinks;
    private Long status;
    private SessionUser sessionUser;

    public AppPageSettingRequest() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getIsParent() {
        return isParent;
    }

    public void setIsParent(Long isParent) {
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

    public List<AppPageSettingRequest> getAppPageChildLinks() {
        return appPageChildLinks;
    }

    public void setAppPageChildLinks(List<AppPageSettingRequest> appPageChildLinks) {
        this.appPageChildLinks = appPageChildLinks;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
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