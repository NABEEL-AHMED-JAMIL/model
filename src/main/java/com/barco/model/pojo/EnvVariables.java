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
@Table(name = "env_variables")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvVariables extends BaseEntity {

    @Column(name = "env_key", nullable = false)
    private String envKey;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "envVariables", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AppUserEnv> appUserEnvs = new ArrayList<>();

    public EnvVariables() {
    }

    public String getEnvKey() {
        return envKey;
    }

    public void setEnvKey(String envKey) {
        this.envKey = envKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AppUserEnv> getAppUserEnvs() {
        return appUserEnvs;
    }

    public void setAppUserEnvs(List<AppUserEnv> appUserEnvs) {
        this.appUserEnvs = appUserEnvs;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}