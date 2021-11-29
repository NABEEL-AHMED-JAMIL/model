package com.barco.model.pojo.ext;

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

    // access key of aws
    private String accessKey;
    // secret key of aws
    private String secretKey;
    // region for s3 bucket
    private String region;
    // bucket name with path
    private Map<String, String> bucketName;
    // key => bucket name value => bucket folder pattern

    public AWS() { }

    public String getAccessKey() {
        return accessKey;
    }
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
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
