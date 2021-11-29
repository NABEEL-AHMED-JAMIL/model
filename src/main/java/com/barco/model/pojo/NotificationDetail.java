package com.barco.model.pojo;

import com.barco.model.JsonBinaryType;
import com.barco.model.enums.NotificationFlag;
import com.barco.model.enums.NotificationType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "notification_detail")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class NotificationDetail extends BaseEntity {

    @GenericGenerator(
        name = "notificationDetailSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "notification_detail_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "notificationDetailSequenceGenerator")
    private Long id;

    @Type(type = "jsonb")
    @Column(nullable = false, columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private Object detail;

    @Enumerated(EnumType.STRING)
    private NotificationFlag notificationFlag;

    private Timestamp sendTime;

    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    public NotificationDetail() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Object getDetail() {
        return detail;
    }
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public NotificationFlag getNotificationFlag() {
        return notificationFlag;
    }
    public void setNotificationFlag(NotificationFlag notificationFlag) {
        this.notificationFlag = notificationFlag;
    }

    public Timestamp getSendTime() {
        return sendTime;
    }
    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }
    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
