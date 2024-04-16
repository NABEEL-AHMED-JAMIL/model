package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum GROUP_USER_TYPE {

    MANAGER(0l),
    EMPLOYEE(1l),
    CLIENT(2l),
    GUEST(3l);

    private Long lookupCode;

    GROUP_USER_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return GROUP_USER_TYPE.class.getSimpleName();
    }

    public static GROUP_USER_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(MANAGER.getLookupCode())) {
            return MANAGER;
        } else if (lookupCode.equals(EMPLOYEE.getLookupCode())) {
            return EMPLOYEE;
        } else if (lookupCode.equals(CLIENT.getLookupCode())) {
            return CLIENT;
        } else if (lookupCode.equals(GUEST.getLookupCode())) {
            return GUEST;
        }
        throw new RuntimeException(MessageUtil.GROUP_USER_TYPE_NOT_FOUND);
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
