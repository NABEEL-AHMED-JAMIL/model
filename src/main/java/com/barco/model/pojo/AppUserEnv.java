package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_user_env")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUserEnv extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "env_key_id", nullable = false)
    private EnvVariables envVariables;

    @ManyToOne(fetch = FetchType.LAZY,
        cascade = { CascadeType.ALL })
    @JoinColumn(name="app_user_id", nullable = false)
    private AppUser appUser;

    @Column(name = "env_value")
    private String envValue;

    public AppUserEnv() {
    }

    public EnvVariables getEnvVariables() {
        return envVariables;
    }

    public void setEnvVariables(EnvVariables envVariables) {
        this.envVariables = envVariables;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public String getEnvValue() {
        return envValue;
    }

    public void setEnvValue(String envValue) {
        this.envValue = envValue;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}