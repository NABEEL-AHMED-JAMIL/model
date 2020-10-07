package com.barco.model.searchspec;

import com.barco.model.enums.SearchOperation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Filters {

    @JsonProperty("column")
    private String column;
    @JsonProperty("criteria")
    private Object criteria;
    @JsonProperty("expression")
    private SearchOperation expression;

    public Filters() {
    }

    public String getColumn() { return column; }
    public void setColumn(String column) { this.column = column; }

    public Object getCriteria() { return criteria; }
    public void setCriteria(Object criteria) { this.criteria = criteria; }

    public SearchOperation getExpression() { return expression; }
    public void setExpression(SearchOperation expression) { this.expression = expression; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
