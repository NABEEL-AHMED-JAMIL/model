package com.barco.model.pojo;

import com.barco.model.util.lookup.EXECUTION;
import com.barco.model.util.lookup.JOB_STATUS;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "source_job")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceJob extends BaseEntity {

    @Column(name = "job_key", nullable = false)
    private String jobKey;

    // job name should be unique
    @Column(name = "job_name",
        length = 1000, nullable = false)
    private String jobName;

    // which class or method trigger
    @ManyToOne
    @JoinColumn(name = "task_id")
    private SourceTask sourceTask;

    // status :- blank,queue,running,fail,complete
    @Column(name = "job_status")
    @Enumerated(EnumType.ORDINAL)
    private JOB_STATUS jobStatus;

    // describe the last job run
    @Column(name = "last_job_run",
        columnDefinition = "TIMESTAMP")
    private LocalDateTime lastJobRun;

    @Column(name = "execution", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private EXECUTION execution;

    @Column(name = "priority", nullable = false)
    private Integer priority;

    @Column(name = "complete_job")
    private Boolean completeJob;

    @Column(name = "fail_job")
    private Boolean failJob;

    @Column(name = "skip_job")
    private Boolean skipJob;

    @OneToOne(mappedBy = "sourceJob",
        cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Scheduler scheduler;

    @OneToMany(mappedBy = "sourceJob")
    private List<JobQueue> jobQueues;

    public SourceJob() {
    }

    public String getJobKey() {
        return jobKey;
    }

    public void setJobKey(String jobKey) {
        this.jobKey = jobKey;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public SourceTask getSourceTask() {
        return sourceTask;
    }

    public void setSourceTask(SourceTask sourceTask) {
        this.sourceTask = sourceTask;
    }

    public JOB_STATUS getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JOB_STATUS jobStatus) {
        this.jobStatus = jobStatus;
    }

    public LocalDateTime getLastJobRun() {
        return lastJobRun;
    }

    public void setLastJobRun(LocalDateTime lastJobRun) {
        this.lastJobRun = lastJobRun;
    }

    public EXECUTION getExecution() {
        return execution;
    }

    public void setExecution(EXECUTION execution) {
        this.execution = execution;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getCompleteJob() {
        return completeJob;
    }

    public void setCompleteJob(Boolean completeJob) {
        this.completeJob = completeJob;
    }

    public Boolean getFailJob() {
        return failJob;
    }

    public void setFailJob(Boolean failJob) {
        this.failJob = failJob;
    }

    public Boolean getSkipJob() {
        return skipJob;
    }

    public void setSkipJob(Boolean skipJob) {
        this.skipJob = skipJob;
    }

    public Scheduler getScheduler() {
        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public List<JobQueue> getJobQueues() {
        return jobQueues;
    }

    public void setJobQueues(List<JobQueue> jobQueues) {
        this.jobQueues = jobQueues;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
