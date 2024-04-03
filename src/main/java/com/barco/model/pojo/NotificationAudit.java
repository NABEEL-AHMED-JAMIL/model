package com.barco.model.pojo;

import com.barco.model.util.lookup.NOTIFICATION_STATUS;
import com.barco.model.util.lookup.NOTIFICATION_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "notification_audit")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationAudit extends BaseEntity  {

    @ManyToOne
    @JoinColumn(name = "send_to")
    protected AppUser sendTo;

    @Column(name = "message", nullable = false)
    private String message;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "notify_type", nullable = false)
    private NOTIFICATION_TYPE notifyType;

    // base on look-up
    @Column(name = "expire_time", nullable = false)
    private Timestamp expireTime;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "message_state", nullable = false)
    private NOTIFICATION_STATUS messageStatus;

    public NotificationAudit() {}

    public AppUser getSendTo() {
        return sendTo;
    }

    public void setSendTo(AppUser sendTo) {
        this.sendTo = sendTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NOTIFICATION_TYPE getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(NOTIFICATION_TYPE notifyType) {
        this.notifyType = notifyType;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }

    public NOTIFICATION_STATUS getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(NOTIFICATION_STATUS messageStatus) {
        this.messageStatus = messageStatus;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}