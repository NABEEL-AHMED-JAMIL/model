package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum JOB_STATUS {

    QUEUE(0l),
    START(1L),
    RUNNING(2l),
    FAILED(3l),
    COMPLETED(4l),
    SKIP(5l),
    INTERRUPT(6l);

    private Long lookupCode;

    JOB_STATUS(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return JOB_STATUS.class.getSimpleName();
    }

    public static JOB_STATUS getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(QUEUE.getLookupCode())) {
            return QUEUE;
        } else if (lookupCode.equals(START.getLookupCode())) {
            return START;
        } else if (lookupCode.equals(START.getLookupCode())) {
            return START;
        } else if (lookupCode.equals(RUNNING.getLookupCode())) {
            return RUNNING;
        } else if (lookupCode.equals(FAILED.getLookupCode())) {
            return FAILED;
        } else if (lookupCode.equals(COMPLETED.getLookupCode())) {
            return COMPLETED;
        } else if (lookupCode.equals(SKIP.getLookupCode())) {
            return SKIP;
        } else if (lookupCode.equals(INTERRUPT.getLookupCode())) {
            return INTERRUPT;
        }
        throw new RuntimeException(MessageUtil.JOB_STATUS_STATUS_NOT_FOUND);
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
