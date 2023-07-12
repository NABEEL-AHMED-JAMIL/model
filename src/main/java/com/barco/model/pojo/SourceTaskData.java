package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "source_task_data")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTaskData {

    @GenericGenerator(
        name = "sourceTaskDataSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "source_task_data_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @Column(name = "task_data_id")
    @GeneratedValue(generator = "sourceTaskDataSequenceGenerator")
    private Long taskDataId;

    @ManyToOne
    @JoinColumn(name = "task_detail_id")
    private SourceTask sourceTask;

    @Column(name = "lkf_section_uuid", nullable = false)
    private UUID lkfSectionUUid;

    @Column(name = "lkf_control_uuid", nullable = false)
    private UUID lkfSectionControl;

    @Column(name = "text_control_val")
    private String textControlValue;

    @Column(name = "checked_control_val")
    private Boolean checkedControlValue;

    @Column(name = "select_control_val")
    private Long selectControlValue;

    @Column(name = "datetime_control_val",
        columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTimeControlValue;

    @Column(name = "time_control_val",
        columnDefinition = "TIMESTAMP")
    private LocalTime timeValue;

    // in case of multi select and multi check box
    @Column(name = "lookup_id")
    private Long lookupId;

    @ManyToOne
    @JoinColumn(name="app_user_id")
    private AppUser appUser;

    @Column(name = "status", nullable = false)
    private Long status;

    @Column(name = "date_created")
    private Timestamp dateCreated;

    public SourceTaskData() {
    }

    @PrePersist
    protected void onCreate() {
        this.dateCreated = new Timestamp(System.currentTimeMillis());
    }

    public Long getTaskDataId() {
        return taskDataId;
    }

    public void setTaskDataId(Long taskDataId) {
        this.taskDataId = taskDataId;
    }

    public SourceTask getSourceTask() {
        return sourceTask;
    }

    public void setSourceTask(SourceTask sourceTask) {
        this.sourceTask = sourceTask;
    }

    public UUID getLkfSectionUUid() {
        return lkfSectionUUid;
    }

    public void setLkfSectionUUid(UUID lkfSectionUUid) {
        this.lkfSectionUUid = lkfSectionUUid;
    }

    public UUID getLkfSectionControl() {
        return lkfSectionControl;
    }

    public void setLkfSectionControl(UUID lkfSectionControl) {
        this.lkfSectionControl = lkfSectionControl;
    }

    public String getTextControlValue() {
        return textControlValue;
    }

    public void setTextControlValue(String textControlValue) {
        this.textControlValue = textControlValue;
    }

    public Boolean getCheckedControlValue() {
        return checkedControlValue;
    }

    public void setCheckedControlValue(Boolean checkedControlValue) {
        this.checkedControlValue = checkedControlValue;
    }

    public Long getSelectControlValue() {
        return selectControlValue;
    }

    public void setSelectControlValue(Long selectControlValue) {
        this.selectControlValue = selectControlValue;
    }

    public LocalDateTime getDateTimeControlValue() {
        return dateTimeControlValue;
    }

    public void setDateTimeControlValue(LocalDateTime dateTimeControlValue) {
        this.dateTimeControlValue = dateTimeControlValue;
    }

    public LocalTime getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(LocalTime timeValue) {
        this.timeValue = timeValue;
    }

    public Long getLookupId() {
        return lookupId;
    }

    public void setLookupId(Long lookupId) {
        this.lookupId = lookupId;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
