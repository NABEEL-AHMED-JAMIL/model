package com.barco.model.pojo;

import com.barco.model.enums.JobStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "job_queue")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobQueue extends BaseEntity {

	@GenericGenerator(
		name = "jobQueueSequenceGenerator",
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
		parameters = {
			@Parameter(name = "sequence_name", value = "job_queue_Seq"),
			@Parameter(name = "initial_value", value = "1000"),
			@Parameter(name = "increment_size", value = "1")
		}
	)
	@Id
	@GeneratedValue(generator = "jobQueueSequenceGenerator")
	private Long id;

	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime startTime;

	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime endTime;

	@Column(nullable = false)
	private JobStatus jobStatus;

	private Long jobId;

	private String jobStatusMessage;

	private Boolean isNotification;

	public JobQueue() {}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public JobStatus getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(JobStatus jobStatus) {
		this.jobStatus = jobStatus;
	}

	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getJobStatusMessage() {
		return jobStatusMessage;
	}
	public void setJobStatusMessage(String jobStatusMessage) {
		this.jobStatusMessage = jobStatusMessage;
	}

	public Boolean getNotification() {
		return isNotification;
	}
	public void setNotification(Boolean notification) {
		isNotification = notification;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}

}