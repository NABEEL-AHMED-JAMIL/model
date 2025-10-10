package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.Map;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrganizationResponse extends BaseEntity {

    private String name;
    private String address;
    private String email;
    private String phone;
    private AppUserResponse owner;
    private ETLCountryResponse country;
    private Map<String, Object> orgStatistic;

    public OrganizationResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AppUserResponse getOwner() {
        return owner;
    }

    public void setOwner(AppUserResponse owner) {
        this.owner = owner;
    }

    public ETLCountryResponse getCountry() {
        return country;
    }

    public void setCountry(ETLCountryResponse country) {
        this.country = country;
    }

    public Map<String, Object> getOrgStatistic() {
        return orgStatistic;
    }

    public void setOrgStatistic(Map<String, Object> orgStatistic) {
        this.orgStatistic = orgStatistic;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
