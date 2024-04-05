package com.barco.model.util.lookup;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum GROUP_USER_TYPE {

    MANAGER(0l), EMPLOYEE(1l), CLIENT(2l),
    GUEST(3l);


    private Long lookupCode;

    GROUP_USER_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return EMAIL_TEMPLATE.class.getSimpleName();
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
