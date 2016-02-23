package co.com.binariasystems.mastercentral.shared.business.bean;

import co.com.binariasystems.fmw.util.pagination.ListPage;
import co.com.binariasystems.mastercentral.shared.business.dto.CompanyDTO;

public interface CompanyBean {
	public ListPage<CompanyDTO> findAll(int page, int pageSize);
	public ListPage<CompanyDTO> findAll(CompanyDTO company, int page, int pageSize);
	public CompanyDTO save(CompanyDTO company);
	public void delete(CompanyDTO company);
}
