package co.com.binariasystems.mastercentral.shared.business.bean;

import java.util.List;

import co.com.binariasystems.mastercentral.shared.business.dto.MasterDTO;
import co.com.binariasystems.mastercentral.shared.business.dto.MasterDataDTO;


public interface MasterDataBean {
	public List<MasterDataDTO> findByMaster(MasterDTO master);
	public List<MasterDataDTO> findByMasterCode(String masterCode);
}
