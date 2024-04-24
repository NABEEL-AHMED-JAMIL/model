package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum NOTIFICATION_TYPE {

    USER_NOTIFICATION(0l),
    JOB_NOTIFICATION(1l);

    private Long lookupCode;

    NOTIFICATION_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return NOTIFICATION_TYPE.class.getSimpleName();
    }

    public static NOTIFICATION_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(USER_NOTIFICATION.lookupCode)) {
            return USER_NOTIFICATION;
        } else if (lookupCode.equals(JOB_NOTIFICATION.lookupCode)) {
            return JOB_NOTIFICATION;
        }
        throw new RuntimeException(MessageUtil.NOTIFICATION_TYPE_NOT_FOUND);
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
