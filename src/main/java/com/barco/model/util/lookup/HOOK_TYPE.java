package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum HOOK_TYPE {

    HOOK_SENDER(0l),
    HOOK_RECEIVER(1l);

    private Long lookupCode;

    HOOK_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return HOOK_TYPE.class.getSimpleName();
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static HOOK_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(HOOK_SENDER.getLookupCode())) {
            return HOOK_SENDER;
        } else if (lookupCode.equals(HOOK_RECEIVER.getLookupCode())) {
            return HOOK_RECEIVER;
        }
        throw new RuntimeException(MessageUtil.HOOK_TYPE_NOT_FOUND);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
