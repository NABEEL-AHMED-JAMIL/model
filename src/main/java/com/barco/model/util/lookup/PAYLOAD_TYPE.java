package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum PAYLOAD_TYPE {

    XML(0l),
    JSON(1l);

    private Long lookupCode;

    PAYLOAD_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return PAYLOAD_TYPE.class.getSimpleName();
    }

    public static PAYLOAD_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(XML.getLookupCode())) {
            return XML;
        } else if (lookupCode.equals(JSON.getLookupCode())) {
            return JSON;
        }
        throw new RuntimeException(MessageUtil.PAYLOAD_TYPE_NOT_FOUND);
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
