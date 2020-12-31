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
    private Long jobId;

    private String logsDetail;

    public JobAuditLogs() { }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }
    public void setJobId(Long jobId) {
        this.jobId = jobId;
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
