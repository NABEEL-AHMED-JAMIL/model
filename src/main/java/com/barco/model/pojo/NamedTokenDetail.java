package com.barco.model.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * NamedTokenDetail is a small embeddable reference object that holds:
 * - name: human-friendly label
 * - token: a unique machine token/code
 * - description: brief description
 *
 * Suitable to be embedded where a compact reference is needed.
 *
 * @author Nabeel Ahmed
 */
@Embeddable
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NamedTokenDetail {

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "token", unique = true, nullable = false)
    private String token;

    @Column(name = "description", nullable = false)
    private String description;

    public NamedTokenDetail() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

