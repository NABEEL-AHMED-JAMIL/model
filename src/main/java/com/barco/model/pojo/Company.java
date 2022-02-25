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
@Table(name = "company")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Company extends BaseEntity {

    @GenericGenerator(
        name = "companySequenceGenerator",
        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
        parameters = {
            @Parameter(name = "sequence_name", value = "company_Seq"),
            @Parameter(name = "initial_value", value = "1000"),
            @Parameter(name = "increment_size", value = "1")
        }
    )
    @Id
    @GeneratedValue(generator = "companySequenceGenerator")
    private Long companyId;

    @Column(name = "company_name",
        nullable = false, unique = true)
    private String companyName;

    @Column(name = "description")
    private String description;

    @Column(name = "icon")
    private String icon;

    @Column(name = "email",
        nullable = false, unique = true)
    private String email;

    @Column(name = "phone")
    private String phone;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    public Company() {}

    public Company(Long createdBy, Status status, Long companyId, String companyName,
        String description, String icon, String email, String phone, Address address) {
        super(createdBy, status);
        this.companyId = companyId;
        this.companyName = companyName;
        this.description = description;
        this.icon = icon;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Long getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}