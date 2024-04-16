package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum FORM_TYPE {

    SERVICE_FORM(0l),
    QUERY_FORM(1l);

    private Long lookupCode;

    FORM_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return FORM_TYPE.class.getSimpleName();
    }

    public static FORM_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(SERVICE_FORM.getLookupCode())) {
            return SERVICE_FORM;
        } else if (lookupCode.equals(QUERY_FORM.getLookupCode())) {
            return QUERY_FORM;
        }
        throw new RuntimeException(MessageUtil.FORM_TYPE_NOT_FOUND);
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
