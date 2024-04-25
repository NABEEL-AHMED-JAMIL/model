package com.barco.model.pojo;

import com.barco.model.util.lookup.DASHBOARD_TYPE;
import com.barco.model.util.lookup.FORM_TYPE;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "dashboard_setting")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardSetting extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "group_type", nullable = false)
    private String groupType;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "board_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private DASHBOARD_TYPE boardType;

    @Column(name = "form_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private FORM_TYPE formType;

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
