package com.barco.model.dto.request;

import com.barco.model.dto.response.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationRequest extends BaseEntity {

    private String sendTo;
    private MessageRequest body;
    private Long notifyType;
    private Timestamp expireTime;
    private Long messageStatus;
    private SessionUser sessionUser;

    public NotificationRequest() {
    }

    public NotificationRequest(MessageRequest body,
        Long notifyType, Timestamp expireTime, Long messageStatus) {
        this.body = body;
        this.notifyType = notifyType;
        this.expireTime = expireTime;
        this.messageStatus = messageStatus;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public MessageRequest getBody() {
        return body;
    }

    public void setBody(MessageRequest body) {
        this.body = body;
    }

    public Long getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(Long notifyType) {
        this.notifyType = notifyType;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    public Long getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(Long messageStatus) {
        this.messageStatus = messageStatus;
    }

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
