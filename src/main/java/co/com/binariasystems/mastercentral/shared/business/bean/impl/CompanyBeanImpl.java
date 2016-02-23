package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.fmw.util.ObjectUtils;
import co.com.binariasystems.fmw.util.pagination.ListPage;
import co.com.binariasystems.mastercentral.shared.business.bean.CompanyBean;
import co.com.binariasystems.mastercentral.shared.business.dao.CompanyDAO;
import co.com.binariasystems.mastercentral.shared.business.dto.CompanyDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatCompany;
import co.com.binariasystems.mastercentral.shared.business.specification.CompanySpecifications;

@Service
@Transactional
public class CompanyBeanImpl implements CompanyBean {
	@Autowired
	private CompanyDAO dao;

	@Override
	public ListPage<CompanyDTO> findAll(int page, int pageSize) {
		Page<MatCompany> resultPage = dao.findAll(new PageRequest(page - 1, pageSize, new Sort(new Sort.Order(Direction.DESC, "creationDate"))));
		return new ListPage<CompanyDTO>(ObjectUtils.transferProperties(resultPage.getContent(), CompanyDTO.class), resultPage.getTotalElements());
	}

	@Override
	public ListPage<CompanyDTO> findAll(CompanyDTO company, int page, int pageSize) {
		Page<MatCompany> resultPage = dao.findAll(CompanySpecifications.filledFieldsEqualsTo(company),
				new PageRequest(page - 1, pageSize, new Sort(new Sort.Order(Direction.DESC, "creationDate"))));
		return new ListPage<CompanyDTO>(ObjectUtils.transferProperties(resultPage.getContent(), CompanyDTO.class), resultPage.getTotalElements());
	}

	@Override
	public CompanyDTO save(CompanyDTO company) {
		return ObjectUtils.transferProperties(dao.save(ObjectUtils.transferProperties(company, MatCompany.class)), CompanyDTO.class);
	}

	@Override
	public void delete(CompanyDTO company) {
		dao.delete(ObjectUtils.transferProperties(company, MatCompany.class));
	}
}
