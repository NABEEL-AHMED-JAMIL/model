package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum IS_DEFAULT {

    NO_DEFAULT(0l),
    YES_DEFAULT(1l);

    private Long lookupCode;

    IS_DEFAULT(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return IS_DEFAULT.class.getSimpleName();
    }

    public static IS_DEFAULT getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(NO_DEFAULT.getLookupCode())) {
            return NO_DEFAULT;
        } else if (lookupCode.equals(YES_DEFAULT.getLookupCode())) {
            return YES_DEFAULT;
        }
        throw new RuntimeException(MessageUtil.IS_DEFAULT_NOT_FOUND);
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
