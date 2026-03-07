package com.barco.model.pojo.aoe;

import com.barco.model.pojo.NamedTokenDetail;
import com.barco.model.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_profile")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppProfile extends BaseEntity {

    @Embedded
    private NamedTokenDetail tokenDetail;

    public AppProfile() {}

    public NamedTokenDetail getTokenDetail() {
        return tokenDetail;
    }

    public void setTokenDetail(NamedTokenDetail tokenDetail) {
        this.tokenDetail = tokenDetail;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}