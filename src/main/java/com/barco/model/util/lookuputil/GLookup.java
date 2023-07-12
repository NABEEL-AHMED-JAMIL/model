package com.barco.model.util.lookuputil;

import com.barco.model.dto.response.LookupDataResponse;
import com.barco.model.util.ProcessUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GLookup<X, Y> {

    private String lookupType;
    private X lookupCode;
    private Y lookupValue;
    private String color;
    private String description;

    public GLookup(String lookupType, X lookupCode, Y lookupValue) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
    }

    public GLookup(String lookupType, X lookupCode, Y lookupValue,
        String lookupColor) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
        this.color = lookupColor;
    }

    public GLookup(String lookupType, X lookupCode, Y lookupValue,
        String lookupColor, String description) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
        this.color = lookupColor;
        this.description = description;
    }

    public String getLookupType() {
        return lookupType;
    }

    public GLookup setLookupType(String lookupType) {
        this.lookupType = lookupType;
        return this;
    }

    public X getLookupCode() {
        return lookupCode;
    }

    public GLookup setLookupCode(X lookupCode) {
        this.lookupCode = lookupCode;
        return this;
    }

    public Y getLookupValue() {
        return lookupValue;
    }

    public GLookup setLookupValue(Y lookupValue) {
        this.lookupValue = lookupValue;
        return this;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public GLookup setDescription(String description) {
        this.description = description;
        return this;
    }

    public static GLookup getGLookup(LookupDataResponse lookupData) {
        if (ProcessUtil.isNull(lookupData)) {
            return null;
        }
        GLookup gLookup = new GLookup(lookupData.getLookupType(),
            lookupData.getLookupCode(), lookupData.getLookupValue());
        return gLookup;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
