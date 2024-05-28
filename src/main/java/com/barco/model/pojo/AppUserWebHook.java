package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_user_hooks")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUserWebHook extends BaseEntity {

    // don't show this to user
    @Column(name = "token_id", nullable = false)
    private String tokenId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "webhook_id", nullable = false)
    private WebHook webhook;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_user_id", nullable = false)
    private AppUser appUser;

    // generate base on the credential
    @Column(name = "access_token", length = 25000)
    private String accessToken;

    @Column(name = "expire_time")
    private Timestamp expireTime;

    public AppUserWebHook() {
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public WebHook getWebhook() {
        return webhook;
    }

    public void setWebhook(WebHook webhook) {
        this.webhook = webhook;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
