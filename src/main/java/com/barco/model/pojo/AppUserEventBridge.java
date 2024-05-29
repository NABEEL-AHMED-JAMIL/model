package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_user_event_bridge")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppUserEventBridge extends BaseEntity {

    // don't show this to user
    @Column(name = "token_id", nullable = false)
    private String tokenId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "event_bridge_id", nullable = false)
    private EventBridge eventBridge;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_user_id", nullable = false)
    private AppUser appUser;

    // generate base on the credential
    @Column(name = "access_token", length = 25000)
    private String accessToken;

    @Column(name = "expire_time")
    private Timestamp expireTime;

    public AppUserEventBridge() {
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public EventBridge getEventBridge() {
        return eventBridge;
    }

    public void setEventBridge(EventBridge eventBridge) {
        this.eventBridge = eventBridge;
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
