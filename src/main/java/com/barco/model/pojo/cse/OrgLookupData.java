package com.barco.model.pojo.cse;

import com.barco.model.pojo.BaseEntity;
import com.barco.model.pojo.aoe.Organization;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.Objects;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(
    name = "org_lookup_data",
    uniqueConstraints = @UniqueConstraint(
        name = "uk_org_lookup_data",
        columnNames = {"parent_lookup_id", "child_lookup_id", "org_id"}
    )
)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgLookupData extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_lookup_id", nullable = false)
    private LookupData parentLookup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "child_lookup_id")
    private LookupData childLookup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id", nullable = false)
    private Organization organization;

    public OrgLookupData() {}

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

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrgLookupData)) return false;
        OrgLookupData that = (OrgLookupData) o;
        return Objects.equals(parentLookup, that.parentLookup) &&
                Objects.equals(childLookup, that.childLookup) &&
                Objects.equals(organization, that.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentLookup, childLookup, organization);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
