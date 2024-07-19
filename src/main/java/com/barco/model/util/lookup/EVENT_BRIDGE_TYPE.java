package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum EVENT_BRIDGE_TYPE {

    WEB_HOOK_SEND(0l),
    WEB_HOOK_RECEIVE(1l),
    REPORT_API_SEND(2l),
    REST_API(3l);

    private Long lookupCode;

    EVENT_BRIDGE_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return EVENT_BRIDGE_TYPE.class.getSimpleName();
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static EVENT_BRIDGE_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(WEB_HOOK_SEND.getLookupCode())) {
            return WEB_HOOK_SEND;
        } else if (lookupCode.equals(WEB_HOOK_RECEIVE.getLookupCode())) {
            return WEB_HOOK_RECEIVE;
        } else if (lookupCode.equals(REPORT_API_SEND.getLookupCode())) {
            return REPORT_API_SEND;
        } else if (lookupCode.equals(REST_API.getLookupCode())) {
            return REST_API;
        }
        throw new RuntimeException(MessageUtil.EVENT_BRIDGE_TYPE_NOT_FOUND);
    }

    public static EVENT_BRIDGE_TYPE getByLookupCode(String lookupName) throws RuntimeException {
        if (lookupName.equals(WEB_HOOK_SEND.name())) {
            return WEB_HOOK_SEND;
        } else if (lookupName.equals(WEB_HOOK_RECEIVE.name())) {
            return WEB_HOOK_RECEIVE;
        } else if (lookupName.equals(REPORT_API_SEND.name())) {
            return REPORT_API_SEND;
        } else if (lookupName.equals(REST_API.name())) {
            return REST_API;
        }
        throw new RuntimeException(MessageUtil.EVENT_BRIDGE_TYPE_NOT_FOUND);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
