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

    // class name mean which thread will use this detail
    // example :- service1, service2, service3
    @Column(nullable = false)
    private String className;

    // this taskDetailJson will be part of service
    @Type(type = "jsonb")
    @Column(unique = true, nullable = false, columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private Object taskDetailJson;

    public Task() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public Object getTaskDetailJson() { return taskDetailJson; }
    public void setTaskDetailJson(Object taskDetailJson) { this.taskDetailJson = taskDetailJson; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
