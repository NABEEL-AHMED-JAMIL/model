package com.barco.model.enums;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
public enum DbDriver {

    MYSQL("MYSQL","com.mysql.jdbc.Driver",3306L),
    POSTGRE("POSTGRE","org.postgresql.Driver",5432L),
    SQL_SERVER("SQL SERVER","com.microsoft.sqlserver.jdbc.SQLServerDriver",1434L);

    public String dataBaseType;
    public String driver;
    private Long port;

    DbDriver(String dataBaseType, String driver, Long port) {
        this.dataBaseType = dataBaseType;
        this.driver = driver;
        this.port = port;
    }

    public String getDataBaseType() {
        return dataBaseType;
    }
    public void setDataBaseType(String dataBaseType) {
        this.dataBaseType = dataBaseType;
    }

    public String getDriver() {
        return driver;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Long getPort() {
        return port;
    }
    public void setPort(Long port) {
        this.port = port;
    }

    public static DbDriver getDriver(String dataBaseType) {
        DbDriver driver = null;
        switch (dataBaseType) {
            case "MYSQL":
                driver = MYSQL;
                break;
            case "POSTGRE":
                driver = POSTGRE;
                break;
            case "SQL SERVER":
                driver = SQL_SERVER;
                break;
        }
        return driver;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
