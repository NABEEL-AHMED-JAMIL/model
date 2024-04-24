package com.barco.model.util.lookup;

import com.barco.model.util.MessageUtil;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum CREDENTIAL_TYPE {

    BASIC_AUTH(0l),
    CERTIFICATE(1l),
    AUTHORIZATION_CODE(2l),
    AWS_AUTH(3l),
    FIREBASE(4l),
    FTP(5l);

    private Long lookupCode;

    CREDENTIAL_TYPE(Long lookupCode) {
        this.lookupCode = lookupCode;
    }

    public static String getName() {
        return CREDENTIAL_TYPE.class.getSimpleName();
    }

    public static CREDENTIAL_TYPE getByLookupCode(Long lookupCode) throws RuntimeException {
        if (lookupCode.equals(BASIC_AUTH.getLookupCode())) {
            return BASIC_AUTH;
        } else if (lookupCode.equals(CERTIFICATE.getLookupCode())) {
            return CERTIFICATE;
        } else if (lookupCode.equals(AUTHORIZATION_CODE.getLookupCode())) {
            return AUTHORIZATION_CODE;
        } else if (lookupCode.equals(AWS_AUTH.getLookupCode())) {
            return AWS_AUTH;
        } else if (lookupCode.equals(FIREBASE.getLookupCode())) {
            return FIREBASE;
        } else if (lookupCode.equals(FTP.getLookupCode())) {
            return FTP;
        }
        throw new RuntimeException(MessageUtil.CREDENTIAL_TYPE_NOT_FOUND);
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
