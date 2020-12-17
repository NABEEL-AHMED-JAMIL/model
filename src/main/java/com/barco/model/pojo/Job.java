package com.barco.model.pojo;

import com.barco.model.enums.Execution;
import com.barco.model.enums.JobStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "job")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Job extends BaseEntity {

    @GenericGenerator(
        name = "jobSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "job_source_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "jobSequenceGenerator")
    private Long id;

    @Column(length = 1000, nullable = false)
    private String jobName;

    @Column(length = 10000)
    private String description;

    // auto-(auto,manual)
    @Column(nullable = false)
    private Execution executionType;

    @Column(nullable = true)
    private JobStatus jobStatus;

    private Date lastJobRun;

    private Date nextJobRun;

    private Date skipJobRun;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private Task task;

    private String notification;

    public Job() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Execution getExecutionType() {
        return executionType;
    }
    public void setExecutionType(Execution executionType) {
        this.executionType = executionType;
    }

    public JobStatus getJobStatus() {
        return jobStatus;
    }
    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Date getLastJobRun() {
        return lastJobRun;
    }
    public void setLastJobRun(Date lastJobRun) {
        this.lastJobRun = lastJobRun;
    }

    public Date getNextJobRun() {
        return nextJobRun;
    }
    public void setNextJobRun(Date nextJobRun) {
        this.nextJobRun = nextJobRun;
    }

    public Date getSkipJobRun() {
        return skipJobRun;
    }
    public void setSkipJobRun(Date skipJobRun) {
        this.skipJobRun = skipJobRun;
    }

    public Task getTask() {
        return task;
    }
    public void setTask(Task task) {
        this.task = task;
    }

    public String getNotification() {
        return notification;
    }
    public void setNotification(String notification) {
        this.notification = notification;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
