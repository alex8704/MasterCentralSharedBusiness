package co.com.binariasystems.mastercentral.business.bean;

import co.com.binariasystems.fmw.business.FMWBusiness;
import co.com.binariasystems.mastercentral.business.dto.ConfigParameterDTO;
import co.com.binariasystems.orionclient.ClientCredentialsProvider;


public interface ConfigParameterBean extends FMWBusiness, ClientCredentialsProvider {
	public ConfigParameterDTO findByConfigParameterCode(String parameterCode);
}
