package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.mastercentral.shared.business.bean.BankBean;
import co.com.binariasystems.mastercentral.shared.business.dao.BankDAO;

@Service
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class BankBeanImpl implements BankBean {
	@Autowired
	private BankDAO dao;
}
