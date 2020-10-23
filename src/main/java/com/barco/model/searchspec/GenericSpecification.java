package com.barco.model.searchspec;

import com.barco.model.enums.SearchOperation;
import com.google.gson.Gson;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.*;


public class GenericSpecification<T> implements Specification<T> {

    private Set<Filters> filters;

    public GenericSpecification() {
    }

    public GenericSpecification(Set<Filters> filters) {
        this.filters = filters;
    }

    public Set<Filters> getFilters() { return filters; }
    public void setFilters(Set<Filters> filters) { this.filters = filters; }

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        //create a new predicate list
        List<Predicate> predicates = new ArrayList<>();
        //add add criteria to predicates
        for (Filters filter : this.filters) {
            if (filter.getExpression().equals(SearchOperation.GREATER_THAN)) {
                predicates.add(criteriaBuilder.greaterThan(root.get(filter.getColumn()), filter.getCriteria().toString()));
            } else if (filter.getExpression().equals(SearchOperation.LESS_THAN)) {
                predicates.add(criteriaBuilder.lessThan(root.get(filter.getColumn()), filter.getCriteria().toString()));
            } else if (filter.getExpression().equals(SearchOperation.GREATER_THAN_EQUAL)) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get(filter.getColumn()), filter.getCriteria().toString()));
            } else if (filter.getExpression().equals(SearchOperation.LESS_THAN_EQUAL)) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get(filter.getColumn()), filter.getCriteria().toString()));
            } else if (filter.getExpression().equals(SearchOperation.NOT_EQUAL)) {
                predicates.add(criteriaBuilder.notEqual(root.get(filter.getColumn()), filter.getCriteria()));
            } else if (filter.getExpression().equals(SearchOperation.EQUAL)) {
                predicates.add(criteriaBuilder.equal(root.get(filter.getColumn()), filter.getCriteria()));
            } else if (filter.getExpression().equals(SearchOperation.CONTAIN)) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get(filter.getColumn())), "%" + filter.getCriteria().toString().toLowerCase() + "%"));
            } else if (filter.getExpression().equals(SearchOperation.START_WITH)) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get(filter.getColumn())), "%" + filter.getCriteria().toString().toLowerCase()));
            } else if (filter.getExpression().equals(SearchOperation.END_WITH)) {
                predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get(filter.getColumn())), filter.getCriteria().toString().toLowerCase() + "%"));
            }
        }
        return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
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
