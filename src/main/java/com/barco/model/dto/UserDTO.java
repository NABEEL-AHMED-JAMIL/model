package com.barco.model.dto;

import com.barco.model.enums.UserType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long appUserId;
    private String lastName;
    private String firstName;
    private String username;
    private String password;
    private String role;
    private String topicId;
    private String clientPath;
    private String token;
    private UserType userType;

    public UserDTO() { }

    public Long getAppUserId() { return appUserId; }
    public void setAppUserId(Long appUserId) { this.appUserId = appUserId; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getTopicId() { return topicId; }
    public void setTopicId(String topicId) { this.topicId = topicId; }

    public String getClientPath() { return clientPath; }
    public void setClientPath(String clientPath) { this.clientPath = clientPath; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public UserType getUserType() {
        return userType;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
