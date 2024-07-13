package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "dynamic_payload")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicPayload extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @OneToMany(mappedBy = "dynamicPayload", fetch = FetchType.LAZY)
    private List<DynamicPayloadTag> daDynamicPayloadTags;

    public DynamicPayload() {
    }

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

    public List<DynamicPayloadTag> getDaDynamicPayloadTags() {
        return daDynamicPayloadTags;
    }

    public void setDaDynamicPayloadTags(List<DynamicPayloadTag> daDynamicPayloadTags) {
        this.daDynamicPayloadTags = daDynamicPayloadTags;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
