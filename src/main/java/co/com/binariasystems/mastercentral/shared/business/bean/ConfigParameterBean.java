package co.com.binariasystems.mastercentral.shared.business.bean;

import java.util.List;

import co.com.binariasystems.commonsmodel.enumerated.Application;
import co.com.binariasystems.mastercentral.shared.business.dto.ConfigParameterDTO;



public interface ConfigParameterBean {
	public ConfigParameterDTO findShared(String code);
	public ConfigParameterDTO findByCodeAndApp(String code, Application app);
	public List<ConfigParameterDTO> findAll(ConfigParameterDTO configParam);
}
