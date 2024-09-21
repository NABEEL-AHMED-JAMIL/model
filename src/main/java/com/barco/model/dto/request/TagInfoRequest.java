package com.barco.model.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagInfoRequest implements Comparable<TagInfoRequest> {

    private Long taskPayloadId;
    private String uuid;
    private String tagKey;
    private String tagParent;
    private String tagValue;

    public TagInfoRequest() { }

    public TagInfoRequest(String tagKey, String tagParent, String tagValue) {
        this.tagKey = tagKey;
        this.tagParent = tagParent;
        this.tagValue = tagValue;
    }

    public TagInfoRequest(Long taskPayloadId, String tagKey, String tagParent, String tagValue) {
        this.taskPayloadId = taskPayloadId;
        this.tagKey = tagKey;
        this.tagParent = tagParent;
        this.tagValue = tagValue;
    }

    public Long getTaskPayloadId() {
        return taskPayloadId;
    }

    public void setTaskPayloadId(Long taskPayloadId) {
        this.taskPayloadId = taskPayloadId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagInfoRequest tagInfoRequest = (TagInfoRequest) o;
        if (!tagKey.equals(tagInfoRequest.tagKey)) return false;
        if (!tagParent.equals(tagInfoRequest.tagParent)) return false;
        return tagValue.equals(tagInfoRequest.tagValue);
    }

    @Override
    public int hashCode() {
        int result = tagKey.hashCode();
        result = 31 * result + tagParent.hashCode();
        result = 31 * result + tagValue.hashCode();
        return result;
    }

    @Override
    public int compareTo(TagInfoRequest o) {
        if (taskPayloadId==o.taskPayloadId) {
            return 0;
        } else if (taskPayloadId>o.taskPayloadId) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() { return new Gson().toJson(this); }
}