package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum APPLICATION_STATUS {

    INACTIVE("INACTIVE", 0l, "Inactive"),
    ACTIVE("ACTIVE", 1l, "Active"),
    DELETE("DELETE", 2l, "Delete");

    private String lookupType;
    private Long lookupCode;
    private String lookupValue;

    APPLICATION_STATUS(String lookupType, Long lookupCode, String lookupValue) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
    }

    public static String getName() {
        return UI_LOOKUP.class.getSimpleName();
    }

    public static GLookup getStatusByLookupType(String lookupType) {
        APPLICATION_STATUS applicationStatus = null;
        if (lookupType.equals(INACTIVE.lookupType)) {
            applicationStatus = INACTIVE;
        } else if (lookupType.equals(ACTIVE.lookupType)) {
            applicationStatus = ACTIVE;
        } else if (lookupType.equals(DELETE.lookupType)) {
            applicationStatus = DELETE;
        }
        return new GLookup(applicationStatus.lookupType, applicationStatus.lookupCode, applicationStatus.lookupValue);
    }

    public static GLookup getStatusByLookupCode(Long lookupCode) {
        APPLICATION_STATUS applicationStatus = null;
        if (lookupCode.equals(INACTIVE.lookupCode)) {
            applicationStatus = INACTIVE;
        } else if (lookupCode.equals(ACTIVE.lookupCode)) {
            applicationStatus = ACTIVE;
        } else if (lookupCode.equals(DELETE.lookupCode)) {
            applicationStatus = DELETE;
        }
        return new GLookup(applicationStatus.lookupType, applicationStatus.lookupCode, applicationStatus.lookupValue);
    }

    public static APPLICATION_STATUS getByLookupCode(Long lookupCode) {
        if (lookupCode.equals(INACTIVE.lookupCode)) {
            return INACTIVE;
        } else if (lookupCode.equals(ACTIVE.lookupCode)) {
            return ACTIVE;
        } else if (lookupCode.equals(DELETE.lookupCode)) {
            return DELETE;
        }
        throw new RuntimeException(MessageUtil.NOTIFICATION_TYPE_NOT_FOUND);
    }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getLookupValue() {
        return lookupValue;
    }

    public void setLookupValue(String lookupValue) {
        this.lookupValue = lookupValue;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}