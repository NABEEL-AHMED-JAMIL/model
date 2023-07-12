package com.barco.model.util.lookuputil;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum CREDENTIAL_TYPE {

    BASIC_AUTH(0l), CERTIFICATE(1l), AUTHORIZATION_CODE(2l),
    AWS_AUTH(3l), FIREBASE(4l), FTP(5l);

    private Long lookupCode;

    CREDENTIAL_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public Long getLookupCode() {
        return lookupCode;
    }

    public void setLookupCode(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return CREDENTIAL_TYPE.class.getSimpleName();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
