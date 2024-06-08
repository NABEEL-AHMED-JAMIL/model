package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum COMPARISON_OPERATORS {

    AND_OPERATOR("AND_OPERATOR",0l,"&&"),
    OR_OPERATOR("OR_OPERATOR",1l,"||");

    private String lookupType;
    private Long lookupCode;
    private String lookupValue;

    COMPARISON_OPERATORS(String lookupType, Long lookupCode, String lookupValue) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
    }

    public static String getName() {
        return COMPARISON_OPERATORS.class.getSimpleName();
    }

    public static GLookup getStatusByLookupType(String lookupType) {
        COMPARISON_OPERATORS comparisonOperator = null;
        if (lookupType.equals(AND_OPERATOR.getLookupType())) {
            comparisonOperator = AND_OPERATOR;
        } else if (lookupType.equals(OR_OPERATOR.getLookupType())) {
            comparisonOperator = OR_OPERATOR;
        }
        return new GLookup(comparisonOperator.lookupType, comparisonOperator.lookupCode, comparisonOperator.lookupValue);
    }

    public static GLookup getStatusByLookupCode(Long lookupCode) {
        COMPARISON_OPERATORS comparisonOperator = null;
        if (lookupCode.equals(AND_OPERATOR.getLookupCode())) {
            comparisonOperator = AND_OPERATOR;
        } else if (lookupCode.equals(OR_OPERATOR.getLookupCode())) {
            comparisonOperator = OR_OPERATOR;
        }
        return new GLookup(comparisonOperator.lookupType, comparisonOperator.lookupCode, comparisonOperator.lookupValue);
    }

    public static COMPARISON_OPERATORS getByLookupCode(Long lookupCode) {
        if (lookupCode.equals(AND_OPERATOR.lookupCode)) {
            return AND_OPERATOR;
        } else if (lookupCode.equals(OR_OPERATOR.lookupCode)) {
            return OR_OPERATOR;
        }
        throw new RuntimeException(MessageUtil.COMPARISON_OPERATORS_NOT_FOUND);
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
