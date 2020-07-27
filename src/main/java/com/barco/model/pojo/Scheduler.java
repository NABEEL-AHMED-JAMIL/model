package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name="scheduler")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Scheduler extends BaseEntity {

    @GenericGenerator(
        name = "schedulerSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
			@Parameter(name = "sequence_name", value = "scheduler_Seq"),
			@Parameter(name = "initial_value", value = "1000"),
			@Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "schedulerSequenceGenerator")
    protected Long id;
    
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Temporal(TemporalType.DATE)
	private Date endDate;
    
	private Time time;

	private String frequency;
	
	private String recurrence;
	
	private String timeZone;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private Job jobId;

	public Scheduler() {}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public Date getStartDate() { return startDate; }
	public void setStartDate(Date startDate) { this.startDate = startDate; }

	public Date getEndDate() { return endDate; }
	public void setEndDate(Date endDate) { this.endDate = endDate; }

	public Time getTime() { return time; }
	public void setTime(Time time) { this.time = time; }

	public String getFrequency() { return frequency; }
	public void setFrequency(String frequency) { this.frequency = frequency; }

	public String getRecurrence() { return recurrence; }
	public void setRecurrence(String recurrence) { this.recurrence = recurrence; }

	public String getTimeZone() { return timeZone; }
	public void setTimeZone(String timeZone) { this.timeZone = timeZone; }

	public Job getJobId() { return jobId; }
	public void setJobId(Job jobId) { this.jobId = jobId; }

	@Override
	public String toString() { return new Gson().toJson(this); }

}