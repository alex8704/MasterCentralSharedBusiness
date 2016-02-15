package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.HealthAdminCompanyBean;
import co.com.binariasystems.mastercentral.shared.business.dao.HealthAdminCompanyDAO;

@Service
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class HealthAdminCompanyBeanImpl implements HealthAdminCompanyBean {
	@Autowired
	private HealthAdminCompanyDAO dao;
}
