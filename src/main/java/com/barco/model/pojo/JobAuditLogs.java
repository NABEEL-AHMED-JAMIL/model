package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "job_audit_logs")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobAuditLogs extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "job_queue_id", nullable = false)
    private JobQueue jobQueue;

    @Column(name = "log_detail",
        nullable = false, length = 2500)
    private String logsDetail;

    public JobAuditLogs() {
    }

    public JobQueue getJobQueue() {
        return jobQueue;
    }

    public void setJobQueue(JobQueue jobQueue) {
        this.jobQueue = jobQueue;
    }

    public String getLogsDetail() {
        return logsDetail;
    }

    public void setLogsDetail(String logsDetail) {
        this.logsDetail = logsDetail;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
