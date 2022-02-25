package com.barco.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompanyDto {

    private Long companyId;
    private String companyName;
    private String description;
    private String icon;
    private String email;
    private String phone;
    private AddressDto address;

    public CompanyDto() {}

    public Long getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
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

    public AddressDto getAddress() {
        return address;
    }
    public void setAddress(AddressDto address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}