package com.barco.model.pojo.cse;

import com.barco.model.pojo.BaseEntity;
import com.barco.model.pojo.aoe.Organization;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "org_lookup_data")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgLookupData extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id", nullable = false)
    private Organization organization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_lookup_id", nullable = false)
    private LookupData parentLookup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "child_lookup_id")
    private LookupData childLookup;

    public OrgLookupData() {}

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public LookupData getParentLookup() {
        return parentLookup;
    }

    public void setParentLookup(LookupData parentLookup) {
        this.parentLookup = parentLookup;
    }

    public LookupData getChildLookup() {
        return childLookup;
    }

    public void setChildLookup(LookupData childLookup) {
        this.childLookup = childLookup;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
