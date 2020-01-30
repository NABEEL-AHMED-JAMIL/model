package com.barco.model.pojo;

import com.barco.model.enums.Frequency;
import com.google.gson.Gson;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

/**
 * @author Nabeel.amd
 */
@Entity
@Table(name = "scheduler")
public class Scheduler extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // date for the start scheduler
    @Temporal(TemporalType.DATE)
    private Date start_date;

    // date for the end scheduler
    @Temporal(TemporalType.DATE)
    private Date end_date;

    // time to start the scheduler
    private Time time;

    // Daily,Weekly,Monthly
    @Enumerated(EnumType.STRING)
    private Frequency frequency;

    private String time_zone;

    @ManyToOne
    @JoinColumn(name = "batch_job", nullable = false)
    private BatchJob batchJob;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    public Scheduler() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Date getStart_date() { return start_date; }
    public void setStart_date(Date start_date) { this.start_date = start_date; }

    public Date getEnd_date() { return end_date; }
    public void setEnd_date(Date end_date) { this.end_date = end_date; }

    public Time getTime() { return time; }
    public void setTime(Time time) { this.time = time; }

    public Frequency getFrequency() { return frequency; }
    public void setFrequency(Frequency frequency) { this.frequency = frequency; }

    public String getTime_zone() { return time_zone; }
    public void setTime_zone(String time_zone) { this.time_zone = time_zone; }

    public BatchJob getBatchJob() { return batchJob; }
    public void setBatchJob(BatchJob batchJob) { this.batchJob = batchJob; }

    public Long getMemberId() { return memberId; }
    public void setMemberId(Long memberId) { this.memberId = memberId; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
