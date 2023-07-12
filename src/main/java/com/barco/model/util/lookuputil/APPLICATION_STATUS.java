package com.barco.model.util.lookuputil;


import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum APPLICATION_STATUS {

    INACTIVE(0l), ACTIVE(1l), DELETE(2l);

    private Long lookupCode;

    APPLICATION_STATUS(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return APPLICATION_STATUS.class.getSimpleName();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
