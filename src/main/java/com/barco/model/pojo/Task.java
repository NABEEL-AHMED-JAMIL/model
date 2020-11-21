package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import javax.persistence.*;


@Entity
@Table(name = "task")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task extends BaseEntity {

    @GenericGenerator(
        name = "triggerSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "trigger_source_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "triggerSequenceGenerator")
    private Long id;

    @Column(nullable = false)
    private String taskName;

    // class name mean which thread will use this detail example :- service1, service2, service3
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "access_service_id", nullable = false)
    private AccessService accessService; // replace with service class

    // this taskDetailJson will be part of service
    @Type(type = "jsonb")
    @Column(nullable = false, columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private Object taskDetailJson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storage_id")
    private StorageDetail storageDetail;

    public Task() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTaskName() { return taskName; }
    public void setTaskName(String taskName) { this.taskName = taskName; }

    public AccessService getAccessService() { return accessService; }
    public void setAccessService(AccessService accessService) { this.accessService = accessService; }

    public Object getTaskDetailJson() { return taskDetailJson; }
    public void setTaskDetailJson(Object taskDetailJson) { this.taskDetailJson = taskDetailJson; }

    public StorageDetail getStorageDetail() { return storageDetail; }
    public void setStorageDetail(StorageDetail storageDetail) { this.storageDetail = storageDetail; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
