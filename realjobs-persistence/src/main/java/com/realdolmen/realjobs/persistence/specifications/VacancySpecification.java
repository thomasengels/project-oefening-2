package com.realdolmen.realjobs.persistence.specifications;

import com.realdolmen.realjobs.persistence.models.Vacancy;
import org.springframework.data.jpa.domain.Specification;

import java.time.Instant;
import java.time.Period;
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

    public static Specification<Vacancy> withDatePostedNotOlderThan(Integer days) {
        if (days == null) {
            return new AlwaysTrueSpecification<>();
        }
        Instant maxPostedDate = Instant.now().minus(Period.ofDays(days));
        return (root, query, builder) ->
                builder.greaterThan(root.get("postingDate"), maxPostedDate);
    }

    public static Specification<Vacancy> withExperienceBetween(Integer minExperience, Integer maxExperience) {
        if (minExperience == null && maxExperience == null) {
            return new AlwaysTrueSpecification<>();
        }
        return (root, query, builder) -> builder.and(
                builder.greaterThanOrEqualTo(root.get("requiredYearsOfExperience"), minExperience),
                builder.lessThanOrEqualTo(root.get("requiredYearsOfExperience"), maxExperience)
        );
    }
}
