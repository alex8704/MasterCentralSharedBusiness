package co.com.binariasystems.mastercentral.shared.business.specification;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import co.com.binariasystems.mastercentral.shared.business.dto.CompanyDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatBank_;
import co.com.binariasystems.mastercentral.shared.business.entity.MatBusinessGroup_;
import co.com.binariasystems.mastercentral.shared.business.entity.MatCity_;
import co.com.binariasystems.mastercentral.shared.business.entity.MatCompany;
import co.com.binariasystems.mastercentral.shared.business.entity.MatCompany_;
import co.com.binariasystems.mastercentral.shared.business.entity.MatEconomicActivity_;
import co.com.binariasystems.mastercentral.shared.business.entity.MatTaxpayerType_;

public final class CompanySpecifications {
	public static Specification<MatCompany> filledFieldsEqualsTo(final CompanyDTO company){
		return new Specification<MatCompany>() {
			@Override
			public Predicate toPredicate(Root<MatCompany> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				if(company == null)
					return cb.and(new Predicate[]{});
				Set<Predicate> predicates = new HashSet<Predicate>();
				if(company.getBusinessName() != null)
					predicates.add(cb.like(root.get(MatCompany_.businessName), company.getBusinessName().replace("*", "%")));
				if(company.getPhoneNumber2() != null)
					predicates.add(cb.equal(root.get(MatCompany_.phoneNumber2), company.getPhoneNumber2()));
				if(company.getPbxNumber() != null)
					predicates.add(cb.equal(root.get(MatCompany_.pbxNumber), company.getPbxNumber()));
				if(company.getCheckDigit() != null)
					predicates.add(cb.equal(root.get(MatCompany_.checkDigit), company.getCheckDigit()));
				if(company.getPhoneNumber1() != null)
					predicates.add(cb.equal(root.get(MatCompany_.phoneNumber1), company.getPhoneNumber1()));
				if(company.getTaxIdentification() != null)
					predicates.add(cb.equal(root.get(MatCompany_.taxIdentification), company.getTaxIdentification()));
				if(company.getCity() != null)
					predicates.add(cb.equal(root.join(MatCompany_.city).get(MatCity_.cityId), company.getCity().getCityId()));
				if(company.getEmailAdress() != null)
					predicates.add(cb.equal(root.get(MatCompany_.emailAdress), company.getAddress()));
				if(company.getPayrollPeriodType()  != null)
					predicates.add(cb.equal(root.get(MatCompany_.payrollPeriodType), company.getPayrollPeriodType()));
				if(company.getTaxpayerType()  != null)
					predicates.add(cb.equal(root.join(MatCompany_.taxpayerType).get(MatTaxpayerType_.taxpayerTypeId), company.getTaxpayerType().getTaxpayerTypeId()));
				if(company.getBusinessGroup()  != null)
					predicates.add(cb.equal(root.join(MatCompany_.businessGroup).get(MatBusinessGroup_.businessGroupId), company.getBusinessGroup().getBusinessGroupId()));
				if(company.getPayrollBank()  != null)
					predicates.add(cb.equal(root.join(MatCompany_.payrollBank).get(MatBank_.bankId), company.getPayrollBank().getBankId()));
				if(company.getEconomicActivity()  != null)
					predicates.add(cb.equal(root.join(MatCompany_.economicActivity).get(MatEconomicActivity_.economicActivityId), company.getEconomicActivity().getEconomicActivityId()));
				
				return cb.and(predicates.toArray(new Predicate[]{}));
			}
		};
	}
}
