package com.barco.model.pojo;

import com.barco.model.util.lookup.GROUP_USER_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "user_group")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserGroup extends BaseEntity {

    // user id for user-group
    @ManyToOne(fetch = FetchType.LAZY,
        cascade = { CascadeType.ALL })
    @JoinColumn(name="app_user_id", nullable = false)
    private AppUser appUser;

    @ManyToOne(fetch = FetchType.LAZY,
        cascade = { CascadeType.ALL })
    @JoinColumn(name="group_id", nullable = false)
    private Groups groups;

    @Column(name = "user_type", nullable = false)
    private GROUP_USER_TYPE userType;

    public UserGroup() {
    }

    public UserGroup(AppUser appUser, Groups groups) {
        this.appUser = appUser;
        this.groups = groups;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public GROUP_USER_TYPE getUserType() {
        return userType;
    }

    public void setUserType(GROUP_USER_TYPE userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
