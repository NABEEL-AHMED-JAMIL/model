package com.barco.model.pojo;

import com.barco.model.pojo.aoe.AppRolePermission;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * Author: Nabeel Ahmed
 * Single Account can have multiple profile but active profile will be one.
 * This table will maintain the profile and its permission for the account.
 */
@Entity
@Table(name = "etl_account_role")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtlAccountRole extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    protected EtlAccount etlAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arp_id", nullable = false)
    private AppRolePermission appRolePermission;

    public EtlAccountRole() {}

    public EtlAccount getEtlAccount() {
        return etlAccount;
    }

    public void setEtlAccount(EtlAccount etlAccount) {
        this.etlAccount = etlAccount;
    }

    public AppRolePermission getAppRolePermission() {
        return appRolePermission;
    }

    public void setAppRolePermission(AppRolePermission appRolePermission) {
        this.appRolePermission = appRolePermission;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
