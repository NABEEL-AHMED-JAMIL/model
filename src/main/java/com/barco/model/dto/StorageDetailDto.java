package com.barco.model.dto;

import com.barco.model.enums.KeyType;
import com.barco.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorageDetailDto {

    private Long id;
    private String storageKeyName; // required
    private Object storageDetailJson; // required
    private KeyType keyType; // required
    private Timestamp createdAt;
    private Long createdBy; // required
    private Status status;

    public StorageDetailDto() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStorageKeyName() { return storageKeyName; }
    public void setStorageKeyName(String storageKeyName) { this.storageKeyName = storageKeyName; }

    public Object getStorageDetailJson() { return storageDetailJson; }
    public void setStorageDetailJson(Object storageDetailJson) { this.storageDetailJson = storageDetailJson; }

    public KeyType getKeyType() { return keyType; }
    public void setKeyType(KeyType keyType) { this.keyType = keyType; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }

    public Long getCreatedBy() { return createdBy; }
    public void setCreatedBy(Long createdBy) { this.createdBy = createdBy; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
