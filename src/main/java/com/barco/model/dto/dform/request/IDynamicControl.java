package com.barco.model.dto.dform.request;

import com.barco.model.util.lookup.GLookup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IDynamicControl {

    private Long id;
    private Long order;
    private GLookup type;
    private String label;
    private String name;
    private Object value;
    private String pattern;
    private String placeHolder;
    private Long width; // max 24
    private List<GLookup> selectMenuOptions;
    private String apiLkValue;
    private String disabledPattern;
    private String visiblePattern;
    private List<IDynamicValidation> validators;

    public IDynamicControl() {
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

    public GLookup getType() {
        return type;
    }

    public void setType(GLookup type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public List<GLookup> getSelectMenuOptions() {
        return selectMenuOptions;
    }

    public void setSelectMenuOptions(List<GLookup> selectMenuOptions) {
        this.selectMenuOptions = selectMenuOptions;
    }

    public String getApiLkValue() {
        return apiLkValue;
    }

    public void setApiLkValue(String apiLkValue) {
        this.apiLkValue = apiLkValue;
    }

    public String getDisabledPattern() {
        return disabledPattern;
    }

    public void setDisabledPattern(String disabledPattern) {
        this.disabledPattern = disabledPattern;
    }

    public String getVisiblePattern() {
        return visiblePattern;
    }

    public void setVisiblePattern(String visiblePattern) {
        this.visiblePattern = visiblePattern;
    }

    public List<IDynamicValidation> getValidators() {
        return validators;
    }

    public void setValidators(List<IDynamicValidation> validators) {
        this.validators = validators;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
