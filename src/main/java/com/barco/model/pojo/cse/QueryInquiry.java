package com.barco.model.pojo.cse;

import com.barco.model.pojo.NamedTokenDetail;
import com.barco.model.pojo.BaseEntity;
import com.barco.model.pojo.aoe.Organization;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "query_inquiry")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryInquiry extends BaseEntity {

    @Embedded
    private NamedTokenDetail namedTokenDetail;

    @Column(name = "query",
        columnDefinition = "text", nullable = false)
    private String query;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "org_id")
    protected Organization organization;

    public QueryInquiry() {}

    public NamedTokenDetail getNamedTokenDetail() {
        return namedTokenDetail;
    }

    public void setNamedTokenDetail(NamedTokenDetail namedTokenDetail) {
        this.namedTokenDetail = namedTokenDetail;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}