package com.barco.model.pojo;

import com.barco.model.enums.JobStatus;
import com.google.gson.Gson;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Timer;
import javax.persistence.*;

/**
 * @author Nabeel.amd
 */
@Entity
@Table(name = "job_queue")
public class JobQueue extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_status")
    private JobStatus jobStatus;

    @ManyToOne
    @JoinColumn(name = "batch_job")
    private BatchJob batchJob;

    @ManyToOne
    @JoinColumn(name = "scheduler_id")
    private Scheduler scheduler;
    private Time schedulerTime;

    public JobQueue() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public JobStatus getJobStatus() { return jobStatus; }
    public void setJobStatus(JobStatus jobStatus) { this.jobStatus = jobStatus; }

    public BatchJob getBatchJob() { return batchJob; }
    public void setBatchJob(BatchJob batchJob) { this.batchJob = batchJob; }

    public Scheduler getScheduler() { return scheduler; }
    public void setScheduler(Scheduler scheduler) { this.scheduler = scheduler; }

    public Time getSchedulerTime() { return schedulerTime; }
    public void setSchedulerTime(Time schedulerTime) { this.schedulerTime = schedulerTime; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
