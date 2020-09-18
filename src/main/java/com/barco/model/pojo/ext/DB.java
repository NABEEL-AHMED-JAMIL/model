package com.barco.model.pojo.ext;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DB {

    private String dataBaseType;
    private String driver;
    private String databaseServer;
    private Long databasePort;
    private String databaseName;
    private DbAuthentication dbAuthentication;

    public DB() { }

    public String getDataBaseType() { return dataBaseType; }
    public void setDataBaseType(String dataBaseType) { this.dataBaseType = dataBaseType; }

    public String getDriver() { return driver; }
    public void setDriver(String driver) { this.driver = driver; }

    public String getDatabaseServer() { return databaseServer; }
    public void setDatabaseServer(String databaseServer) { this.databaseServer = databaseServer; }

    public Long getDatabasePort() { return databasePort; }
    public void setDatabasePort(Long databasePort) { this.databasePort = databasePort; }

    public String getDatabaseName() { return databaseName; }
    public void setDatabaseName(String databaseName) { this.databaseName = databaseName; }

    public DbAuthentication getDbAuthentication() { return dbAuthentication; }
    public void setDbAuthentication(DbAuthentication dbAuthentication) { this.dbAuthentication = dbAuthentication; }

    private class DbAuthentication {

        private String databaseUserid;
        private String databasePassword;

        public DbAuthentication() { }

        public String getDatabaseUserid() { return databaseUserid; }
        public void setDatabaseUserid(String databaseUserid) { this.databaseUserid = databaseUserid; }

        public String getDatabasePassword() { return databasePassword; }
        public void setDatabasePassword(String databasePassword) { this.databasePassword = databasePassword; }

        @Override
        public String toString() { return new Gson().toJson(this); }
    }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
