package com.barco.model.pojo.aoe;

import com.barco.model.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_role_permission")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppRolePermission extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private AppRole role;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "permission_id", nullable = false)
    private AppPermission permission;

    public AppRolePermission() {}

    public AppRolePermission(AppRole role, AppPermission permission) {
        this.role = role;
        this.permission = permission;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    public AppPermission getPermission() {
        return permission;
    }

    public void setPermission(AppPermission permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
