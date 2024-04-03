package com.barco.model.util.lookup;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum EMAIL_TEMPLATE {

    FORGOT_USER_PASSWORD(0l),
    UPDATE_USER_ACCOUNT_PROFILE(1l),
    CLOSE_USER_ACCOUNT(2l),
    RESET_USER_PASSWORD(3l),
    REGISTER_USER(4l),
    ACTIVE_USER_ACCOUNT(5l),
    BLOCK_USER_ACCOUNT(6l),
    JOB_QUEUE_TEMPLATE(7l),
    JOB_START_TEMPLATE(8l),
    JOB_RUNNING_TEMPLATE(9l),
    JOB_FAILED_TEMPLATE(10l),
    JOB_COMPLETED_TEMPLATE(11l),
    JOB_SKIP_TEMPLATE(12l),
    JOB_INTERRUPT_TEMPLATE(13l);

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
