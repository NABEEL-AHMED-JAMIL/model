package com.barco.model.pojo.pagination;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginationDetail {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("criteria")
    private String criteria;
    @JsonProperty("filters")
    private List<Filters> filters;

    public PaginationDetail() { }

    public Integer getPage() { return page; }
    public void setPage(Integer page) { this.page = page; }

    public Integer getSize() { return size; }
    public void setSize(Integer size) { this.size = size; }

    public String getCriteria() { return criteria; }
    public void setCriteria(String criteria) { this.criteria = criteria; }

    public List<Filters> getFilters() { return filters; }
    public void setFilters(List<Filters> filters) { this.filters = filters; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
