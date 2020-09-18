package com.barco.model.pojo.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.Map;


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AWS {

    private String accessKey;
    private String secretKey;
    private String region;
    private String tempStorageType; // S3,EFS
    // bucket name with path
    private Map<String, String> bucketName;

    public AWS() { }

    public String getAccessKey() { return accessKey; }
    public void setAccessKey(String accessKey) { this.accessKey = accessKey; }

    public String getSecretKey() { return secretKey; }
    public void setSecretKey(String secretKey) { this.secretKey = secretKey; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getTempStorageType() { return tempStorageType; }
    public void setTempStorageType(String tempStorageType) { this.tempStorageType = tempStorageType; }

    public Map<String, String> getBucketName() { return bucketName; }
    public void setBucketName(Map<String, String> bucketName) { this.bucketName = bucketName; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
