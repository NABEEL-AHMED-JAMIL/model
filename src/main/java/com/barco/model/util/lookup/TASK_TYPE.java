package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum TASK_TYPE {

    API(0l),
    AWS_SQS(1l),
    WEB_SOCKET(2l),
    KAFKA(3l);

    private Long lookupCode;

    TASK_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return TASK_TYPE.class.getSimpleName();
    }

    public static TASK_TYPE getRequestMethodByValue(Long lookupValue) {
        if (lookupValue.equals(API.getLookupCode())) {
            return API;
        } else if (lookupValue.equals(AWS_SQS.getLookupCode())) {
            return AWS_SQS;
        } else if (lookupValue.equals(WEB_SOCKET.getLookupCode())) {
            return WEB_SOCKET;
        } else if (lookupValue.equals(KAFKA.getLookupCode())) {
            return KAFKA;
        }
        throw new RuntimeException(MessageUtil.TASK_TYPE_NOT_FOUND);
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