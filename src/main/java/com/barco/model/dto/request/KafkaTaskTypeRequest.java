package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KafkaTaskTypeRequest {

    private Long kafkaId;
    private String serviceUrl;
    private Integer numPartitions; // yes
    private String topicName; // yes
    private String topicPattern; // yes

    public KafkaTaskTypeRequest() {
    }

    public Long getKafkaId() {
        return kafkaId;
    }

    public void setKafkaId(Long kafkaId) {
        this.kafkaId = kafkaId;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public Integer getNumPartitions() {
        return numPartitions;
    }

    public void setNumPartitions(Integer numPartitions) {
        this.numPartitions = numPartitions;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicPattern() {
        return topicPattern;
    }

    public void setTopicPattern(String topicPattern) {
        this.topicPattern = topicPattern;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}