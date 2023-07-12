package com.barco.model.util.lookuputil;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum EMAIL_TEMPLATE {

    FORGOT_PASS(0l), UPDATE_ACCOUNT_PROFILE(1l), CHANGE_ACCOUNT_TIMEZONE(2l),
    CLOSE_ACCOUNT(3l), RESET_PASS(4l), REGISTER_USER(5l);

    private Long lookupCode;

    EMAIL_TEMPLATE(Long lookupCode) {
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
