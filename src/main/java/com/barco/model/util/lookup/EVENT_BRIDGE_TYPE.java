package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum EVENT_BRIDGE_TYPE {

    WEB_HOOK_SENDER(0l),
    WEB_HOOK_RECEIVER(1l),
    API_SENDER(2l);

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
        if (lookupCode.equals(WEB_HOOK_SENDER.getLookupCode())) {
            return WEB_HOOK_SENDER;
        } else if (lookupCode.equals(WEB_HOOK_RECEIVER.getLookupCode())) {
            return WEB_HOOK_RECEIVER;
        } else if (lookupCode.equals(API_SENDER.getLookupCode())) {
            return API_SENDER;
        }
        throw new RuntimeException(MessageUtil.EVENT_BRIDGE_TYPE_NOT_FOUND);
    }

    public static EVENT_BRIDGE_TYPE getByLookupCode(String lookupName) throws RuntimeException {
        if (lookupName.equals(WEB_HOOK_SENDER.name())) {
            return WEB_HOOK_SENDER;
        } else if (lookupName.equals(WEB_HOOK_RECEIVER.name())) {
            return WEB_HOOK_RECEIVER;
        } else if (lookupName.equals(API_SENDER.name())) {
            return API_SENDER;
        }
        throw new RuntimeException(MessageUtil.EVENT_BRIDGE_TYPE_NOT_FOUND);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
