package com.barco.model.pojo;

import com.barco.model.util.lookup.DASHBOARD_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "dashboard_setting")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardSetting extends BaseEntity {

    private String name;
    private DASHBOARD_TYPE boardType;
    private String groupType;

//-- (post | get) --
//if its get then its will key value paire
//if its post then its will be xml
//---
//dashboard url
//dashboard url param => payload
//key|value


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
