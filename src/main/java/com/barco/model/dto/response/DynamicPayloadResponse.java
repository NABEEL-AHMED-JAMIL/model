package com.barco.model.dto.response;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicPayloadResponse extends BaseEntity {

    private String name;
    private String description;
    private String payload;
    private GLookup payloadType;
    private ConfigurationMakerResponse dynamicPayloadTags;

    public DynamicPayloadResponse() {
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

    public GLookup getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(GLookup payloadType) {
        this.payloadType = payloadType;
    }

    public ConfigurationMakerResponse getDynamicPayloadTags() {
        return dynamicPayloadTags;
    }

    public void setDynamicPayloadTags(ConfigurationMakerResponse dynamicPayloadTags) {
        this.dynamicPayloadTags = dynamicPayloadTags;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
