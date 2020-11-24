package com.barco.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuperAdminUserListDto {

    private Long id;
    private String username;
    private String role;
    private Set<AccessServiceDto> accessServices;

    public SuperAdminUserListDto() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public Set<AccessServiceDto> getAccessServices() { return accessServices; }
    public void setAccessServices(Set<AccessServiceDto> accessServices) { this.accessServices = accessServices; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
