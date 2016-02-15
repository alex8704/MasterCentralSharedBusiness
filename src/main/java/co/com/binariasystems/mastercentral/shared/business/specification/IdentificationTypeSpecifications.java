package co.com.binariasystems.mastercentral.shared.business.specification;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import co.com.binariasystems.mastercentral.shared.business.dto.IdentificationTypeDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatIdentificationType;
import co.com.binariasystems.mastercentral.shared.business.entity.MatIdentificationType_;

public class IdentificationTypeSpecifications {
	public static Specification<MatIdentificationType> filledFieldsEqualsTo(final IdentificationTypeDTO idType){
		return new Specification<MatIdentificationType>() {
			@Override
			public Predicate toPredicate(Root<MatIdentificationType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				if(idType == null)
					return cb.and(new Predicate[]{});
				
				Set<Predicate> predicates = new HashSet<Predicate>();
				if(idType.getIdentificationTypeId() != null)
					predicates.add(cb.equal(root.get(MatIdentificationType_.identificationTypeId), idType.getIdentificationTypeId()));
				if(idType.getIdentificationTypeCode() != null)
					predicates.add(cb.equal(root.get(MatIdentificationType_.identificationTypeCode), idType.getIdentificationTypeCode()));
				if(idType.getShorName() != null)
					predicates.add(cb.equal(root.get(MatIdentificationType_.shorName), idType.getShorName()));
				if(idType.getDescription() != null)
					predicates.add(cb.equal(root.get(MatIdentificationType_.description), idType.getDescription()));
				
				return cb.and(predicates.toArray(new Predicate[]{}));
			}
		};
	}
}
