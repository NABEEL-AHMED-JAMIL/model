package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.springframework.http.HttpMethod;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "api_task_type")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiTaskType extends BaseEntity {

    @Column(name = "api_url", nullable = false)
    private String apiUrl;

    @Column(name = "http_method", nullable = false)
    private HttpMethod httpMethod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stt_id")
    private SourceTaskType sourceTaskType;

    public ApiTaskType() {
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod;
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
