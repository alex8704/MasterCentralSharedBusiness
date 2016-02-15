package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.fmw.util.ObjectUtils;
import co.com.binariasystems.mastercentral.shared.business.bean.IdentificationTypeBean;
import co.com.binariasystems.mastercentral.shared.business.dao.IdentificationTypeDAO;
import co.com.binariasystems.mastercentral.shared.business.dto.IdentificationTypeDTO;

@Service
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class IdentificationTypeBeanImpl implements IdentificationTypeBean {
	@Autowired
	private IdentificationTypeDAO dao;

	@Override
	public List<IdentificationTypeDTO> findAll() {
		return ObjectUtils.transferProperties(dao.findAll(), IdentificationTypeDTO.class);
	}
}
