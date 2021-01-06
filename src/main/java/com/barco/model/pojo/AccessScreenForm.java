package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import javax.persistence.*;


/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "access_screen_form")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessScreenForm extends BaseEntity {

    @GenericGenerator(
        name = "accessScreenFormSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "access_screen_form_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "accessScreenFormSequenceGenerator")
    private Long id;

    @Column(length = 250, nullable = false)
    private String formName;

    @Type(type = "jsonb")
    @Column(nullable = false, columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private Object formDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "access_screen_id")
    private AccessScreen accessScreen;

    public AccessScreenForm() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFormName() {
        return formName;
    }
    public void setFormName(String formName) {
        this.formName = formName;
    }

    public Object getFormDetail() {
        return formDetail;
    }
    public void setFormDetail(Object formDetail) {
        this.formDetail = formDetail;
    }

    public AccessScreen getAccessScreen() {
        return accessScreen;
    }
    public void setAccessScreen(AccessScreen accessScreen) {
        this.accessScreen = accessScreen;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
