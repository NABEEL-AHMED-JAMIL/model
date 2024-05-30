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
public class EventBridgeResponse extends BaseEntity {

    private String name;
    private String bridgeUrl;
    private String description;
    private GLookup bridgeType;
    private CredentialResponse credential;
    private Integer totalLinkCount;
    // token-id
    private String tokenId;
    private String accessToken;
    private Timestamp expireTime;

    public EventBridgeResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBridgeUrl() {
        return bridgeUrl;
    }

    public void setBridgeUrl(String bridgeUrl) {
        this.bridgeUrl = bridgeUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GLookup getBridgeType() {
        return bridgeType;
    }

    public void setBridgeType(GLookup bridgeType) {
        this.bridgeType = bridgeType;
    }

    public CredentialResponse getCredential() {
        return credential;
    }

    public void setCredential(CredentialResponse credential) {
        this.credential = credential;
    }

    public Integer getTotalLinkCount() {
        return totalLinkCount;
    }

    public void setTotalLinkCount(Integer totalLinkCount) {
        this.totalLinkCount = totalLinkCount;
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
