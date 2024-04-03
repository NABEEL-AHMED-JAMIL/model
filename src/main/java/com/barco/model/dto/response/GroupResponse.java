package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupResponse extends BaseEntity {

    private String avatar;
    private String name;
    private String description;
    private AppUserResponse teamLead;

    public GroupResponse() {
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppUserResponse getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(AppUserResponse teamLead) {
        this.teamLead = teamLead;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
