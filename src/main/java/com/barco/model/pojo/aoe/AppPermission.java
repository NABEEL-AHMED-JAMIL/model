package com.barco.model.pojo.aoe;

import com.barco.model.pojo.NamedTokenDetail;
import com.barco.model.pojo.BaseEntity;
import com.barco.model.lookup.PERMISSION_TYPE;
import com.barco.model.pojo.cse.LookupData;
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

    // Default -> System
    @ManyToOne
    @JoinColumn(name = "category_id")
    protected LookupData category;

    @Embedded
    private NamedTokenDetail tokenDetail;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "permission_type", nullable = false)
    private PERMISSION_TYPE permissionType;

    public AppPermission() {}

    public LookupData getCategory() {
        return category;
    }

    public void setCategory(LookupData category) {
        this.category = category;
    }

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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}