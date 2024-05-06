package com.barco.model.dto.dform;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IDynamicSection {

    private Long id;
    private Long order;
    private String name;
    private List<IDynamicControl> controls;

    public IDynamicSection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IDynamicControl> getControls() {
        return controls;
    }

    public void setControls(List<IDynamicControl> controls) {
        this.controls = controls;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
