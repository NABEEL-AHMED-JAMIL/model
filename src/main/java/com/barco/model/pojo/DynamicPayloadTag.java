package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "dynamic_payload_tag")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicPayloadTag extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tag_key", nullable = false)
    private String tagKey;

    @Column(name = "tag_parent", nullable = false)
    private String tagParent;

    @Column(name = "tag_value", nullable = false)
    private String tagValue;

    @ManyToOne
    @JoinColumn(name = "dynamic_id")
    private DynamicPayload dynamicPayload;

    public DynamicPayloadTag() {
    }

    public DynamicPayloadTag(String tagKey, String tagParent, String tagValue) {
        this.tagKey = tagKey;
        this.tagParent = tagParent;
        this.tagValue = tagValue;
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

    public DynamicPayload getDynamicPayload() {
        return dynamicPayload;
    }

    public void setDynamicPayload(DynamicPayload dynamicPayload) {
        this.dynamicPayload = dynamicPayload;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
