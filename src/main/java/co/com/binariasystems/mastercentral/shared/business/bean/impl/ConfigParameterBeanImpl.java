package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.commonsmodel.enumerated.Application;
import co.com.binariasystems.fmw.util.ObjectUtils;
import co.com.binariasystems.mastercentral.shared.business.bean.ConfigParameterBean;
import co.com.binariasystems.mastercentral.shared.business.dao.ConfigParameterDAO;
import co.com.binariasystems.mastercentral.shared.business.dto.ConfigParameterDTO;
import co.com.binariasystems.mastercentral.shared.business.specification.ConfigParameterSpecifications;


@Service
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class ConfigParameterBeanImpl implements ConfigParameterBean {
	@Autowired
	private ConfigParameterDAO dao;

	@Override
	public ConfigParameterDTO findShared(String code) {
		return ObjectUtils.transferProperties(dao.findOne(ConfigParameterSpecifications.appIsNullAnCodeEqualsTo(code)), ConfigParameterDTO.class);
	}

	@Override
	public ConfigParameterDTO findByCodeAndApp(String code, Application app) {
		return ObjectUtils.transferProperties(dao.findOne(ConfigParameterSpecifications.appAndCodeEqualsTo(app, code)), ConfigParameterDTO.class);
	}

	@Override
	public List<ConfigParameterDTO> findAll(ConfigParameterDTO configParam) {
		return ObjectUtils.transferProperties(dao.findAll(ConfigParameterSpecifications.filledFieldsEqualsTo(configParam)), ConfigParameterDTO.class);
	}
}
