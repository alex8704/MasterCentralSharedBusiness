package co.com.binariasystems.mastercentral.shared.business.bean;

import co.com.binariasystems.fmw.business.domain.Page;
import co.com.binariasystems.fmw.business.domain.PageRequest;
import co.com.binariasystems.mastercentral.shared.business.dto.BusinessGroupDTO;

public interface BusinessGroupBean {
	public Page<BusinessGroupDTO> findAll(PageRequest pageRequest);
	public Page<BusinessGroupDTO> findAll(BusinessGroupDTO businessGroup, PageRequest pageRequest);
	public BusinessGroupDTO save(BusinessGroupDTO businessGroup);
	public void delete(BusinessGroupDTO businessGroup);
}
