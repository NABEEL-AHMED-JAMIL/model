package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.google.gson.Gson;


/**
 * @author Nabeel Ahmed
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ETLCountry implements Serializable {

    @Id
    @Column(name = "country_code", length = 3)
    private String countryCode;

    @Column(name = "country_name", nullable = false, unique = true)
    private String countryName;

    @Column(name = "code", length = 2, unique = true)
    private String code;

    public ETLCountry() {
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
