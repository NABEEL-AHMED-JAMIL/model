package com.barco.model.dto.response;

import com.barco.model.dto.dform.response.FormData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceTaskResponse extends BaseEntity {

    private String taskName;
    private String description;
    private SourceTaskTypeResponse sourceTaskType;
    private FormData formData;

    public SourceTaskResponse() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SourceTaskTypeResponse getSourceTaskType() {
        return sourceTaskType;
    }

    public void setSourceTaskType(SourceTaskTypeResponse sourceTaskType) {
        this.sourceTaskType = sourceTaskType;
    }

    public FormData getFormData() {
        return formData;
    }

    public void setFormData(FormData formData) {
        this.formData = formData;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
