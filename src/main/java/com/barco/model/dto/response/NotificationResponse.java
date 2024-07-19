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
public class NotificationResponse extends BaseEntity {

    private String sendTo;
    private MessageResponse body;
    private GLookup notifyType;
    private Timestamp expireTime;
    private GLookup messageStatus;

    public NotificationResponse() {
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public MessageResponse getBody() {
        return body;
    }

    public void setBody(MessageResponse body) {
        this.body = body;
    }

    public GLookup getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(GLookup notifyType) {
        this.notifyType = notifyType;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    public GLookup getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(GLookup messageStatus) {
        this.messageStatus = messageStatus;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
