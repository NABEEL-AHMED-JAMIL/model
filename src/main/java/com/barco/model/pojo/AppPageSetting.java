package com.barco.model.pojo;

import com.barco.model.util.lookup.UI_LOOKUP;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_page_setting")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppPageSetting extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "icon", nullable = false)
    private String icon;

    @Column(name = "is_parent", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private UI_LOOKUP isParent;

    @Column(name = "page_url")
    private String pageUrl;

    @ManyToMany(cascade = {
        CascadeType.PERSIST, CascadeType.MERGE
    }, fetch = FetchType.LAZY)
    @JoinTable(	name = "app_page_roles",
        joinColumns = @JoinColumn(name = "app_page_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> appPageRoles = new HashSet<>();

    @ManyToMany(cascade = {
        CascadeType.PERSIST, CascadeType.MERGE
    }, fetch = FetchType.LAZY)
    @JoinTable(	name = "app_page_permissions",
        joinColumns = @JoinColumn(name = "app_page_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Permission> appPagePermissions = new HashSet<>();

    @OneToMany(mappedBy = "childLink", fetch = FetchType.LAZY,
       cascade = CascadeType.ALL)
    private List<AppPageSubSetting> appPageChildLinks;

    public AppPageSetting() {}

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

    public UI_LOOKUP getIsParent() {
        return isParent;
    }

    public void setIsParent(UI_LOOKUP isParent) {
        this.isParent = isParent;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public Set<Role> getAppPageRoles() {
        return appPageRoles;
    }

    public void setAppPageRoles(Set<Role> appPageRoles) {
        this.appPageRoles = appPageRoles;
    }

    public Set<Permission> getAppPagePermissions() {
        return appPagePermissions;
    }

    public void setAppPagePermissions(Set<Permission> appPagePermissions) {
        this.appPagePermissions = appPagePermissions;
    }

    public List<AppPageSubSetting> getAppPageChildLinks() {
        return appPageChildLinks;
    }

    public void setAppPageChildLinks(List<AppPageSubSetting> appPageChildLinks) {
        this.appPageChildLinks = appPageChildLinks;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
