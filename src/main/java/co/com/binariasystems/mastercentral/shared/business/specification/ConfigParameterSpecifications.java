package co.com.binariasystems.mastercentral.shared.business.specification;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import co.com.binariasystems.commonsmodel.enumerated.Application;
import co.com.binariasystems.mastercentral.shared.business.dto.ConfigParameterDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatConfigParameter;
import co.com.binariasystems.mastercentral.shared.business.entity.MatConfigParameter_;

public final class ConfigParameterSpecifications {
	public static Specification<MatConfigParameter> filledFieldsEqualsTo(final ConfigParameterDTO configParam){
		return new Specification<MatConfigParameter>() {
			@Override
			public Predicate toPredicate(Root<MatConfigParameter> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				if(configParam == null)
					return cb.and(new Predicate[]{});
				
				Set<Predicate> predicates = new HashSet<Predicate>();
				if(configParam.getApplicationCode() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.applicationCode), configParam.getApplicationCode()));
				if(configParam.getConfigParameterCode() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.configParameterCode), configParam.getConfigParameterCode()));
				if(configParam.getConfigParameterId() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.configParameterId), configParam.getConfigParameterId()));
				if(configParam.getCreationDate() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.creationDate), configParam.getCreationDate()));
				if(configParam.getCreationUser() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.creationUser), configParam.getCreationUser()));
				if(configParam.getDescription() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.description), configParam.getDescription()));
				if(configParam.getModificationDate() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.modificationDate), configParam.getModificationDate()));
				if(configParam.getModificationUser() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.modificationUser), configParam.getModificationUser()));
				if(configParam.getNumericValue() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.numericValue), configParam.getNumericValue()));
				if(configParam.getStringValue() != null)
					predicates.add(cb.equal(root.get(MatConfigParameter_.stringValue), configParam.getStringValue()));
				
				return cb.and(predicates.toArray(new Predicate[]{}));
			}
		};
	}
	
	public static Specification<MatConfigParameter> appIsNullAnCodeEqualsTo(final String code){
		return new Specification<MatConfigParameter>() {
			@Override
			public Predicate toPredicate(Root<MatConfigParameter> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.and(
						cb.isNull(root.get(MatConfigParameter_.applicationCode)),
						cb.equal(root.get(MatConfigParameter_.configParameterCode), code)
						);
			}
		};
	}
	
	public static Specification<MatConfigParameter> appAndCodeEqualsTo(final Application app, final String code){
		return new Specification<MatConfigParameter>() {
			@Override
			public Predicate toPredicate(Root<MatConfigParameter> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.and(
						cb.equal(root.get(MatConfigParameter_.applicationCode), app),
						cb.equal(root.get(MatConfigParameter_.configParameterCode), code)
						);
			}
		};
	}
}
