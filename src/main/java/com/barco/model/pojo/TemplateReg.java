package com.barco.model.pojo;

import com.barco.model.util.lookup.EMAIL_TEMPLATE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 * use to store the xml config & html for html etc.
 */
@Entity
@Table(name = "template_reg")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TemplateReg extends BaseEntity {

    @Column(name = "template_name",
        nullable = false, unique = true)
    private String templateName;

    @Column(name = "template_content",
        columnDefinition = "text", nullable = false)
    private String templateContent;

    public TemplateReg() {
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
