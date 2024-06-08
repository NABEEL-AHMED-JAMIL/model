package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum DYNAMIC_CONDITION {

    GET_SECTION_FILED("GET_SECTION_FILED",0l,"getFiledGroup('section-%{p1}', '%{p2}')?.value === %{p3}");

    private String lookupType;
    private Long lookupCode;
    private String lookupValue;

    DYNAMIC_CONDITION(String lookupType, Long lookupCode, String lookupValue) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
    }

    public static String getName() {
        return DYNAMIC_CONDITION.class.getSimpleName();
    }

    public static GLookup getStatusByLookupType(String lookupType) {
        DYNAMIC_CONDITION doDynamicCondition = null;
        if (lookupType.equals(GET_SECTION_FILED.getLookupType())) {
            doDynamicCondition = GET_SECTION_FILED;
        }
        return new GLookup(doDynamicCondition.lookupType, doDynamicCondition.lookupCode, doDynamicCondition.lookupValue);
    }

    public static GLookup getStatusByLookupCode(Long lookupCode) {
        DYNAMIC_CONDITION doDynamicCondition = null;
        if (lookupCode.equals(GET_SECTION_FILED.getLookupCode())) {
            doDynamicCondition = GET_SECTION_FILED;
        }
        return new GLookup(doDynamicCondition.lookupType, doDynamicCondition.lookupCode, doDynamicCondition.lookupValue);
    }

    public static DYNAMIC_CONDITION getByLookupCode(Long lookupCode) {
        if (lookupCode.equals(GET_SECTION_FILED.lookupCode)) {
            return GET_SECTION_FILED;
        }
        throw new RuntimeException(MessageUtil.DYNAMIC_CONDITION_NOT_FOUND);
    }

    public String getLookupType() {
        return lookupType;
    }

    public void setLookupType(String lookupType) {
        this.lookupType = lookupType;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public String getLookupValue() {
        return lookupValue;
    }

    public void setLookupValue(String lookupValue) {
        this.lookupValue = lookupValue;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
