package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum ACCOUNT_TYPE {

    GUEST(0l),
    EMPLOYEE(1l),
    CUSTOMER(2L),
    NORMAL(3L);

    private Long lookupCode;

    ACCOUNT_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return ACCOUNT_TYPE.class.getSimpleName();
    }

    public static ACCOUNT_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(GUEST.getLookupCode())) {
            return GUEST;
        } else if (lookupCode.equals(EMPLOYEE.getLookupCode())) {
            return EMPLOYEE;
        } else if (lookupCode.equals(CUSTOMER.getLookupCode())) {
            return CUSTOMER;
        } else if (lookupCode.equals(NORMAL.getLookupCode())) {
            return NORMAL;
        }
        throw new RuntimeException(MessageUtil.ACCOUNT_TYPE_NOT_FOUND);
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
