package org.ohdsi.webapi.facets;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public interface FacetProvider {
    String getName();

    List<FacetItem> getValues(String entityName);

    <T> Predicate createFacetPredicate(List<String> items, CriteriaBuilder criteriaBuilder, Root<T> root);

}