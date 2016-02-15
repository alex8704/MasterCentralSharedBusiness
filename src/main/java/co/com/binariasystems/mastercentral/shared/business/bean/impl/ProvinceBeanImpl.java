package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.ProvinceBean;
import co.com.binariasystems.mastercentral.shared.business.dao.ProvinceDAO;

@Service
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class ProvinceBeanImpl implements ProvinceBean {
	@Autowired
	private ProvinceDAO dao;
}
