package com.barco.model.util.lookuputil;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum SCHEDULER_TIMEZONE {

    ASIA_QATAR(1l), US_ALASKA(2l), AMERICA_TORTOLA(3l),
    ASIA_KARACHI(4l), AMERICA_NEW_YORK(5l), AMERICA_SWIFT_CURRENT(6l),
    AMERICA_TORONTO(7l), AMERICA_TIJUANA(8l), US_ARIZONA(9l),
    US_CENTRAL(10l), US_EAST_INDIANA(11l), US_ALEUTIAN(12l), AMERICA_TEGUCIGALPA(13l);

    private Long lookupCode;

    SCHEDULER_TIMEZONE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return SCHEDULER_TIMEZONE.class.getSimpleName();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
