package com.barco.model.pojo.cse;

import com.barco.model.pojo.NamedTokenDetail;
import com.barco.model.pojo.BaseEntity;
import com.barco.model.pojo.aoe.Organization;
import com.barco.model.lookup.TEMPLATE_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_template")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppTemplate extends BaseEntity {

    @Embedded
    private NamedTokenDetail namedTokenDetail;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", columnDefinition = "text",
        nullable = false)
    private String content;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "template_type", nullable = false)
    private TEMPLATE_TYPE templateType;

    @Column(name = "is_system", nullable = false)
    private Boolean isSystem = false;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "org_id")
    protected Organization organization;

    public AppTemplate() {}

    public NamedTokenDetail getNamedTokenDetail() {
        return namedTokenDetail;
    }

    public void setNamedTokenDetail(NamedTokenDetail namedTokenDetail) {
        this.namedTokenDetail = namedTokenDetail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TEMPLATE_TYPE getTemplateType() {
        return templateType;
    }

    public void setTemplateType(TEMPLATE_TYPE templateType) {
        this.templateType = templateType;
    }

    public Boolean getSystem() {
        return isSystem;
    }

    public void setSystem(Boolean system) {
        isSystem = system;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}