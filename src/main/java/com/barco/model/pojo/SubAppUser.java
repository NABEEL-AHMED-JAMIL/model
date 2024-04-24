package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "sub_app_user")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubAppUser extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = false)
    protected AppUser appUserParent;

    @ManyToOne
    @JoinColumn(name = "child_id", nullable = false)
    protected AppUser appUserChild;

    public SubAppUser() {
    }

    public AppUser getAppUserParent() {
        return appUserParent;
    }

    public void setAppUserParent(AppUser appUserParent) {
        this.appUserParent = appUserParent;
    }

    public AppUser getAppUserChild() {
        return appUserChild;
    }

    public void setAppUserChild(AppUser appUserChild) {
        this.appUserChild = appUserChild;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
