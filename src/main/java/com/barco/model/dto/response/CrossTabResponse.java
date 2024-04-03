package com.barco.model.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.gson.Gson;
import java.util.Hashtable;
import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CrossTabResponse {

    private List row;
    private List col;
    private Hashtable crossTab;

    public CrossTabResponse() {
    }

    public List getRow() {
        return row;
    }

    public void setRow(List row) {
        this.row = row;
    }

    public List getCol() {
        return col;
    }

    public void setCol(List col) {
        this.col = col;
    }

    public Hashtable getCrossTab() {
        return crossTab;
    }

    public void setCrossTab(Hashtable crossTab) {
        this.crossTab = crossTab;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
