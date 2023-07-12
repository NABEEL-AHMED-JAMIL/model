package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "notification_audit")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationAudit {

    @GenericGenerator(
        name = "notificationAuditSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "notification_audit_source_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        })
    @Id
    @Column(name = "notification_audit_id")
    @GeneratedValue(generator = "notificationAuditSequenceGenerator")
    private Long notAuditId;

    @ManyToOne
    @JoinColumn(name = "not_for")
    protected AppUser notFor;


    @Column(name = "message",
        nullable = false)
    private String message;

    // job|email
    @Column(name = "type",
        nullable = false)
    private Long type;

    // base on look-up
    @Column(name = "expire_time",
        nullable = false)
    private Long expireTime;

    // read|un-read
    @Column(name = "not_state",
        nullable = false)
    private Long notStatus;

    @Column(name = "date_created",
        nullable = false)
    private Timestamp dateCreated;

    public NotificationAudit() {}

    public Long getNotAuditId() {
        return notAuditId;
    }

    public void setNotAuditId(Long notAuditId) {
        this.notAuditId = notAuditId;
    }

    public AppUser getNotFor() {
        return notFor;
    }

    public void setNotFor(AppUser notFor) {
        this.notFor = notFor;
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

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @PrePersist
    protected void onCreate() {
        this.dateCreated = new Timestamp(System.currentTimeMillis());
    }


}
