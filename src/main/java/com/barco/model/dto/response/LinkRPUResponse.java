package com.barco.model.dto.response;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkRPUResponse {

    private Long id;
    private String email;
    private String fullName;
    private String profileImg;
    private String linkData;
    private GLookup linkStatus;
    private Boolean linked = false;
    private ProfileResponse profile;

    public LinkRPUResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getLinkData() {
        return linkData;
    }

    public void setLinkData(String linkData) {
        this.linkData = linkData;
    }

    public GLookup getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(GLookup linkStatus) {
        this.linkStatus = linkStatus;
    }

    public Boolean getLinked() {
        return linked;
    }

    public void setLinked(Boolean linked) {
        this.linked = linked;
    }

    public ProfileResponse getProfile() {
        return profile;
    }

    public void setProfile(ProfileResponse profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
