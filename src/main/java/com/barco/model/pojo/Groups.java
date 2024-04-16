package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "groups")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Groups extends BaseEntity {

    @Column(name = "name", nullable=false)
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "groups", fetch = FetchType.LAZY)
    private List<GroupUser> groupUsers;

    @OneToMany(mappedBy="groups")
    private List<GroupsLinkSourceTaskType> groupsLinkSourceTaskTypes;

    public Groups() {
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

    public List<GroupUser> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(List<GroupUser> groupUsers) {
        this.groupUsers = groupUsers;
    }

    public List<GroupsLinkSourceTaskType> getGroupsLinkSourceTaskTypes() {
        return groupsLinkSourceTaskTypes;
    }

    public void setGroupsLinkSourceTaskTypes(List<GroupsLinkSourceTaskType> groupsLinkSourceTaskTypes) {
        this.groupsLinkSourceTaskTypes = groupsLinkSourceTaskTypes;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
