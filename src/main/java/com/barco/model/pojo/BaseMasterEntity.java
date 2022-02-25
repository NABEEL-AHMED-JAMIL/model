package com.barco.model.pojo;

import com.barco.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseMasterEntity {

    @Column(name = "created_at", nullable = false,
        columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(name = "created_by_id")
    private Long createdBy;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    public BaseMasterEntity() { }

    public BaseMasterEntity(Long createdBy, Status status) {
        this.createdBy = createdBy;
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}