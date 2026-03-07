package com.barco.model.pojo.aoe;

import com.barco.model.pojo.NamedTokenDetail;
import com.barco.model.pojo.BaseEntity;
import com.barco.model.lookup.PERMISSION_TYPE;
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

    @Embedded
    private NamedTokenDetail tokenDetail;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "permission_type", nullable = false)
    private PERMISSION_TYPE permissionType;

    /**
     * Route permissions use for page access control,
     * Event permissions use for event access control and
     * Role permissions use for role access control.
     * Route page: LookupData with parent_lookup_id = 1
     * Event permission: Edit, View, Delete, Create etc. LookupData with parent_lookup_id = 2
     * */
    @ManyToOne
    @JoinColumn(name = "parent_lookup_id")
    private AppPermission parentPermission;

    public AppPermission() {}

    public NamedTokenDetail getTokenDetail() {
        return tokenDetail;
    }

    public void setTokenDetail(NamedTokenDetail tokenDetail) {
        this.tokenDetail = tokenDetail;
    }

    public PERMISSION_TYPE getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(PERMISSION_TYPE permissionType) {
        this.permissionType = permissionType;
    }

    public AppPermission getParentPermission() {
        return parentPermission;
    }

    public void setParentPermission(AppPermission parentPermission) {
        this.parentPermission = parentPermission;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}