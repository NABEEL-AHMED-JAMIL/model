package com.barco.model.pojo;

import com.barco.model.util.lookup.JOB_STATUS;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "job_queue")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobQueue extends BaseEntity {

    @Column(name = "job_queue_key", nullable = false)
    private String jobQueueKey;

    @Column(name = "start_time",
        columnDefinition = "TIMESTAMP")
    private LocalDateTime startTime;

    @Column(name = "end_time",
        columnDefinition = "TIMESTAMP")
    private LocalDateTime endTime;

    @Column(name = "skip_time",
        columnDefinition = "TIMESTAMP")
    private LocalDateTime skipTime;

    @Column(name = "time_zone", nullable = false)
    private String timeZone;

    @Column(name = "job_status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private JOB_STATUS jobStatus;

    @ManyToOne
    @JoinColumn(name = "job_id", nullable = false)
    private SourceJob sourceJob;

    @Column(name = "job_status_message", length = 2500)
    private String jobStatusMessage;

    @Column(name = "skip_manual")
    private Boolean skipManual;

    @Column(name = "run_manual")
    private Boolean runManual;

    @Column(name = "job_send")
    private Boolean jobSend;

    @OneToMany(mappedBy = "jobQueue")
    private List<JobAuditLogs> jobAuditLogs;

    public JobQueue() {
    }

    public String getJobQueueKey() {
        return jobQueueKey;
    }

    public void setJobQueueKey(String jobQueueKey) {
        this.jobQueueKey = jobQueueKey;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getSkipTime() {
        return skipTime;
    }

    public void setSkipTime(LocalDateTime skipTime) {
        this.skipTime = skipTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public JOB_STATUS getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JOB_STATUS jobStatus) {
        this.jobStatus = jobStatus;
    }

    public SourceJob getSourceJob() {
        return sourceJob;
    }

    public void setSourceJob(SourceJob sourceJob) {
        this.sourceJob = sourceJob;
    }

    public String getJobStatusMessage() {
        return jobStatusMessage;
    }

    public void setJobStatusMessage(String jobStatusMessage) {
        this.jobStatusMessage = jobStatusMessage;
    }

    public Boolean getSkipManual() {
        return skipManual;
    }

    public void setSkipManual(Boolean skipManual) {
        this.skipManual = skipManual;
    }

    public Boolean getRunManual() {
        return runManual;
    }

    public void setRunManual(Boolean runManual) {
        this.runManual = runManual;
    }

    public Boolean getJobSend() {
        return jobSend;
    }

    public void setJobSend(Boolean jobSend) {
        this.jobSend = jobSend;
    }

    public List<JobAuditLogs> getJobAuditLogs() {
        return jobAuditLogs;
    }

    public void setJobAuditLogs(List<JobAuditLogs> jobAuditLogs) {
        this.jobAuditLogs = jobAuditLogs;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
