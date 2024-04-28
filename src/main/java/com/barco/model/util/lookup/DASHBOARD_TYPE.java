package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum DASHBOARD_TYPE {

    POWER_BI(0l),
    TABLEAU(1l),
    CUSTOM(2l);

    private Long lookupCode;

    DASHBOARD_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return DASHBOARD_TYPE.class.getSimpleName();
    }

    public static DASHBOARD_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(POWER_BI.getLookupCode())) {
            return POWER_BI;
        } else if (lookupCode.equals(TABLEAU.getLookupCode())) {
            return TABLEAU;
        } else if (lookupCode.equals(CUSTOM.getLookupCode())) {
            return CUSTOM;
        }
        throw new RuntimeException(MessageUtil.DASHBOARD_TYPE_NOT_FOUND);
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
