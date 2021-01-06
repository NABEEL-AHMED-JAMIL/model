package com.barco.model.batch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "batch_file_status")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchFileStatus {

    @GenericGenerator(
        name = "batchFileStatusSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "batch_file_status_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "batchFileStatusSequenceGenerator")
    private Long id;

    @Column(nullable = false)
    private Long appUserId;

    @Column(nullable = false)
    private Long batchId;

    @Column(nullable = false)
    private String batchStatus;

    private Timestamp batchTime;

    private String batchResponsePayload;

    public BatchFileStatus() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppUserId() {
        return appUserId;
    }
    public void setAppUserId(Long appUserId) {
        this.appUserId = appUserId;
    }

    public Long getBatchId() {
        return batchId;
    }
    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    public String getBatchStatus() {
        return batchStatus;
    }
    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public Timestamp getBatchTime() {
        return batchTime;
    }
    public void setBatchTime(Timestamp batchTime) {
        this.batchTime = batchTime;
    }

    public String getBatchResponsePayload() {
        return batchResponsePayload;
    }
    public void setBatchResponsePayload(String batchResponsePayload) {
        this.batchResponsePayload = batchResponsePayload;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
