package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum ORG_FILTER_TYPE {

    ORG_EMAIL(0l),
    ORG_USERNAME(1l),
    ORG_NAME(2l);

    private Long lookupCode;

    ORG_FILTER_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return NOTIFICATION_TYPE.class.getSimpleName();
    }

    public static ORG_FILTER_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(ORG_EMAIL.lookupCode)) {
            return ORG_EMAIL;
        } else if (lookupCode.equals(ORG_USERNAME.lookupCode)) {
            return ORG_USERNAME;
        } else if (lookupCode.equals(ORG_NAME.lookupCode)) {
            return ORG_NAME;
        }
        throw new RuntimeException(MessageUtil.NOTIFICATION_TYPE_NOT_FOUND);
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
