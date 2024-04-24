package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum REQUEST_METHOD {

    GET(0l),
    HEAD(1l),
    POST(2l),
    PUT(3l),
    PATCH(4l);

    private Long lookupCode;

    REQUEST_METHOD(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return REQUEST_METHOD.class.getSimpleName();
    }

    public static REQUEST_METHOD getRequestMethodByValue(Long lookupValue) {
        if (lookupValue.equals(GET.getLookupCode())) {
            return GET;
        } else if (lookupValue.equals(HEAD.getLookupCode())) {
            return HEAD;
        } else if (lookupValue.equals(POST.getLookupCode())) {
            return POST;
        } else if (lookupValue.equals(PUT.getLookupCode())) {
            return PUT;
        } else if (lookupValue.equals(PATCH.getLookupCode())) {
            return PATCH;
        }
        throw new RuntimeException(MessageUtil.REQUEST_METHOD_NOT_FOUND);
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
