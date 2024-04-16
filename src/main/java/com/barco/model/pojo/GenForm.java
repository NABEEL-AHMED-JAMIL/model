package com.barco.model.pojo;

import com.barco.model.util.lookup.FORM_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "gen_form")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenForm extends BaseEntity {

    @Column(name = "form_name", nullable = false)
    private String formName;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "home_page")
    private String homePage;

    @Column(name = "service_id")
    private String serviceId;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "form_type", nullable = false)
    private FORM_TYPE formType;

    @OneToMany(mappedBy="genForm")
    private List<GenFormLinkSourceTaskType> genFormLinkSourceTaskTypes;

    public GenForm() {
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public FORM_TYPE getFormType() {
        return formType;
    }

    public void setFormType(FORM_TYPE formType) {
        this.formType = formType;
    }

    public List<GenFormLinkSourceTaskType> getGenFormLinkSourceTaskTypes() {
        return genFormLinkSourceTaskTypes;
    }

    public void setGenFormLinkSourceTaskTypes(List<GenFormLinkSourceTaskType> genFormLinkSourceTaskTypes) {
        this.genFormLinkSourceTaskTypes = genFormLinkSourceTaskTypes;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
