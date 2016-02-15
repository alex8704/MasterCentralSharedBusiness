package co.com.binariasystems.mastercentral.shared.business.bean;

import java.util.List;

import co.com.binariasystems.mastercentral.shared.business.dto.IdentificationTypeDTO;


public interface IdentificationTypeBean {
	public List<IdentificationTypeDTO> findAll();
}
