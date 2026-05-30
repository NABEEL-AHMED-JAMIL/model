package com.barco.model.pojo.aoe;

import com.barco.model.pojo.NamedTokenDetail;
import com.barco.model.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_profile")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppProfile extends BaseEntity {

    @Embedded
    private NamedTokenDetail namedTokenDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false, unique = true)
    private AppRole role;

    public AppProfile() {}

    public NamedTokenDetail getNamedTokenDetail() {
        return namedTokenDetail;
    }

    public void setNamedTokenDetail(NamedTokenDetail namedTokenDetail) {
        this.namedTokenDetail = namedTokenDetail;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}