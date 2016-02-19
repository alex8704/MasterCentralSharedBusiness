package co.com.binariasystems.mastercentral.shared.business.bean;

import co.com.binariasystems.fmw.util.pagination.ListPage;
import co.com.binariasystems.mastercentral.shared.business.dto.BusinessGroupDTO;

public interface BusinessGroupBean {
	public ListPage<BusinessGroupDTO> findAll(int page, int pageSize);
	public ListPage<BusinessGroupDTO> findAll(BusinessGroupDTO businessGroup, int page, int pageSize);
	public BusinessGroupDTO save(BusinessGroupDTO businessGroup);
	public void delete(BusinessGroupDTO businessGroup);
}
