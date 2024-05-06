package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum FIELD_TYPE {

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
    MULTI_SELECT(18l),
    KEY_VALUE(19l);

    private Long lookupCode;

    FIELD_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return FIELD_TYPE.class.getSimpleName();
    }

    public static FIELD_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(WEEK.getLookupCode())) {
            return WEEK;
        } else if (lookupCode.equals(RANGE.getLookupCode())) {
            return RANGE;
        } else if (lookupCode.equals(FILE.getLookupCode())) {
            return FILE;
        } else if (lookupCode.equals(DATE.getLookupCode())) {
            return DATE;
        } else if (lookupCode.equals(EMAIL.getLookupCode())) {
            return EMAIL;
        } else if (lookupCode.equals(TEL.getLookupCode())) {
            return TEL;
        } else if (lookupCode.equals(MONTH.getLookupCode())) {
            return MONTH;
        } else if (lookupCode.equals(PASSWORD.getLookupCode())) {
            return PASSWORD;
        } else if (lookupCode.equals(URL.getLookupCode())) {
            return URL;
        } else if (lookupCode.equals(DATETIME_LOCAL.getLookupCode())) {
            return DATETIME_LOCAL;
        } else if (lookupCode.equals(NUMBER.getLookupCode())) {
            return NUMBER;
        } else if (lookupCode.equals(RADIO.getLookupCode())) {
            return RADIO;
        } else if (lookupCode.equals(CHECKBOX.getLookupCode())) {
            return CHECKBOX;
        } else if (lookupCode.equals(COLOR.getLookupCode())) {
            return COLOR;
        } else if (lookupCode.equals(TIME.getLookupCode())) {
            return TIME;
        } else if (lookupCode.equals(TEXT.getLookupCode())) {
            return TEXT;
        } else if (lookupCode.equals(TEXTAREA.getLookupCode())) {
            return TEXTAREA;
        } else if (lookupCode.equals(SELECT.getLookupCode())) {
            return SELECT;
        } else if (lookupCode.equals(MULTI_SELECT.getLookupCode())) {
            return MULTI_SELECT;
        } else if (lookupCode.equals(KEY_VALUE.getLookupCode())) {
            return KEY_VALUE;
        }
        throw new RuntimeException(MessageUtil.FILED_TYPE_NOT_FOUND);
    }

    public static boolean isFormType(String name) {
        for (FIELD_TYPE lookup : FIELD_TYPE.values()) {
            if (lookup.name().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static FIELD_TYPE findEnumByName(String name) {
        for (FIELD_TYPE lookup : FIELD_TYPE.values()) {
            if (lookup.name().equals(name)) {
                return lookup;
            }
        }
        return null;
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
