package com.barco.model.enums;

import com.google.gson.Gson;

/**
 * @author Nabeel Ahmed
 */
public enum SearchOperation {

    OR("or"), AMD("and"),
    GREATER_THAN("greater_then"), LESS_THAN("less_then"),
    GREATER_THAN_EQUAL("greater_then_equal"), LESS_THAN_EQUAL("less_then_equal"),
    NOT_EQUAL("not_equal"), EQUAL("equal"),
    // LIKE QUERY USE
    CONTAIN("contain"), START_WITH("start_with"), END_WITH("end_with");

    public String expression;

    SearchOperation(String expression) { this.expression = expression; }

    public String getExpression() { return expression; }

    public void setExpression(String expression) { this.expression = expression; }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
