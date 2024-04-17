package com.barco.model.util.validation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class STTSValidation {

    private Integer rowCounter = 0;
    private String errorMsg;

    private String sectionName;
    private String description;

    public STTSValidation() {
    }

    public Integer getRowCounter() {
        return rowCounter;
    }

    public void setRowCounter(Integer rowCounter) {
        this.rowCounter = rowCounter;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void isValidSTTS() {
        try {
            if (this.isNull(this.sectionName)) {
                this.setErrorMsg(String.format("SectionName should not be empty at row %s.<br>", rowCounter));
            }
            if (this.isNull(this.description)) {
                this.setErrorMsg(String.format("Description should not be empty at row %s.<br>", rowCounter));
            }
        } catch (Exception ex) {
            this.setErrorMsg(String.format(ex.getLocalizedMessage() + " at row %s.<br>", rowCounter));
        }
    }

    private static boolean isNull(String field) {
        return (field == null || field.length() == 0) ? true : false;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
