package com.barco.model.pojo.ext;

import com.barco.model.util.EncryptUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.Map;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AWS {

    private String accessKey; // access key of aws
    private String secretKey; // secret key of aws
    private String region; // region for s3 bucket
    // bucket name with path
    private Map<String, String> bucketName; // bucket name, here key, pair
    // key => bucket name value => which bucket active to push data

    public AWS() { }

    public String getAccessKey() {
        return EncryptUtil.decrypt(accessKey);
    }
    public void setAccessKey(String accessKey) {
        this.accessKey = EncryptUtil.encrypt(accessKey);
    }

    public String getSecretKey() {
        return EncryptUtil.decrypt(secretKey);
    }
    public void setSecretKey(String secretKey) {
        this.secretKey = EncryptUtil.encrypt(secretKey);
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public Map<String, String> getBucketName() {
        return bucketName;
    }
    public void setBucketName(Map<String, String> bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
