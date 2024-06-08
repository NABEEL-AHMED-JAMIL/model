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
    private SourceTaskTypeResponse linkStt;
    private FormResponse linkForm;

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

    public SourceTaskTypeResponse getLinkStt() {
        return linkStt;
    }

    public void setLinkStt(SourceTaskTypeResponse linkStt) {
        this.linkStt = linkStt;
    }

    public FormResponse getLinkForm() {
        return linkForm;
    }

    public void setLinkForm(FormResponse linkForm) {
        this.linkForm = linkForm;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
