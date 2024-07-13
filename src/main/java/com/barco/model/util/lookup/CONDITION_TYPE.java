package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum CONDITION_TYPE {

    VISIBILITY(0l),
    ENABLE_ABILITY(1l);

    private Long lookupCode;

    CONDITION_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return CONDITION_TYPE.class.getSimpleName();
    }

    public static CONDITION_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(VISIBILITY.getLookupCode())) {
            return VISIBILITY;
        } else if (lookupCode.equals(ENABLE_ABILITY.getLookupCode())) {
            return ENABLE_ABILITY;
        }
        throw new RuntimeException(MessageUtil.CONDITION_TYPE_NOT_FOUND);
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
