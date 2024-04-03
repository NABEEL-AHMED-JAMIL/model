package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum UI_LOOKUP {

    FALSE("FALSE", 0l, "False"),
    TRUE("TRUE", 1l, "True");

    private String lookupType;
    private Long lookupCode;
    private String lookupValue;

    UI_LOOKUP(String lookupType, Long lookupCode, String lookupValue) {
        this.lookupType = lookupType;
        this.lookupCode = lookupCode;
        this.lookupValue = lookupValue;
    }

    public static String getName() {
        return UI_LOOKUP.class.getSimpleName();
    }

    public static GLookup getStatusByLookupType(String lookupType) {
        UI_LOOKUP uiLookup = null;
        if (lookupType.equals(FALSE.lookupType)) {
            uiLookup = FALSE;
        } else if (lookupType.equals(TRUE.lookupType)) {
            uiLookup = TRUE;
        }
        return new GLookup(uiLookup.lookupType, uiLookup.lookupCode, uiLookup.lookupValue);
    }

    public static UI_LOOKUP getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode == 0) {
            return FALSE;
        } else if (lookupCode == 1) {
            return TRUE;
        }
        throw new RuntimeException(MessageUtil.NOTIFICATION_TYPE_NOT_FOUND);
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
