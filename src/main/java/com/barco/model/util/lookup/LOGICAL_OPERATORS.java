package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum LOGICAL_OPERATORS {

    EQUAL_TO("EQUAL_TO",0l, "==="),
    NOT_EQUAL_TO("NOT_EQUAL_TO",1l,"!=="),
    GREATER_THAN("GREATER_THAN",2l,">"),
    LESS_THAN("LESS_THAN",3l,"<"),
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO",4l,">="),
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO",5l,"<=");

    private String lookupType;
    private Long lookupCode;
    private String lookupValue;

    LOGICAL_OPERATORS(String lookupType, Long lookupCode, String lookupValue) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
    }

    public static String getName() {
        return LOGICAL_OPERATORS.class.getSimpleName();
    }

    public static GLookup getStatusByLookupType(String lookupType) {
        LOGICAL_OPERATORS logicalOperators = null;
        if (lookupType.equals(EQUAL_TO.getLookupType())) {
            logicalOperators = EQUAL_TO;
        } else if (lookupType.equals(NOT_EQUAL_TO.getLookupType())) {
            logicalOperators = NOT_EQUAL_TO;
        } else if (lookupType.equals(GREATER_THAN.getLookupType())) {
            logicalOperators = GREATER_THAN;
        } else if (lookupType.equals(LESS_THAN.getLookupType())) {
            logicalOperators = LESS_THAN;
        } else if (lookupType.equals(GREATER_THAN_OR_EQUAL_TO.getLookupType())) {
            logicalOperators = GREATER_THAN_OR_EQUAL_TO;
        } else if (lookupType.equals(LESS_THAN_OR_EQUAL_TO.getLookupType())) {
            logicalOperators = LESS_THAN_OR_EQUAL_TO;
        }
        return new GLookup(logicalOperators.lookupType, logicalOperators.lookupCode, logicalOperators.lookupValue);
    }

    public static GLookup getStatusByLookupCode(Long lookupCode) {
        LOGICAL_OPERATORS logicalOperators = null;
        if (lookupCode.equals(EQUAL_TO.getLookupCode())) {
            logicalOperators = EQUAL_TO;
        } else if (lookupCode.equals(NOT_EQUAL_TO.getLookupCode())) {
            logicalOperators = NOT_EQUAL_TO;
        } else if (lookupCode.equals(GREATER_THAN.getLookupCode())) {
            logicalOperators = GREATER_THAN;
        } else if (lookupCode.equals(LESS_THAN.getLookupCode())) {
            logicalOperators = LESS_THAN;
        } else if (lookupCode.equals(GREATER_THAN_OR_EQUAL_TO.getLookupCode())) {
            logicalOperators = GREATER_THAN_OR_EQUAL_TO;
        } else if (lookupCode.equals(LESS_THAN_OR_EQUAL_TO.getLookupCode())) {
            logicalOperators = LESS_THAN_OR_EQUAL_TO;
        }
        return new GLookup(logicalOperators.lookupType, logicalOperators.lookupCode, logicalOperators.lookupValue);
    }

    public static LOGICAL_OPERATORS getByLookupCode(Long lookupCode) {
        if (lookupCode.equals(EQUAL_TO.lookupCode)) {
            return EQUAL_TO;
        } else if (lookupCode.equals(NOT_EQUAL_TO.lookupCode)) {
            return NOT_EQUAL_TO;
        } else if (lookupCode.equals(GREATER_THAN.lookupCode)) {
            return GREATER_THAN;
        } else if (lookupCode.equals(LESS_THAN.lookupCode)) {
            return LESS_THAN;
        } else if (lookupCode.equals(GREATER_THAN_OR_EQUAL_TO.lookupCode)) {
            return GREATER_THAN_OR_EQUAL_TO;
        } else if (lookupCode.equals(LESS_THAN_OR_EQUAL_TO.lookupCode)) {
            return LESS_THAN_OR_EQUAL_TO;
        }
        throw new RuntimeException(MessageUtil.LOGICAL_OPERATORS_NOT_FOUND);
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
