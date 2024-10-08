package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "organization")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Organization extends BaseEntity {

    @Column(name = "name",
        nullable = false)
    private String name;

    @Column(name = "address",
        nullable = false)
    private String address;

    @Column(name = "phone",
        nullable = false)
    private String phone;

    @Column(name = "logo_url")
    private String logoUrl;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private ETLCountry country;

    public Organization() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public ETLCountry getCountry() {
        return country;
    }

    public void setCountry(ETLCountry country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
