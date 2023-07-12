package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateRegRequest {

    private Long templateId;
    private String templateName;
    private Long templateType;
    private Long status;
    private String templateContent;
    private ParseRequest accessUserDetail;

    public TemplateRegRequest() {
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Long getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Long templateType) {
        this.templateType = templateType;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public ParseRequest getAccessUserDetail() {
        return accessUserDetail;
    }

    public void setAccessUserDetail(ParseRequest accessUserDetail) {
        this.accessUserDetail = accessUserDetail;
    }

    public void addAccessUserDetail(String username) {
        ParseRequest accessUserDetail = new ParseRequest();
        accessUserDetail.setUsername(username);
        this.setAccessUserDetail(accessUserDetail);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
