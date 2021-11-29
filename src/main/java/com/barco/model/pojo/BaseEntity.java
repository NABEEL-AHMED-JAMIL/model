package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseEntity extends BaseMasterEntity {

    private Timestamp modifiedAt;

    @Column(name = "modified_by_id")
    private Long modifiedBy;

    public BaseEntity() { }

    @PreUpdate
    protected void onUpdate() {
        this.modifiedAt = new Timestamp(System.currentTimeMillis());
    }

    @PrePersist
    protected void onCreate() {
        super.setCreatedAt(new Timestamp(System.currentTimeMillis()));
    }

    public Timestamp getModifiedAt() {
        return modifiedAt;
    }
    public void setModifiedAt(Timestamp modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }
    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
