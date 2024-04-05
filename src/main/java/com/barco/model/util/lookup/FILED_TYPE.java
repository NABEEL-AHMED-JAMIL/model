package com.barco.model.util.lookup;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum FILED_TYPE {

    WEEK(0l),
    RANGE(1l),
    FILE(2l),
    DATE(3l),
    EMAIL(4l),
    TEL(5l),
    MONTH(6l),
    PASSWORD(7l),
    URL(8l),
    DATETIME_LOCAL(9l),
    NUMBER(10l),
    RADIO(11l),
    CHECKBOX(12l),
    COLOR(13l),
    TIME(14l),
    TEXT(15l),
    TEXTAREA(16l),
    SELECT(17l),
    MULTI_SELECT(18l);

    private Long lookupCode;

    FILED_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return FORM_TYPE.class.getSimpleName();
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
