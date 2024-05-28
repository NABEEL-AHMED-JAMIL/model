package com.barco.model.pojo;

import com.barco.model.util.lookup.HOOK_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "webhook")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebHook extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "hook_url", nullable = false)
    private String hookUrl;

    @Column(name = "description", nullable = false)
    private String description;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "hook_type", nullable = false)
    private HOOK_TYPE hookType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credential_id", nullable = false)
    private Credential credential;

    @OneToMany(mappedBy = "webhook",
        fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AppUserWebHook> appUserWebHooks;

    public WebHook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHookUrl() {
        return hookUrl;
    }

    public void setHookUrl(String hookUrl) {
        this.hookUrl = hookUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HOOK_TYPE getHookType() {
        return hookType;
    }

    public void setHookType(HOOK_TYPE hookType) {
        this.hookType = hookType;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public List<AppUserWebHook> getAppUserWebHooks() {
        return appUserWebHooks;
    }

    public void setAppUserWebHooks(List<AppUserWebHook> appUserWebHooks) {
        this.appUserWebHooks = appUserWebHooks;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
