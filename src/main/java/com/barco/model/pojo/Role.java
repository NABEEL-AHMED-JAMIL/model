package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "role")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Role extends BaseEntity {

    @Column(name = "name",
        unique=true, nullable=false)
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AppUserRoleAccess> roleAccesses = new ArrayList<>();

    public Role() {}

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

    public List<AppUserRoleAccess> getRoleAccesses() {
        return roleAccesses;
    }

    public void setRoleAccesses(List<AppUserRoleAccess> roleAccesses) {
        this.roleAccesses = roleAccesses;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}