package com.barco.model.pojo.aoe;

import com.barco.model.pojo.BaseEntity;
import com.barco.model.util.lookup.PERMISSION_SCOPE;
import com.barco.model.util.lookup.PERMISSION_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_permission")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppPermission extends BaseEntity {

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "permission_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private PERMISSION_TYPE permissionType;

    @Column(name = "permission_scope", nullable = false)
    private PERMISSION_SCOPE permissionScope;

    public AppPermission() {}

    public AppPermission(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public AppPermission(String name, String description, PERMISSION_TYPE permissionType) {
        this.name = name;
        this.description = description;
        this.permissionType = permissionType;
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

    public PERMISSION_TYPE getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(PERMISSION_TYPE permissionType) {
        this.permissionType = permissionType;
    }

    public PERMISSION_SCOPE getPermissionScope() {
        return permissionScope;
    }

    public void setPermissionScope(PERMISSION_SCOPE permissionScope) {
        this.permissionScope = permissionScope;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
