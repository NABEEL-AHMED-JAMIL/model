package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum PAYLOAD_REF {

    DYNAMIC_PAYLOAD(0l),
    REF_REPORT_FORM(1l);

    private Long lookupCode;

    PAYLOAD_REF(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return PAYLOAD_REF.class.getSimpleName();
    }

    public static PAYLOAD_REF getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(DYNAMIC_PAYLOAD.getLookupCode())) {
            return DYNAMIC_PAYLOAD;
        } else if (lookupCode.equals(REF_REPORT_FORM.getLookupCode())) {
            return REF_REPORT_FORM;
        }
        throw new RuntimeException(MessageUtil.PAYLOAD_REF_NOT_FOUND);
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
