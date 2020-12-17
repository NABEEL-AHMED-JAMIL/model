package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "job_audit_logs")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobAuditLogs extends BaseMasterEntity {

    @GenericGenerator(
        name = "jobAuditLogsSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "job_audit_logs_source_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "jobAuditLogsSequenceGenerator")
    private Long id;

    @Column(length = 1000, nullable = false)
    private String jobName;

    @Column(nullable = false)
    private String taskName;

    @Column(nullable = false)
    private String className;

    private String logsDetail;

    public JobAuditLogs() { }

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

    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
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
