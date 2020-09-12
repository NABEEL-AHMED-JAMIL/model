package com.barco.model.pojo.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AWS {

    private String accessKey;
    private String secretKey;
    private String region;
    private List<String> bucketName;

    public AWS() { }

    public String getAccessKey() { return accessKey; }
    public void setAccessKey(String accessKey) { this.accessKey = accessKey; }

    public String getSecretKey() { return secretKey; }
    public void setSecretKey(String secretKey) { this.secretKey = secretKey; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public List<String> getBucketName() { return bucketName; }
    public void setBucketName(List<String> bucketName) { this.bucketName = bucketName; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
