package com.barco.model.pojo;

import com.barco.model.pojo.aoe.AppProfilePermission;
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
@Table(name = "etl_account_privileges")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtlAccountPrivileges extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    protected EtlAccount etlAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_id", nullable = false)
    private AppProfilePermission appProfilePermission;

    public EtlAccountPrivileges() {}

    public EtlAccount getEtlAccount() {
        return etlAccount;
    }

    public void setEtlAccount(EtlAccount etlAccount) {
        this.etlAccount = etlAccount;
    }

    public AppProfilePermission getAppProfilePermission() {
        return appProfilePermission;
    }

    public void setAppProfilePermission(AppProfilePermission appProfilePermission) {
        this.appProfilePermission = appProfilePermission;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
