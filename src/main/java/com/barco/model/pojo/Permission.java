package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "permission")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Permission extends BaseEntity  {

    @Column(name = "permission_name", nullable = false)
    private String permissionName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "permission", fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    private List<ProfilePermission> profilePermissions;

    public Permission() {}

    public Permission(String permissionName, List<ProfilePermission> profilePermissions) {
        this.permissionName = permissionName;
        this.profilePermissions = profilePermissions;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProfilePermission> getProfilePermissions() {
        return profilePermissions;
    }

    public void setProfilePermissions(List<ProfilePermission> profilePermissions) {
        this.profilePermissions = profilePermissions;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}