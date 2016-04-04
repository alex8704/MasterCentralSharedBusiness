package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.fmw.business.domain.Order;
import co.com.binariasystems.fmw.business.domain.Order.Direction;
import co.com.binariasystems.fmw.business.domain.Page;
import co.com.binariasystems.fmw.business.domain.PageRequest;
import co.com.binariasystems.fmw.util.ObjectUtils;
import co.com.binariasystems.mastercentral.shared.business.bean.BusinessGroupBean;
import co.com.binariasystems.mastercentral.shared.business.dao.BusinessGroupDAO;
import co.com.binariasystems.mastercentral.shared.business.dto.BusinessGroupDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatBusinessGroup;
import co.com.binariasystems.mastercentral.shared.business.specification.BusinessGroupSpecifications;
import co.com.binariasystems.mastercentral.shared.business.utils.Utils;

@Service
@Transactional
public class BusinessgroupBeanImpl implements BusinessGroupBean {
	@Autowired
	private BusinessGroupDAO dao;

	@Override
	public Page<BusinessGroupDTO> findAll(PageRequest pageRequest) {
		return Utils.toPage(
				dao.findAll(Utils.buildPageRequest(pageRequest, new Order(Direction.DESC, "creationDate"))), 
				BusinessGroupDTO.class);
	}

	@Override
	public Page<BusinessGroupDTO> findAll(BusinessGroupDTO businessGroup, PageRequest pageRequest) {
		return Utils.toPage(
				dao.findAll(BusinessGroupSpecifications.filledFieldsEqualsTo(businessGroup),
						Utils.buildPageRequest(pageRequest, new Order(Direction.DESC, "creationDate"))), 
						BusinessGroupDTO.class);
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
