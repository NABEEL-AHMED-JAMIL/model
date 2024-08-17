package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum EMAIL_TEMPLATE {

    FORGOT_USER_PASSWORD(0l),
    UPDATE_USER_ACCOUNT_PROFILE(1l),
    DELETE_USER_ACCOUNT(2l),
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

    public static String getName() {
        return EMAIL_TEMPLATE.class.getSimpleName();
    }

    public static EMAIL_TEMPLATE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(FORGOT_USER_PASSWORD.getLookupCode())) {
            return FORGOT_USER_PASSWORD;
        } else if (lookupCode.equals(UPDATE_USER_ACCOUNT_PROFILE.getLookupCode())) {
            return UPDATE_USER_ACCOUNT_PROFILE;
        } else if (lookupCode.equals(DELETE_USER_ACCOUNT.getLookupCode())) {
            return DELETE_USER_ACCOUNT;
        } else if (lookupCode.equals(RESET_USER_PASSWORD.getLookupCode())) {
            return RESET_USER_PASSWORD;
        } else if (lookupCode.equals(REGISTER_USER.getLookupCode())) {
            return REGISTER_USER;
        } else if (lookupCode.equals(ACTIVE_USER_ACCOUNT.getLookupCode())) {
            return ACTIVE_USER_ACCOUNT;
        } else if (lookupCode.equals(BLOCK_USER_ACCOUNT.getLookupCode())) {
            return BLOCK_USER_ACCOUNT;
        } else if (lookupCode.equals(JOB_QUEUE_TEMPLATE.getLookupCode())) {
            return JOB_QUEUE_TEMPLATE;
        } else if (lookupCode.equals(JOB_START_TEMPLATE.getLookupCode())) {
            return JOB_START_TEMPLATE;
        } else if (lookupCode.equals(JOB_RUNNING_TEMPLATE.getLookupCode())) {
            return JOB_RUNNING_TEMPLATE;
        } else if (lookupCode.equals(JOB_FAILED_TEMPLATE.getLookupCode())) {
            return JOB_FAILED_TEMPLATE;
        } else if (lookupCode.equals(JOB_COMPLETED_TEMPLATE.getLookupCode())) {
            return JOB_COMPLETED_TEMPLATE;
        } else if (lookupCode.equals(JOB_SKIP_TEMPLATE.getLookupCode())) {
            return JOB_SKIP_TEMPLATE;
        } else if (lookupCode.equals(JOB_INTERRUPT_TEMPLATE.getLookupCode())) {
            return JOB_INTERRUPT_TEMPLATE;
        }
        throw new RuntimeException(MessageUtil.EMAIL_TEMPLATE_NOT_FOUND);
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
