package com.barco.model.pojo.aoe;

import com.barco.model.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.Objects;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(
    name = "app_role_permission",
    uniqueConstraints = @UniqueConstraint(
        name = "uk_role_permission",
        columnNames = {
            "org_id",
            "role_id",
            "permission_id",
        }
    )
)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppRolePermission extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id", nullable = false)
    private Organization organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private AppRole role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permission_id", nullable = false)
    private AppPermission permission;

    public AppRolePermission() {}

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppRolePermission that = (AppRolePermission) o;
        return Objects.equals(organization, that.organization) &&
               Objects.equals(role, that.role) &&
               Objects.equals(permission, that.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, role, permission);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}