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
    name = "app_profile_permission",
    uniqueConstraints = @UniqueConstraint(
        name = "uk_profile_permission",
        columnNames = {
            "org_id",
            "profile_id",
            "permission_id",
        }
    )
)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class  AppProfilePermission extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id", nullable = false)
    private Organization organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private AppProfile profile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permission_id", nullable = false)
    private AppPermission permission;

    // This field is used when permission is event for screen, we want to hide the action from UI.
    @Column(name = "hided", nullable = false)
    private boolean hided = false;

    // This field is used when permission is event for screen, we want to disable the action from UI.
    @Column(name = "disabled", nullable = false)
    private boolean disabled = false;

    public AppProfilePermission() {}

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

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

    public boolean isHided() {
        return hided;
    }

    public void setHided(boolean hided) {
        this.hided = hided;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppProfilePermission that = (AppProfilePermission) o;
        return Objects.equals(organization, that.organization) &&
               Objects.equals(profile, that.profile) &&
               Objects.equals(permission, that.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organization, profile, permission);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}