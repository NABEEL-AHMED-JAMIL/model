package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import com.barco.model.util.lookuputil.GLookup;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUserResponse {

    private Long appUserId;
    private String firstName;
    private String lastName;
    private GLookup timeZone;
    private String username;
    private String email;
    private String profile;
    private List<AppUserResponse> subAppUser;
    private Set<RoleResponse> roleResponse;
    private GLookup status;
    private Timestamp dateCreated;
    protected AppUserResponse parentAppUser;

    public AppUserResponse() {}

    public Long getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(Long appUserId) {
        this.appUserId = appUserId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public GLookup getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(GLookup timeZone) {
        this.timeZone = timeZone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public List<AppUserResponse> getSubAppUser() {
        return subAppUser;
    }

    public void setSubAppUser(List<AppUserResponse> subAppUser) {
        this.subAppUser = subAppUser;
    }

    public Set<RoleResponse> getRoleResponse() {
        return roleResponse;
    }

    public void setRoleResponse(Set<RoleResponse> roleResponse) {
        this.roleResponse = roleResponse;
    }

    public GLookup getStatus() {
        return status;
    }

    public void setStatus(GLookup status) {
        this.status = status;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public AppUserResponse getParentAppUser() {
        return parentAppUser;
    }

    public void setParentAppUser(AppUserResponse parentAppUser) {
        this.parentAppUser = parentAppUser;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
