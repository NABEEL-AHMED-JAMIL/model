package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;
/**
 * @author Nabeel Ahmed
 */
public enum NOTIFICATION_STATUS {

    UNREAD(0l),
    READ(1l);

    private Long lookupCode;

    NOTIFICATION_STATUS(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return NOTIFICATION_STATUS.class.getSimpleName();
    }

    public static NOTIFICATION_STATUS getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode == 0) {
            return UNREAD;
        } else if (lookupCode == 1) {
            return READ;
        }
        throw new RuntimeException(MessageUtil.NOTIFICATION_STATUS_NOT_FOUND);
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