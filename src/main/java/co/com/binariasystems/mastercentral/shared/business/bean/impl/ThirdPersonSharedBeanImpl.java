package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.ThirdPersonSharedBean;
import co.com.binariasystems.mastercentral.shared.business.dao.ThridPersonDAO;

@Service
@Transactional
public class ThirdPersonSharedBeanImpl implements ThirdPersonSharedBean{
	@Autowired
	private ThridPersonDAO dao;
}
