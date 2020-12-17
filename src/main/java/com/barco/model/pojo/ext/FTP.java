package com.barco.model.pojo.ext;

import com.barco.model.util.EncryptUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.List;
import java.util.Map;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FTP {

    private String host;
    private Integer port;
    private String user;
    private String password;
    private Map<String, String> folder; // bucket name, here key, pair
    // key is the folder name and the value is the active or disable

    public FTP() { }

    public String getHost() {
        return EncryptUtil.decrypt(host);
    }
    public void setHost(String host) {
        this.host = EncryptUtil.encrypt(host);
    }

    public Integer getPort() {
        return port;
    }
    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUser() {
        return EncryptUtil.decrypt(user);
    }
    public void setUser(String user) {
        this.user = EncryptUtil.encrypt(user);
    }

    public String getPassword() {
        return EncryptUtil.decrypt(password);
    }
    public void setPassword(String password) {
        this.password = EncryptUtil.encrypt(password);
    }

    public Map<String, String> getFolder() {
        return folder;
    }
    public void setFolder(Map<String, String> folder) {
        this.folder = folder;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
