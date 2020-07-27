package com.barco.model.pojo.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FTP {

    private String host;
    private Integer port;
    private String user;
    private String password;
    private List<String> folder;

    public FTP() { }

    public String getHost() { return host; }
    public void setHost(String host) { this.host = host; }

    public Integer getPort() { return port; }
    public void setPort(Integer port) { this.port = port; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public List<String> getFolder() { return folder; }
    public void setFolder(List<String> folder) { this.folder = folder; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
