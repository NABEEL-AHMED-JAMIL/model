package com.barco.model.pojo;

import com.barco.model.lookup.GENDER;
import com.barco.model.pojo.aoe.*;
import com.barco.model.pojo.cse.AppCountry;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "etl_account")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtlAccount extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id")
    protected Organization organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    protected AppUser appUser;

    @Column(name = "org_account", nullable = false)
    private Boolean orgAccount = false;

    @Column(name = "is_system", nullable = false)
    private Boolean isSystem = false;

    @Column(name = "ip_address", nullable = false)
    private String ipAddress;

    @ManyToOne
    @JoinColumn(name = "country_id", nullable = false)
    private AppCountry country;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "gender", nullable = false)
    private GENDER gender;

    // Active profile for the account will fetch the detail from 'EtlAccountPrivileges' current profile and its permission.
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", nullable = false)
    private AppProfile appProfile;

    public EtlAccount() {}

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Boolean getOrgAccount() {
        return orgAccount;
    }

    public void setOrgAccount(Boolean orgAccount) {
        this.orgAccount = orgAccount;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AppCountry getCountry() {
        return country;
    }

    public void setCountry(AppCountry country) {
        this.country = country;
    }

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    public AppProfile getAppProfile() {
        return appProfile;
    }

    public void setAppProfile(AppProfile appProfile) {
        this.appProfile = appProfile;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}