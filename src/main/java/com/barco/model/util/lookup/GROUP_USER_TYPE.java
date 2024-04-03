package com.barco.model.util.lookup;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum GROUP_USER_TYPE {

    MANAGER(0l), ADMINISTRATOR(1l), SUPERVISOR(2l),
    EMPLOYEE(3l), CLIENT(4l), GUEST(5l), ANALYST(6l);


    private Long lookupCode;

    GROUP_USER_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return EMAIL_TEMPLATE.class.getSimpleName();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
