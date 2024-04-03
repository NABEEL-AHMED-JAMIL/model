package com.barco.model.util.lookup;

import com.barco.model.util.ModelUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import com.barco.model.dto.response.LookupDataResponse;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GLookup<X, Y> {

    private String lookupType;
    private X lookupCode;
    private Y lookupValue;
    private String description;

    public GLookup(String lookupType, X lookupCode, Y lookupValue) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
    }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public X getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(X lookupCode) {
        this.lookupCode = lookupCode;
    }

    public Y getLookupValue() {
        return lookupValue;
    }

    public void setLookupValue(Y lookupValue) {
        this.lookupValue = lookupValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static GLookup getGLookup(LookupDataResponse lookupData) throws NullPointerException {
        if (ModelUtil.isNull(lookupData)) {
            throw new NullPointerException("Lookup should not null.");
        }
        return new GLookup(lookupData.getLookupType(), lookupData.getLookupCode(), lookupData.getLookupValue());
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
