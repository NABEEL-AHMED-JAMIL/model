package com.barco.model.pojo;

import com.barco.model.util.lookup.FILED_TYPE;
import com.barco.model.util.lookup.IS_DEFAULT;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import javax.persistence.*;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Entity
@Table(name = "gen_control")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenControl extends BaseEntity {

    @Column(name = "control_name", nullable=false)
    private String controlName;

    @Column(name = "description", nullable = false)
    private String description;

    // select,multiple select, need the lookup value
    @Column(name = "field_type")
    @Enumerated(EnumType.ORDINAL)
    private FILED_TYPE fieldType;

    // label name
    @Column(name = "field_title", nullable = false)
    private String fieldTitle;

    // field name not be space
    @Column(name = "field_name", nullable = false)
    private String fieldName;

    @Column(name = "place_holder")
    private String placeHolder;

    @Column(name = "field_width")
    private Long fieldWidth;

    @Column(name = "min_length")
    private Long minLength;

    @Column(name = "max_length")
    private Long maxLength;

    @Column(name = "field_lk_value")
    private String fieldLkValue;

    @Column(name = "mandatory")
    @Enumerated(EnumType.ORDINAL)
    private IS_DEFAULT mandatory;

    @Column(name = "disabled")
    @Enumerated(EnumType.ORDINAL)
    private IS_DEFAULT disabled;

    @Column(name = "is_default")
    @Enumerated(EnumType.ORDINAL)
    private IS_DEFAULT isDefault;

    @Column(name = "default_val")
    private String defaultValue;

    @Column(name = "pattern")
    private String pattern;

    @OneToMany(mappedBy="genControl")
    private List<GenControlLinkGenSection> genControlLinkGenSections;


    public GenControl() {
    }

    public String getControlName() {
        return controlName;
    }

    public void setControlName(String controlName) {
        this.controlName = controlName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FILED_TYPE getFieldType() {
        return fieldType;
    }

    public void setFieldType(FILED_TYPE fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldTitle() {
        return fieldTitle;
    }

    public void setFieldTitle(String fieldTitle) {
        this.fieldTitle = fieldTitle;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public Long getFieldWidth() {
        return fieldWidth;
    }

    public void setFieldWidth(Long fieldWidth) {
        this.fieldWidth = fieldWidth;
    }

    public Long getMinLength() {
        return minLength;
    }

    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    public Long getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    public String getFieldLkValue() {
        return fieldLkValue;
    }

    public void setFieldLkValue(String fieldLkValue) {
        this.fieldLkValue = fieldLkValue;
    }

    public IS_DEFAULT getMandatory() {
        return mandatory;
    }

    public void setMandatory(IS_DEFAULT mandatory) {
        this.mandatory = mandatory;
    }

    public IS_DEFAULT getDisabled() {
        return disabled;
    }

    public void setDisabled(IS_DEFAULT disabled) {
        this.disabled = disabled;
    }

    public IS_DEFAULT getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(IS_DEFAULT isDefault) {
        this.isDefault = isDefault;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public List<GenControlLinkGenSection> getGenControlLinkGenSections() {
        return genControlLinkGenSections;
    }

    public void setGenControlLinkGenSections(List<GenControlLinkGenSection> genControlLinkGenSections) {
        this.genControlLinkGenSections = genControlLinkGenSections;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
