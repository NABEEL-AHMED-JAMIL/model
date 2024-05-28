package com.barco.model.dto.response;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WebHookResponse extends BaseEntity {

    private String name;
    private String hookUrl;
    private String description;
    private GLookup hookType;
    private CredentialResponse credential;
    // token-id
    private String tokenId;
    private String accessToken;
    private Timestamp expireTime;

    public WebHookResponse() {
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

    public GLookup getHookType() {
        return hookType;
    }

    public void setHookType(GLookup hookType) {
        this.hookType = hookType;
    }

    public CredentialResponse getCredential() {
        return credential;
    }

    public void setCredential(CredentialResponse credential) {
        this.credential = credential;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
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
