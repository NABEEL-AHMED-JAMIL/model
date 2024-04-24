package com.barco.model.pojo;

import com.barco.model.util.lookup.DASHBOARD_TYPE;
import com.barco.model.util.lookup.PAYLOAD_REF;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "report_setting")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportSetting extends BaseEntity {

    private String name;
    private PAYLOAD_REF payloadRef;
    private String groupType;

//----------
//
//PDF -< url -< data with same payload
//XLS -< url -< data with same payload
//CSV -< url -< data with same payload
//
//-- (post | get) --
//        if its get then its will key value paire
//if its post then its will be xml
//---
//Report url => post
//Report url param => payload
//key|value


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
