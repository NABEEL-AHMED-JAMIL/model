package com.barco.model.dto.response;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUserResponse extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String profileImg;
    private String ipAddress;
    private List<String> roles;
    private ProfileResponse profile;
    private GLookup accountType;
    private OrganizationResponse organization;
    private Integer totalSubUser;
    private List<EnVariablesResponse> enVariables;
    private List<EventBridgeResponse> eventBridge;

    public AppUserResponse() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public ProfileResponse getProfile() {
        return profile;
    }

    public void setProfile(ProfileResponse profile) {
        this.profile = profile;
    }

    public GLookup getAccountType() {
        return accountType;
    }

    public void setAccountType(GLookup accountType) {
        this.accountType = accountType;
    }

    public OrganizationResponse getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationResponse organization) {
        this.organization = organization;
    }

    public Integer getTotalSubUser() {
        return totalSubUser;
    }

    public void setTotalSubUser(Integer totalSubUser) {
        this.totalSubUser = totalSubUser;
    }

    public List<EnVariablesResponse> getEnVariables() {
        return enVariables;
    }

    public void setEnVariables(List<EnVariablesResponse> enVariables) {
        this.enVariables = enVariables;
    }

    public List<EventBridgeResponse> getEventBridge() {
        return eventBridge;
    }

    public void setEventBridge(List<EventBridgeResponse> eventBridge) {
        this.eventBridge = eventBridge;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
