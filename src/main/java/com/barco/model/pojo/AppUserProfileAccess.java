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
@Table(name = "app_user_profile_access")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUserProfileAccess extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "app_user_id", nullable = false)
    protected AppUser appUser;

    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    protected Profile profile;

    public AppUserProfileAccess() {
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
