package com.barco.model.util.lookuputil;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum FORM_CONTROL_TYPE {

    CHECKBOX(1l), DATETIME_LOCAL(2l), EMAIL(3l),
    FILE(4l), MONTH(5l), NUMBER(6l), PASSWORD(7l),
    DATE(8l), RADIO(9l), RANGE(10l), TEL(11l), TIME(12l),
    URL(13l), WEEK(14l), SELECT(15l), MULTI_SELECT(16l),
    TEXTAREA(17l), TEXT(18l);

    private Long lookupCode;

    FORM_CONTROL_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return FORM_CONTROL_TYPE.class.getSimpleName();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
