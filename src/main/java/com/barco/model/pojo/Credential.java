package com.barco.model.pojo;

import com.barco.model.util.lookup.CREDENTIAL_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "credential")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Credential extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private CREDENTIAL_TYPE type;

    @Column(name = "content",
        nullable = false, length = 25000)
    private String content;

    @OneToMany(mappedBy = "credential", fetch = FetchType.LAZY)
    private List<EventBridge> eventBridges;

    @OneToMany(mappedBy = "credential", fetch = FetchType.LAZY)
    private List<SourceTaskType> sourceTaskTypes;

    public Credential() {}

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

    public CREDENTIAL_TYPE getType() {
        return type;
    }

    public void setType(CREDENTIAL_TYPE type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<EventBridge> getEventBridges() {
        return eventBridges;
    }

    public void setEventBridges(List<EventBridge> eventBridges) {
        this.eventBridges = eventBridges;
    }

    public List<SourceTaskType> getSourceTaskTypes() {
        return sourceTaskTypes;
    }

    public void setSourceTaskTypes(List<SourceTaskType> sourceTaskTypes) {
        this.sourceTaskTypes = sourceTaskTypes;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
