package com.barco.model.pojo.cse;

import com.barco.model.pojo.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "lookup_data")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LookupData extends BaseEntity {

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "lookup_code")
    private String lookupCode;

    @Column(name = "lookup_value",
        columnDefinition = "text", nullable = false)
    private String lookupValue;

    @Column(name = "sort_order", nullable = false)
    private Integer sortOrder;

    @Column(name = "is_system", nullable = false)
    private Boolean isSystem = false;

    @ManyToOne
    @JoinColumn(name = "parent_lookup_id")
    protected LookupData parentLookup;

    public LookupData() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(String lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getLookupValue() {
        return lookupValue;
    }

    public void setLookupValue(String lookupValue) {
        this.lookupValue = lookupValue;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getSystem() {
        return isSystem;
    }

    public void setSystem(Boolean system) {
        isSystem = system;
    }

    public LookupData getParentLookup() {
        return parentLookup;
    }

    public void setParentLookup(LookupData parentLookup) {
        this.parentLookup = parentLookup;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
