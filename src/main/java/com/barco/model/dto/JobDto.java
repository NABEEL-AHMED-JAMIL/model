package com.barco.model.dto;

import com.barco.model.enums.Execution;
import com.barco.model.enums.JobStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.Date;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobDto {

    private Long id;
    private String jobName; // required
    private String description;
    private Execution executionType; // required
    private JobStatus jobStatus;
    private Date lastJobRun;
    private Date nextJobRun;
    private Long createdBy; // required
    private TaskDto task; // required
    private List<SchedulerDto> schedulers; // optional only 5 schedulers can be add
    private String notification; // optional

    public JobDto() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getJobName() { return jobName; }
    public void setJobName(String jobName) { this.jobName = jobName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Execution getExecutionType() { return executionType; }
    public void setExecutionType(Execution executionType) { this.executionType = executionType; }

    public JobStatus getJobStatus() { return jobStatus; }
    public void setJobStatus(JobStatus jobStatus) { this.jobStatus = jobStatus; }

    public Date getLastJobRun() { return lastJobRun; }
    public void setLastJobRun(Date lastJobRun) { this.lastJobRun = lastJobRun; }

    public Date getNextJobRun() { return nextJobRun; }
    public void setNextJobRun(Date nextJobRun) { this.nextJobRun = nextJobRun; }

    public Long getCreatedBy() { return createdBy; }
    public void setCreatedBy(Long createdBy) { this.createdBy = createdBy; }

    public TaskDto getTask() { return task; }
    public void setTask(TaskDto task) { this.task = task; }

    public List<SchedulerDto> getSchedulers() { return schedulers; }
    public void setSchedulers(List<SchedulerDto> schedulers) { this.schedulers = schedulers; }

    public String getNotification() { return notification; }
    public void setNotification(String notification) { this.notification = notification; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
