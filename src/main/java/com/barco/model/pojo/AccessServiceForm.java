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
@Table(name = "access_service_form")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessServiceForm extends BaseEntity {

    @GenericGenerator(
        name = "accessServiceFormSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "access_service_form_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "accessServiceFormSequenceGenerator")
    private Long id;

    @Column(length = 1000, nullable = false)
    private String filedName;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    private Object filedValue;

    @Column(length = 250)
    private String filedType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "access_service_id")
    private AccessService accessService;

    public AccessServiceForm() {}

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFiledName() {
        return filedName;
    }
    public void setFiledName(String filedName) {
        this.filedName = filedName;
    }

    public Object getFiledValue() {
        return filedValue;
    }
    public void setFiledValue(Object filedValue) {
        this.filedValue = filedValue;
    }

    public String getFiledType() {
        return filedType;
    }
    public void setFiledType(String filedType) {
        this.filedType = filedType;
    }

    public AccessService getAccessService() {
        return accessService;
    }
    public void setAccessService(AccessService accessService) {
        this.accessService = accessService;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
