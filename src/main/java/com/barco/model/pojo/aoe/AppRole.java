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
@Table(name = "app_role")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppRole extends BaseEntity {

    @Embedded
    private NamedTokenDetail namedTokenDetail;

    public AppRole() {}

    public NamedTokenDetail getNamedTokenDetail() {
        return namedTokenDetail;
    }

    public void setNamedTokenDetail(NamedTokenDetail namedTokenDetail) {
        this.namedTokenDetail = namedTokenDetail;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}