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
@Table(name = "app_profile_permission")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppProfilePermission extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private AppProfile profile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permission_id", nullable = false)
    private AppPermission permission;

    // This field is used when permission is event for screen, we want to hide the action from UI.
    @Column(name = "hidden", nullable = false)
    private boolean hidden = false;

    // This field is used when permission is event for screen, we want to disable the action from UI.
    @Column(name = "disabled", nullable = false)
    private boolean disabled = false;

    public AppProfilePermission() {}

    public AppProfile getProfile() {
        return profile;
    }

    public void setProfile(AppProfile profile) {
        this.profile = profile;
    }

    public AppPermission getPermission() {
        return permission;
    }

    public void setPermission(AppPermission permission) {
        this.permission = permission;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}