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
import co.com.binariasystems.mastercentral.shared.business.bean.BusinessGroupBean;
import co.com.binariasystems.mastercentral.shared.business.dao.BusinessGroupDAO;
import co.com.binariasystems.mastercentral.shared.business.dto.BusinessGroupDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatBusinessGroup;
import co.com.binariasystems.mastercentral.shared.business.specification.BusinessGroupSpecifications;

@Service
@Transactional
public class BusinessgroupBeanImpl implements BusinessGroupBean {
	@Autowired
	private BusinessGroupDAO dao;

	@Override
	public ListPage<BusinessGroupDTO> findAll(int page, int pageSize) {
		Page<MatBusinessGroup> resultPage = dao.findAll(new PageRequest(page - 1, pageSize, new Sort(new Sort.Order(Direction.DESC, "businessGroupId"))));
		return new ListPage<BusinessGroupDTO>(ObjectUtils.transferProperties(resultPage.getContent(), BusinessGroupDTO.class), resultPage.getTotalElements());
	}

	@Override
	public ListPage<BusinessGroupDTO> findAll(BusinessGroupDTO businessGroup, int page, int pageSize) {
		Page<MatBusinessGroup> resultPage = dao.findAll(BusinessGroupSpecifications.filledFieldsEqualsTo(businessGroup),
				new PageRequest(page - 1, pageSize, new Sort(new Sort.Order(Direction.DESC, "businessGroupId"))));
		return new ListPage<BusinessGroupDTO>(ObjectUtils.transferProperties(resultPage.getContent(), BusinessGroupDTO.class), resultPage.getTotalElements());
	}

	@Override
	public BusinessGroupDTO save(BusinessGroupDTO businessGroup) {
		return ObjectUtils.transferProperties(dao.save(ObjectUtils.transferProperties(businessGroup, MatBusinessGroup.class)), BusinessGroupDTO.class);
	}

	@Override
	public void delete(BusinessGroupDTO businessGroup) {
		dao.delete(ObjectUtils.transferProperties(businessGroup, MatBusinessGroup.class));
	}
}
