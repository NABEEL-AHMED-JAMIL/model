package com.barco.model.searchspec;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

import java.util.List;
import java.util.Set;


@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginationDetail {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("sortType")
    private String sortType;
    @JsonProperty("sortValue")
    private String sortValue;
    @JsonProperty("criteria")
    private String criteria; // search form
    @JsonProperty("filters")
    private Set<Filters> filters;

    public PaginationDetail() { }

    public Integer getPage() { return page; }
    public void setPage(Integer page) { this.page = page; }

    public Integer getSize() { return size; }
    public void setSize(Integer size) { this.size = size; }

    public String getSortType() { return sortType; }
    public void setSortType(String sortType) { this.sortType = sortType; }

    public String getSortValue() { return sortValue; }
    public void setSortValue(String sortValue) { this.sortValue = sortValue; }

    public String getCriteria() { return criteria; }
    public void setCriteria(String criteria) { this.criteria = criteria; }

    public Set<Filters> getFilters() { return filters; }
    public void setFilters(Set<Filters> filters) { this.filters = filters; }

    @Override
    public String toString() { return new Gson().toJson(this); }

}
