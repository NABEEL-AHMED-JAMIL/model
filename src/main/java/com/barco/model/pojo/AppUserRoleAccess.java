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
 * Class use to give the access to the user so dy can create access
 */
@Entity
@Table(name = "app_user_role_access")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUserRoleAccess extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "app_user_id", nullable = false)
    protected AppUser appUser;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    protected Role role;

    public AppUserRoleAccess() {
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
