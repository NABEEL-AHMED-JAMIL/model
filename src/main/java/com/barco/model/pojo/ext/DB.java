package com.barco.model.pojo.ext;

import com.barco.model.enums.DbDriver;
import com.barco.model.util.EncryptUtil;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DB {

    // mysql,pg,sql server
    private DbDriver driver; // driver for db base on mysql
    private String databaseServer; // ip or else db path
    private Long databasePort; // port of db
    private String databaseName; // db name
    private DbAuthentication dbAuthentication; // db auth detail if need

    public DB() { }

    public DbDriver getDriver() {
        return driver;
    }
    public void setDriver(DbDriver driver) {
        this.driver = driver;
    }

    public String getDatabaseServer() {
        return EncryptUtil.decrypt(databaseServer);
    }
    public void setDatabaseServer(String databaseServer) {
        this.databaseServer = EncryptUtil.encrypt(databaseServer);
    }

    public Long getDatabasePort() {
        return databasePort;
    }
    public void setDatabasePort(Long databasePort) {
        this.databasePort = databasePort;
    }

    public String getDatabaseName() {
        return databaseName;
    }
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DbAuthentication getDbAuthentication() {
        return dbAuthentication;
    }
    public void setDbAuthentication(DbAuthentication dbAuthentication) {
        this.dbAuthentication = dbAuthentication;
    }

    private class DbAuthentication {

        private String databaseUser;
        private String databasePassword;

        public DbAuthentication() { }

        public DbAuthentication(String databaseUser, String databasePassword) {
            this.databaseUser = databaseUser;
            this.databasePassword = databasePassword;
        }

        public String getDatabaseUser() {
            return EncryptUtil.decrypt(databaseUser);
        }
        public void setDatabaseUser(String databaseUser) {
            this.databaseUser = EncryptUtil.encrypt(databaseUser);
        }

        public String getDatabasePassword() {
            return EncryptUtil.decrypt(databasePassword);
        }
        public void setDatabasePassword(String databasePassword) {
            this.databasePassword = EncryptUtil.encrypt(databasePassword);
        }

        @Override
        public String toString() {
            return new Gson().toJson(this);
        }

    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
