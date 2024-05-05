package com.barco.model.enums;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public enum ErrorAssosiation {

    REQUIRED("required"),
    MIN_LENGTH("min_length"),
    MAX_LENGTH("max_length"),
    PATTERN("pattern");

    private String assosiation;

    ErrorAssosiation(String assosiation) {
        this.assosiation = assosiation;
    }

    public String getAssosiation() {
        return assosiation;
    }

    public void setAssosiation(String assosiation) {
        this.assosiation = assosiation;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
