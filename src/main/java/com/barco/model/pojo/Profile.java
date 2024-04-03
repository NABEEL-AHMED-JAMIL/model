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
@Table(name = "profile")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Profile extends BaseEntity {

    @Column(name="profile_name", nullable=false)
    private String profileName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
    private List<ProfilePermission> profilePermissions;

    @OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
    private List<AppUserProfileAccess> profileAccesses;

    public Profile() { }

    public Profile(String profileName, List<ProfilePermission> profilePermissions) {
        this.profileName = profileName;
        this.profilePermissions = profilePermissions;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
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

    public List<AppUserProfileAccess> getProfileAccesses() {
        return profileAccesses;
    }

    public void setProfileAccesses(List<AppUserProfileAccess> profileAccesses) {
        this.profileAccesses = profileAccesses;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}