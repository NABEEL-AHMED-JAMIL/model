package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum FREQUENCY {

    MINT(0l),
    HR(1l),
    DAILY(2l),
    WEEKLY(3l),
    MONTHLY(4l);

    private Long lookupCode;

    FREQUENCY(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return FREQUENCY.class.getSimpleName();
    }

    public static FREQUENCY getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(MINT.getLookupCode())) {
            return MINT;
        } else if (lookupCode.equals(HR.getLookupCode())) {
            return HR;
        } else if (lookupCode.equals(DAILY.getLookupCode())) {
            return DAILY;
        } else if (lookupCode.equals(WEEKLY.getLookupCode())) {
            return WEEKLY;
        } else if (lookupCode.equals(MONTHLY.getLookupCode())) {
            return MONTHLY;
        }
        throw new RuntimeException(MessageUtil.FREQUENCY_STATUS_NOT_FOUND);
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
