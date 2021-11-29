package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name="scheduler")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Scheduler extends BaseEntity {

	@GenericGenerator(
		name = "schedulerSequenceGenerator",
		strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
		parameters = {
			@Parameter(name = "sequence_name", value = "scheduler_source_Seq"),
			@Parameter(name = "initial_value", value = "1001"),
			@Parameter(name = "increment_size", value = "1")
		}
	)
	@Id
	@GeneratedValue(generator = "schedulerSequenceGenerator")
	private Long id;

	@Column(nullable = false,
	columnDefinition = "DATE")
	private LocalDate startDate;

	@Column(columnDefinition = "DATE")
	private LocalDate endDate;

	@Column(nullable = false,
	columnDefinition = "TIME")
	private LocalTime startTime;

	// mint,hr,daily,weekly,monthly
	@Column(nullable = false)
	private String frequency;

	// mint, hr entry
	private String recurrence;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id")
	private Job job;

	private LocalDateTime recurrenceTime;

	public Scheduler() {}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getRecurrence() {
		return recurrence;
	}
	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}

	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}

	public LocalDateTime getRecurrenceTime() {
		return recurrenceTime;
	}
	public void setRecurrenceTime(LocalDateTime recurrenceTime) {
		this.recurrenceTime = recurrenceTime;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}


}