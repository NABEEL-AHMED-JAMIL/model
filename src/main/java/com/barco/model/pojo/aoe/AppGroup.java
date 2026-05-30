package com.barco.model.pojo.aoe;

import com.barco.model.lookup.GROUP_TYPE;
import com.barco.model.pojo.BaseEntity;
import com.barco.model.pojo.NamedTokenDetail;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "app_group")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppGroup extends BaseEntity {

    @Embedded
    private NamedTokenDetail namedTokenDetail;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "group_type", nullable = false)
    private GROUP_TYPE groupType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "org_id", nullable = false)
    private Organization organization;

    public AppGroup() {}

    public NamedTokenDetail getNamedTokenDetail() {
        return namedTokenDetail;
    }

    public void setNamedTokenDetail(NamedTokenDetail namedTokenDetail) {
        this.namedTokenDetail = namedTokenDetail;
    }

    public GROUP_TYPE getGroupType() {
        return groupType;
    }

    public void setGroupType(GROUP_TYPE groupType) {
        this.groupType = groupType;
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
