package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum EXECUTION {

    AUTO(0l),
    MANUAL(1l);

    private Long lookupCode;

    EXECUTION(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return EXECUTION.class.getSimpleName();
    }

    public static EXECUTION getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(AUTO.getLookupCode())) {
            return AUTO;
        } else if (lookupCode.equals(MANUAL.getLookupCode())) {
            return MANUAL;
        }
        throw new RuntimeException(MessageUtil.EXECUTION_STATUS_NOT_FOUND);
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
