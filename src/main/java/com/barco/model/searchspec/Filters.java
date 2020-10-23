package com.barco.model.searchspec;

import com.barco.model.enums.SearchOperation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.Objects;

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

    public Filters(String column, Object criteria, SearchOperation expression) {
        this.column = column;
        this.criteria = criteria;
        this.expression = expression;
    }

    public String getColumn() { return column; }
    public void setColumn(String column) { this.column = column; }

    public Object getCriteria() { return criteria; }
    public void setCriteria(Object criteria) { this.criteria = criteria; }

    public SearchOperation getExpression() { return expression; }
    public void setExpression(SearchOperation expression) { this.expression = expression; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filters filters = (Filters) o;
        return column.equals(filters.column) &&
                criteria.equals(filters.criteria) &&
                expression == filters.expression;
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, criteria, expression);
    }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
