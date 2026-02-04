package com.barco.model.pojo;

import com.barco.model.pojo.aoe.AppUser;
import com.barco.model.pojo.aoe.Organization;
import com.barco.model.util.lookup.ACCOUNT_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 * main entity
 */
@Entity
@Table(name = "etl_account")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ETLAccount extends BaseEntity {

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "org_id")
    protected Organization organization;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id", nullable = false)
    protected AppUser appUser;

    @Column(name = "account_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ACCOUNT_TYPE accountType;

    @Column(name = "org_account", nullable = false)
    private Boolean orgAccount = false;

    @Column(name = "ip_address", nullable = false)
    private String ipAddress;

    public ETLAccount() {}

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

    public ACCOUNT_TYPE getAccountType() {
        return accountType;
    }

    public void setAccountType(ACCOUNT_TYPE accountType) {
        this.accountType = accountType;
    }

    public Boolean getOrgAccount() {
        return orgAccount;
    }

    public void setOrgAccount(Boolean orgAccount) {
        this.orgAccount = orgAccount;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
