package com.barco.model.pojo;

import com.barco.model.util.lookup.FREQUENCY;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "scheduler")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Scheduler extends BaseEntity {

    @Column(name = "start_date",
        nullable = false,
        columnDefinition = "DATE")
    private LocalDate startDate;

    @Column(name = "end_date",
        columnDefinition = "DATE")
    private LocalDate endDate;

    @Column(name = "start_time",
        nullable = false,
        columnDefinition = "TIME")
    private LocalTime startTime;

    // mint,hr,daily,weekly,monthly
    @Column(name = "frequency", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private FREQUENCY frequency;

    // mint, hr entry
    @Column(name = "recurrence")
    private Long recurrence;

    @Column(name = "recurrence_time")
    private LocalDateTime recurrenceTime;

    @Column(name = "time_zone", nullable = false)
    private String timeZone;

    @OneToOne
    @JoinColumn(name = "job_id", nullable = false)
    private SourceJob sourceJob;

    public Scheduler() {
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

    public FREQUENCY getFrequency() {
        return frequency;
    }

    public void setFrequency(FREQUENCY frequency) {
        this.frequency = frequency;
    }

    public Long getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(Long recurrence) {
        this.recurrence = recurrence;
    }

    public LocalDateTime getRecurrenceTime() {
        return recurrenceTime;
    }

    public void setRecurrenceTime(LocalDateTime recurrenceTime) {
        this.recurrenceTime = recurrenceTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public SourceJob getSourceJob() {
        return sourceJob;
    }

    public void setSourceJob(SourceJob sourceJob) {
        this.sourceJob = sourceJob;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
