package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
public class DynamicPayloadTagRequest {

    private Long id;
    private String tagKey;
    private String tagParent;
    private String tagValue;

    public DynamicPayloadTagRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagKey() {
        return tagKey;
    }

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    public String getTagParent() {
        return tagParent;
    }

    public void setTagParent(String tagParent) {
        this.tagParent = tagParent;
    }

    public String getTagValue() {
        return tagValue;
    }

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
