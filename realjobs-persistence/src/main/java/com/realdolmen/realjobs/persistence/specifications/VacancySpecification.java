package com.realdolmen.realjobs.persistence.specifications;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public final class VacancySpecification {
    private VacancySpecification() {
    }

    public static Specification<Vacancy> withIndustryNames(List<String> industryNames) {
        if (industryNames == null || industryNames.isEmpty()) {
            return new AlwaysTrueSpecification<>();
        }
        return (root, query, builder) ->
                builder.in(root.get("industry").get("industryName")).value(industryNames);
    }

    public static Specification<Vacancy> withContractTypes(List<String> contractTypes) {
        if (contractTypes == null || contractTypes.isEmpty()) {
            return new AlwaysTrueSpecification<>();
        }
        return (root, query, builder) ->
                builder.in(root.get("contractType").get("contractTypeName")).value(contractTypes);
    }

}
