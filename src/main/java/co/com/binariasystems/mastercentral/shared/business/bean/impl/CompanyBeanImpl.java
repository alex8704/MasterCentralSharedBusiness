package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.fmw.business.domain.Order;
import co.com.binariasystems.fmw.business.domain.Order.Direction;
import co.com.binariasystems.fmw.business.domain.Page;
import co.com.binariasystems.fmw.business.domain.PageRequest;
import co.com.binariasystems.fmw.util.ObjectUtils;
import co.com.binariasystems.mastercentral.shared.business.bean.CompanyBean;
import co.com.binariasystems.mastercentral.shared.business.dao.CompanyDAO;
import co.com.binariasystems.mastercentral.shared.business.dto.CompanyDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatCompany;
import co.com.binariasystems.mastercentral.shared.business.specification.CompanySpecifications;
import co.com.binariasystems.mastercentral.shared.business.utils.Utils;

@Service
@Transactional
public class CompanyBeanImpl implements CompanyBean {
	@Autowired
	private CompanyDAO dao;

	@Override
	public Page<CompanyDTO> findAll(PageRequest pageRequest) {
		return Utils.toPage(
				dao.findAll(Utils.buildPageRequest(pageRequest, new Order(Direction.DESC, "creationDate"))), 
				CompanyDTO.class);
	}

	@Override
	public Page<CompanyDTO> findAll(CompanyDTO company, PageRequest pageRequest) {
		return Utils.toPage(
				dao.findAll(CompanySpecifications.filledFieldsEqualsTo(company),
						Utils.buildPageRequest(pageRequest, new Order(Direction.DESC, "creationDate"))), 
						CompanyDTO.class);
	}

	@Override
	public CompanyDTO save(CompanyDTO company) {
		return ObjectUtils.transferProperties(dao.save(ObjectUtils.transferProperties(company, MatCompany.class)), CompanyDTO.class);
	}

	@Override
	public void delete(CompanyDTO company) {
		dao.delete(ObjectUtils.transferProperties(company, MatCompany.class));
	}

	@Override
	public List<CompanyDTO> findAll() {
		return ObjectUtils.transferProperties(dao.findAll(), CompanyDTO.class);
	}
}
