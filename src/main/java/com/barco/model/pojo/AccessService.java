package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "access_service")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessService extends BaseEntity {

    @GenericGenerator(
        name = "accessServiceSequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "accessService_Seq"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1000"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "accessServiceSequenceGenerator")
    private Long id;
    @Column(nullable = false, unique = true)
    private String serviceName;
    @Column(nullable = false, unique = true)
    private String internalServiceName;

    public AccessService() { }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public String getInternalServiceName() { return internalServiceName; }
    public void setInternalServiceName(String internalServiceName) { this.internalServiceName = internalServiceName; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
