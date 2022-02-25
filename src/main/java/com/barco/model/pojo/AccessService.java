package com.barco.model.pojo;

import com.barco.model.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
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
            @Parameter(name = "sequence_name", value = "accessService_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "accessServiceSequenceGenerator")
    private Long serviceId;

    @Column(name = "service_name", nullable = false, unique = true)
    private String serviceName;

    @Column(name = "description")
    private String description;

    public AccessService() {}

    public AccessService(Long createdBy, Status status,
        String serviceName, String description) {
        super(createdBy, status);
        this.serviceName = serviceName;
        this.description = description;
    }

    public Long getServiceId() {
        return serviceId;
    }
    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}