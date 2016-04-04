package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.fmw.util.ObjectUtils;
import co.com.binariasystems.mastercentral.shared.business.bean.StateBean;
import co.com.binariasystems.mastercentral.shared.business.dao.StateDAO;
import co.com.binariasystems.mastercentral.shared.business.dto.StateDTO;
import co.com.binariasystems.mastercentral.shared.business.dto.StateGroupingDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatStateGrouping;

@Service
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class StateBeanImpl implements StateBean {
	@Autowired
	private StateDAO dao;

	@Override
	public List<StateDTO> findByGrouping(StateGroupingDTO stateGrouping) {
		return ObjectUtils.transferProperties(dao.findByStateGrouping(ObjectUtils.transferProperties(stateGrouping, MatStateGrouping.class)), StateDTO.class);
	}

	@Override
	public List<StateDTO> findByGroupingCode(String groupingCode) {
		return ObjectUtils.transferProperties(dao.findByGroupingCode(groupingCode), StateDTO.class);
	}
}
