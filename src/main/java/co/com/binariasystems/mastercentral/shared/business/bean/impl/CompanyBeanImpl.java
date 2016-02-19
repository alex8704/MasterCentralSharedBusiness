package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.CompanyBean;
import co.com.binariasystems.mastercentral.shared.business.dao.CompanyDAO;

@Service
@Transactional
public class CompanyBeanImpl implements CompanyBean {
	@Autowired
	private CompanyDAO dao;
}
