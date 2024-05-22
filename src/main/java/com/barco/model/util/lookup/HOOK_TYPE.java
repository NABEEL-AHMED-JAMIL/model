package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum HOOK_TYPE {

    SENDER(0l),
    RECEIVER(1l);

    private Long lookupCode;

    HOOK_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return HOOK_TYPE.class.getSimpleName();
    }

    public static HOOK_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(SENDER.getLookupCode())) {
            return SENDER;
        } else if (lookupCode.equals(RECEIVER.getLookupCode())) {
            return RECEIVER;
        }
        throw new RuntimeException(MessageUtil.HOOK_TYPE_NOT_FOUND);
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
