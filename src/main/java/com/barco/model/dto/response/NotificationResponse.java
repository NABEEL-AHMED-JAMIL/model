package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationResponse {

    private Long notAuditId;
    private String message;
    private Long type;
    private Long expireTime;
    private Long notStatus;

    public NotificationResponse() {
    }

    public Long getNotAuditId() {
        return notAuditId;
    }

    public void setNotAuditId(Long notAuditId) {
        this.notAuditId = notAuditId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public Long getNotStatus() {
        return notStatus;
    }

    public void setNotStatus(Long notStatus) {
        this.notStatus = notStatus;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
