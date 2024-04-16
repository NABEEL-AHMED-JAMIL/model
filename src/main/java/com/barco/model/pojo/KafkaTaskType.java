package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "kafka_task_type")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KafkaTaskType extends BaseEntity {

    @Column(name = "service_url", nullable = false)
    private String serviceUrl;

    @Column(name = "topic_name", nullable = false)
    private String topicName;

    @Column(name = "num_partitions", nullable = false)
    private Integer numPartitions; // map 3

    @Column(name = "topic_pattern", nullable = false)
    private String topicPattern;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stt_id")
    private SourceTaskType sourceTaskType;

    public KafkaTaskType() {
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Integer getNumPartitions() {
        return numPartitions;
    }

    public void setNumPartitions(Integer numPartitions) {
        this.numPartitions = numPartitions;
    }

    public String getTopicPattern() {
        return topicPattern;
    }

    public void setTopicPattern(String topicPattern) {
        this.topicPattern = topicPattern;
    }

    public SourceTaskType getSourceTaskType() {
        return sourceTaskType;
    }

    public void setSourceTaskType(SourceTaskType sourceTaskType) {
        this.sourceTaskType = sourceTaskType;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
