package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.StateBean;
import co.com.binariasystems.mastercentral.shared.business.dao.StateDAO;

@Service
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class StateBeanImpl implements StateBean {
	@Autowired
	private StateDAO dao;
}
