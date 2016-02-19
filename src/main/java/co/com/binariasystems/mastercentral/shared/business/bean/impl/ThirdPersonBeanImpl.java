package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.ThirdPersonBean;
import co.com.binariasystems.mastercentral.shared.business.dao.ThridPersonDAO;

@Service
@Transactional
public class ThirdPersonBeanImpl implements ThirdPersonBean{
	@Autowired
	private ThridPersonDAO dao;
}
