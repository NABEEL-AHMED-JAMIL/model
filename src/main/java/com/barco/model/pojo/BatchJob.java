package com.barco.model.pojo;

import com.barco.model.enums.Execution;
import com.barco.model.enums.JobStatus;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel.amd
 */
@Entity
@Table(name = "batch_job")
public class BatchJob extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "job_name", nullable = false, unique = true)
    private String job_name;

    @Column(name = "class_name", nullable = false)
    private String class_name;

    private String json_detail;

    @Column(name = "description", nullable = false)
    private String description;

    // if execution is Auto then no need to add the scheduler
    @Enumerated(EnumType.STRING)
    @Column(name = "execution", nullable = false)
    private Execution execution;

    private String email_addresses;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_status")
    private JobStatus jobStatus;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "is_disabled", nullable = false)
    private Boolean is_disabled = false;

    private Boolean is_delete;

    private String error;

    private String error_description;

    private Integer time_executed;

    private Integer total_fail;

    @Column(name = "priority", nullable = false)
    private Integer priority;

    public BatchJob() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getJob_name() { return job_name; }
    public void setJob_name(String job_name) { this.job_name = job_name; }

    public String getClass_name() { return class_name; }
    public void setClass_name(String class_name) { this.class_name = class_name; }

    public String getJson_detail() { return json_detail; }
    public void setJson_detail(String json_detail) { this.json_detail = json_detail; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Execution getExecution() { return execution; }
    public void setExecution(Execution execution) { this.execution = execution; }

    public String getEmail_addresses() { return email_addresses; }
    public void setEmail_addresses(String email_addresses) { this.email_addresses = email_addresses; }

    public JobStatus getJobStatus() { return jobStatus; }
    public void setJobStatus(JobStatus jobStatus) { this.jobStatus = jobStatus; }

    public Long getMemberId() { return memberId; }
    public void setMemberId(Long memberId) { this.memberId = memberId; }

    public Boolean getIs_disabled() { return is_disabled; }
    public void setIs_disabled(Boolean is_disabled) { this.is_disabled = is_disabled; }

    public Boolean getIs_delete() { return is_delete; }
    public void setIs_delete(Boolean is_delete) { this.is_delete = is_delete; }

    public String getError() { return error; }
    public void setError(String error) { this.error = error; }

    public String getError_description() { return error_description; }
    public void setError_description(String error_description) { this.error_description = error_description; }

    public Integer getTime_executed() { return time_executed; }
    public void setTime_executed(Integer time_executed) { this.time_executed = time_executed; }

    public Integer getTotal_fail() { return total_fail; }
    public void setTotal_fail(Integer total_fail) { this.total_fail = total_fail; }

    public Integer getPriority() { return priority; }
    public void setPriority(Integer priority) { this.priority = priority; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
