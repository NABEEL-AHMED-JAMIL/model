package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;


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
    protected Long id;

    @Column(length = 1000,unique=true)
    private String jobName;

    @Column(length = 10000)
    private String description;

    private String executionType;

    private String jobStatus;

    @Column(columnDefinition = "boolean default false")
    private Boolean isDisabled;

    private Date lastJobRun;

    private Date nextJobRun;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_user_id")
    private AppUser appUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id")
    private Task task;

    public Job() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getJobName() { return jobName; }
    public void setJobName(String jobName) { this.jobName = jobName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getExecutionType() { return executionType; }
    public void setExecutionType(String executionType) { this.executionType = executionType; }

    public String getJobStatus() { return jobStatus; }
    public void setJobStatus(String jobStatus) { this.jobStatus = jobStatus; }

    public Boolean getDisabled() { return isDisabled; }
    public void setDisabled(Boolean disabled) { isDisabled = disabled; }

    public Date getLastJobRun() { return lastJobRun; }
    public void setLastJobRun(Date lastJobRun) { this.lastJobRun = lastJobRun; }

    public Date getNextJobRun() { return nextJobRun; }
    public void setNextJobRun(Date nextJobRun) { this.nextJobRun = nextJobRun; }

    public AppUser getAppUser() { return appUser; }
    public void setAppUser(AppUser appUser) { this.appUser = appUser; }

    public Task getTask() { return task; }
    public void setTask(Task task) { this.task = task; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}