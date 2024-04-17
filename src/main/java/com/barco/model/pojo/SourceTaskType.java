package com.barco.model.pojo;

import com.barco.model.util.lookup.TASK_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "source_task_type")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTaskType extends BaseEntity {

    @Column(name = "service_name", nullable = false)
    private String serviceName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "task_type",
        nullable = false, updatable = false)
    private TASK_TYPE taskType;

    @OneToOne(mappedBy = "sourceTaskType", cascade=CascadeType.ALL,
        fetch = FetchType.LAZY, optional = false)
    private ApiTaskType apiTaskType;

    @OneToOne(mappedBy = "sourceTaskType", cascade = CascadeType.ALL,
        fetch = FetchType.LAZY, optional = false)
    private KafkaTaskType kafkaTaskType;

    @ManyToOne
    @JoinColumn(name = "credential_id")
    private Credential credential;

    @OneToMany(mappedBy = "sourceTaskType", fetch = FetchType.LAZY)
    private List<SourceTask> sourceTasks;

    @OneToMany(mappedBy="sourceTaskType", fetch = FetchType.LAZY)
    private List<GroupsLinkSourceTaskType> groupsLinkSourceTaskTypes;

    @OneToMany(mappedBy="sourceTaskType", fetch = FetchType.LAZY)
    private List<GenFormLinkSourceTaskType> genFormLinkSourceTaskTypes;

    public SourceTaskType() {}

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TASK_TYPE getTaskType() {
        return taskType;
    }

    public void setTaskType(TASK_TYPE taskType) {
        this.taskType = taskType;
    }

    public ApiTaskType getApiTaskType() {
        return apiTaskType;
    }

    public void setApiTaskType(ApiTaskType apiTaskType) {
        this.apiTaskType = apiTaskType;
    }

    public KafkaTaskType getKafkaTaskType() {
        return kafkaTaskType;
    }

    public void setKafkaTaskType(KafkaTaskType kafkaTaskType) {
        this.kafkaTaskType = kafkaTaskType;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public List<SourceTask> getSourceTasks() {
        return sourceTasks;
    }

    public void setSourceTasks(List<SourceTask> sourceTasks) {
        this.sourceTasks = sourceTasks;
    }

    public List<GroupsLinkSourceTaskType> getGroupsLinkSourceTaskTypes() {
        return groupsLinkSourceTaskTypes;
    }

    public void setGroupsLinkSourceTaskTypes(List<GroupsLinkSourceTaskType> groupsLinkSourceTaskTypes) {
        this.groupsLinkSourceTaskTypes = groupsLinkSourceTaskTypes;
    }

    public List<GenFormLinkSourceTaskType> getGenFormLinkSourceTaskTypes() {
        return genFormLinkSourceTaskTypes;
    }

    public void setGenFormLinkSourceTaskTypes(List<GenFormLinkSourceTaskType> genFormLinkSourceTaskTypes) {
        this.genFormLinkSourceTaskTypes = genFormLinkSourceTaskTypes;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
