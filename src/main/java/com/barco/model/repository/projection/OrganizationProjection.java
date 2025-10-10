package com.barco.model.repository.projection;

import com.barco.model.util.lookup.ACCOUNT_TYPE;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.google.gson.Gson;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author Nabeel Ahmed
 */
public class OrganizationProjection {

    private Long orgId;
    private String orgUuid;
    private String orgName;
    private String orgAddress;
    private String orgPhone;
    private APPLICATION_STATUS orgStatus;
    private Date dateCreated;
    // user detail
    private String username;
    private String email;
    private ACCOUNT_TYPE accountType;

    public OrganizationProjection() {}

    public OrganizationProjection(Long orgId, String orgUuid, String orgName, String orgAddress,
        String orgPhone, APPLICATION_STATUS orgStatus, Date dateCreated, String username, String email,
        ACCOUNT_TYPE accountType) {
        this.orgId = orgId;
        this.orgUuid = orgUuid;
        this.orgName = orgName;
        this.orgAddress = orgAddress;
        this.orgPhone = orgPhone;
        this.orgStatus = orgStatus;
        this.dateCreated = dateCreated;
        this.username = username;
        this.email = email;
        this.accountType = accountType;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgUuid() {
        return orgUuid;
    }

    public void setOrgUuid(String orgUuid) {
        this.orgUuid = orgUuid;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone;
    }

    public APPLICATION_STATUS getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(APPLICATION_STATUS orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ACCOUNT_TYPE getAccountType() {
        return accountType;
    }

    public void setAccountType(ACCOUNT_TYPE accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
