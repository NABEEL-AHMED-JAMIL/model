package com.barco.model.dto;

import com.barco.model.enums.Status;
import com.barco.model.enums.UserType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.sql.Timestamp;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserListingDto {

    private Long id;
    private Timestamp createdAt;
    private String fullName;
    private String username;
    private Timestamp lastLoginAt;
    private String role;
    private Status status;
    private UserType userType;

    public UserListingDto() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getLastLoginAt() {
        return lastLoginAt;
    }
    public void setLastLoginAt(Timestamp lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public UserType getUserType() {
        return userType;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
