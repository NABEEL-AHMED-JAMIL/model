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
public class CredentialResponse extends BaseEntity {

    private String name;
    private GLookup type;
    private GLookup status;
    private Object content;

    public CredentialResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GLookup getType() {
        return type;
    }

    public void setType(GLookup type) {
        this.type = type;
    }

    @Override
    public GLookup getStatus() {
        return status;
    }

    @Override
    public void setStatus(GLookup status) {
        this.status = status;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
