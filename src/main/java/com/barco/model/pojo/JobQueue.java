package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;


@Entity
@Table(name = "job_queue")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobQueue extends BaseMasterEntity {

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
    protected Long id;
    
    private Long appUserId;

    private Long schedulerId;
    
    private Time schedulerTime;
    
	public JobQueue() {}

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public Long getAppUserId() { return appUserId; }
	public void setAppUserId(Long appUserId) { this.appUserId = appUserId; }

	public Long getSchedulerId() { return schedulerId; }
	public void setSchedulerId(Long schedulerId) { this.schedulerId = schedulerId; }

	public Time getSchedulerTime() { return schedulerTime; }
	public void setSchedulerTime(Time schedulerTime) { this.schedulerTime = schedulerTime; }

	@Override
	public String toString() { return new Gson().toJson(this); }

}