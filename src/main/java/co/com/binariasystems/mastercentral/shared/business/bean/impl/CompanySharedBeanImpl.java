package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.CompanySharedBean;
import co.com.binariasystems.mastercentral.shared.business.dao.CompanyDAO;

@Service
@Transactional
public class CompanySharedBeanImpl implements CompanySharedBean {
	@Autowired
	private CompanyDAO dao;
}
