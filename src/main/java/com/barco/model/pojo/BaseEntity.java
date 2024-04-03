package com.barco.model.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_created", nullable = false)
    private Timestamp dateCreated;

    @Column(name = "date_updated")
    private Timestamp dateUpdated;

    @ManyToOne
    @JoinColumn(name="created_by_id")
    private AppUser createdBy;

    @ManyToOne
    @JoinColumn(name="updated_by_id")
    private AppUser updatedBy;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private APPLICATION_STATUS status;

    public BaseEntity() {
    }

    @PrePersist
    public void onCreate() {
        this.dateCreated = new Timestamp((System.currentTimeMillis()));
        this.dateUpdated =  this.dateCreated;
    }

    @PreUpdate
    public void onUpdate() {
        this.setDateUpdated(new Timestamp((System.currentTimeMillis())));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Timestamp dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public AppUser getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(AppUser createdBy) {
        this.createdBy = createdBy;
    }

    public AppUser getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(AppUser updatedBy) {
        this.updatedBy = updatedBy;
    }

    public APPLICATION_STATUS getStatus() {
        return status;
    }

    public void setStatus(APPLICATION_STATUS status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
