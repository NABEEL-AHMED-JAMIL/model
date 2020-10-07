package com.barco.model.searchspec;

import com.google.gson.Gson;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;


public class GenericSpecification<T> implements Specification<T> {

    private List<Filters> filters;

    public GenericSpecification(List<Filters> filters) {
        this.filters = filters;
    }

    public List<Filters> getFilters() { return filters; }
    public void setFilters(List<Filters> filters) { this.filters = filters; }

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        return null;
    }

    @Override
    public Specification<T> and(Specification<T> other) {
        return null;
    }

    @Override
    public Specification<T> or(Specification<T> other) {
        return null;
    }

    @Override
    public String toString() { return new Gson().toJson(this); }
}
