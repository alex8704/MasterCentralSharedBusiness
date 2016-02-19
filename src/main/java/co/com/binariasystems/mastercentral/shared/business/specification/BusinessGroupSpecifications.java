package co.com.binariasystems.mastercentral.shared.business.specification;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import co.com.binariasystems.mastercentral.shared.business.dto.BusinessGroupDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatBusinessGroup;
import co.com.binariasystems.mastercentral.shared.business.entity.MatBusinessGroup_;

public class BusinessGroupSpecifications {
	public static Specification<MatBusinessGroup> filledFieldsEqualsTo(final BusinessGroupDTO businessGroup){
		return new Specification<MatBusinessGroup>() {
			@Override
			public Predicate toPredicate(Root<MatBusinessGroup> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				if(businessGroup == null)
					return cb.and(new Predicate[]{});
				Set<Predicate> predicates = new HashSet<Predicate>();
				if(businessGroup.getAddress() != null)
					predicates.add(cb.equal(root.get(MatBusinessGroup_.address), businessGroup.getAddress()));
				if(businessGroup.getBusinessName() != null)
					predicates.add(cb.like(root.get(MatBusinessGroup_.businessName), businessGroup.getBusinessName().replace("*", "%")));
				if(businessGroup.getPhoneNumber2() != null)
					predicates.add(cb.equal(root.get(MatBusinessGroup_.phoneNumber2), businessGroup.getPhoneNumber2()));
				if(businessGroup.getPbxNumber() != null)
					predicates.add(cb.equal(root.get(MatBusinessGroup_.pbxNumber), businessGroup.getPbxNumber()));
				if(businessGroup.getCheckDigit() != null)
					predicates.add(cb.equal(root.get(MatBusinessGroup_.checkDigit), businessGroup.getCheckDigit()));
				if(businessGroup.getPhoneNumber1() != null)
					predicates.add(cb.equal(root.get(MatBusinessGroup_.phoneNumber1), businessGroup.getPhoneNumber1()));
				if(businessGroup.getTaxIdentification() != null)
					predicates.add(cb.equal(root.get(MatBusinessGroup_.taxIdentification), businessGroup.getTaxIdentification()));
				if(businessGroup.getCity() != null)
					predicates.add(cb.equal(root.get(MatBusinessGroup_.city), businessGroup.getCity()));
				
				return cb.and(predicates.toArray(new Predicate[]{}));
			}
		};
	}
	
}
