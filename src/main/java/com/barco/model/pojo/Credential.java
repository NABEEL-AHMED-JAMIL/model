package com.barco.model.pojo;

import com.barco.model.util.lookup.CREDENTIAL_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

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

    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private CREDENTIAL_TYPE type;

    @Column(name = "content",
        nullable = false, length = 25000)
    private String content;

    public Credential() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
