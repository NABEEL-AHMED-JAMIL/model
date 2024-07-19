package com.barco.model.pojo;

import com.barco.model.util.lookup.PAYLOAD_TYPE;
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

    @Column(name = "payload", nullable = false)
    private String payload;

    private PAYLOAD_TYPE payloadType;

    @OneToMany(mappedBy = "dynamicPayload", fetch = FetchType.LAZY)
    private List<DynamicPayloadTag> dynamicPayloadTags;

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

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public PAYLOAD_TYPE getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(PAYLOAD_TYPE payloadType) {
        this.payloadType = payloadType;
    }

    public List<DynamicPayloadTag> getDynamicPayloadTags() {
        return dynamicPayloadTags;
    }

    public void setDynamicPayloadTags(List<DynamicPayloadTag> dynamicPayloadTags) {
        this.dynamicPayloadTags = dynamicPayloadTags;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
