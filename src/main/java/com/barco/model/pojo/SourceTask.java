package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "source_task")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTask extends BaseEntity {

    @Column(name = "task_name")
    private String taskName;

    @ManyToOne
    @JoinColumn(name = "stt_id")
    private SourceTaskType sourceTaskType;

    @OneToMany(mappedBy = "sourceTask")
    private List<SourceTaskData> sourceTaskData;

    public SourceTask() {}

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public SourceTaskType getSourceTaskType() {
        return sourceTaskType;
    }

    public void setSourceTaskType(SourceTaskType sourceTaskType) {
        this.sourceTaskType = sourceTaskType;
    }

    public List<SourceTaskData> getSourceTaskData() {
        return sourceTaskData;
    }

    public void setSourceTaskData(List<SourceTaskData> sourceTaskData) {
        this.sourceTaskData = sourceTaskData;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}