package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum FETCH_LIMIT {

    FETCH_THREE_THOUSAND(0l),
    FETCH_ONE_THOUSAND(1l),
    FETCH_TWO_THOUSAND(2l),
    FETCH_FIVE_HUNDRED(3l),
    FETCH_FIVE_THOUSAND(4l),
    FETCH_FOUR_THOUSAND(5l);

    private Long lookupCode;

    FETCH_LIMIT(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return FETCH_LIMIT.class.getSimpleName();
    }

    public static FETCH_LIMIT getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(FETCH_THREE_THOUSAND.getLookupCode())) {
            return FETCH_THREE_THOUSAND;
        } else if (lookupCode.equals(FETCH_ONE_THOUSAND.getLookupCode())) {
            return FETCH_ONE_THOUSAND;
        } else if (lookupCode.equals(FETCH_TWO_THOUSAND.getLookupCode())) {
            return FETCH_TWO_THOUSAND;
        } else if (lookupCode.equals(FETCH_FIVE_HUNDRED.getLookupCode())) {
            return FETCH_FIVE_HUNDRED;
        } else if (lookupCode.equals(FETCH_FIVE_THOUSAND.getLookupCode())) {
            return FETCH_FIVE_THOUSAND;
        } else if (lookupCode.equals(FETCH_FOUR_THOUSAND.getLookupCode())) {
            return FETCH_FOUR_THOUSAND;
        }
        throw new RuntimeException(MessageUtil.FETCH_LIMIT_NOT_FOUND);
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
