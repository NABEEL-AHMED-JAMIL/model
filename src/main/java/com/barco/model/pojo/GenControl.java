package com.barco.model.pojo;

import com.barco.model.util.lookup.FIELD_TYPE;
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
    private FIELD_TYPE fieldType;

    // label name
    @Column(name = "field_title", nullable = false)
    private String fieldTitle;

    // field name not be space
    @Column(name = "field_name", nullable = false)
    private String fieldName;

    @Column(name = "place_holder")
    private String placeHolder;

    @Column(name = "min_length")
    private Long minLength; // validation

    @Column(name = "max_length")
    private Long maxLength; // validation

    @ManyToOne
    @JoinColumn(name = "field_lk_value")
    private LookupData fieldLkValue;

    @Column(name = "api_lk_value")
    private String apiLkValue;

    @Column(name = "mandatory")
    @Enumerated(EnumType.ORDINAL)
    private IS_DEFAULT mandatory; // validation

    @Column(name = "is_default")
    @Enumerated(EnumType.ORDINAL)
    private IS_DEFAULT isDefault;

    @Column(name = "default_val")
    private String defaultValue;

    @Column(name = "pattern")
    private String pattern; // validation

    @ManyToOne
    @JoinColumn(name = "dynamic_id")
    private DynamicPayload dynamicPayload;

    @OneToMany(mappedBy="genControl", fetch = FetchType.LAZY)
    private List<GenControlLinkGenSection> genControlLinkGenSections;

    @OneToMany(mappedBy = "genControl", fetch = FetchType.LAZY)
    private List<SourceTaskData> sourceTaskData;

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

    public FIELD_TYPE getFieldType() {
        return fieldType;
    }

    public void setFieldType(FIELD_TYPE fieldType) {
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

    public LookupData getFieldLkValue() {
        return fieldLkValue;
    }

    public void setFieldLkValue(LookupData fieldLkValue) {
        this.fieldLkValue = fieldLkValue;
    }

    public String getApiLkValue() {
        return apiLkValue;
    }

    public void setApiLkValue(String apiLkValue) {
        this.apiLkValue = apiLkValue;
    }

    public IS_DEFAULT getMandatory() {
        return mandatory;
    }

    public void setMandatory(IS_DEFAULT mandatory) {
        this.mandatory = mandatory;
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

    public DynamicPayload getDynamicPayload() {
        return dynamicPayload;
    }

    public void setDynamicPayload(DynamicPayload dynamicPayload) {
        this.dynamicPayload = dynamicPayload;
    }

    public List<GenControlLinkGenSection> getGenControlLinkGenSections() {
        return genControlLinkGenSections;
    }

    public void setGenControlLinkGenSections(List<GenControlLinkGenSection> genControlLinkGenSections) {
        this.genControlLinkGenSections = genControlLinkGenSections;
    }

    public List<SourceTaskData> getSourceTaskData() {
        return sourceTaskData;
    }

    public void setSourceTaskData(List<SourceTaskData> sourceTaskData) {
        this.sourceTaskData = sourceTaskData;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
