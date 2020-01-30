package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Nabeel.amd
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchJobLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "timestamp default CURRENT_TIMESTAMP", nullable = false)
    private Timestamp lookTime;

    @Column(name = "log", nullable = false)
    private String log;

    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "batch_job_id")
    private Long batch_job_id;

    @Column(name = "scheduler_id")
    private Long scheduler_id;

    public BatchJobLogs() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Timestamp getLookTime() { return lookTime; }
    public void setLookTime(Timestamp lookTime) { this.lookTime = lookTime; }

    public String getLog() { return log; }
    public void setLog(String log) { this.log = log; }

    public Long getMemberId() { return memberId; }
    public void setMemberId(Long memberId) { this.memberId = memberId; }

    public Long getBatch_job_id() { return batch_job_id; }
    public void setBatch_job_id(Long batch_job_id) { this.batch_job_id = batch_job_id; }

    public Long getScheduler_id() { return scheduler_id; }
    public void setScheduler_id(Long scheduler_id) { this.scheduler_id = scheduler_id; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
