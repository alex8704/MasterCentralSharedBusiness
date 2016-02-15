package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.BusinessGroupSharedBean;
import co.com.binariasystems.mastercentral.shared.business.dao.BusinessGroupDAO;

@Service
@Transactional
public class BusinessgroupSharedBeanImpl implements BusinessGroupSharedBean {
	@Autowired
	private BusinessGroupDAO dao;
}
