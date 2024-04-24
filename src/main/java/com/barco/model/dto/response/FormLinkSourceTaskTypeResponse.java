package com.barco.model.dto.response;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormLinkSourceTaskTypeResponse extends BaseEntity {

    private String serviceName; // yes
    private GLookup taskType; // yes
    private Boolean linkStatus;
    private Long formLinkStt;

    public FormLinkSourceTaskTypeResponse() {
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public GLookup getTaskType() {
        return taskType;
    }

    public void setTaskType(GLookup taskType) {
        this.taskType = taskType;
    }

    public Boolean getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(Boolean linkStatus) {
        this.linkStatus = linkStatus;
    }


    public Long getFormLinkStt() {
        return formLinkStt;
    }

    public void setFormLinkStt(Long formLinkStt) {
        this.formLinkStt = formLinkStt;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
