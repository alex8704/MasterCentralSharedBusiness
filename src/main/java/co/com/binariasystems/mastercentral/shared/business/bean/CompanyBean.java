package co.com.binariasystems.mastercentral.shared.business.bean;

import java.util.List;

import co.com.binariasystems.fmw.business.domain.Page;
import co.com.binariasystems.fmw.business.domain.PageRequest;
import co.com.binariasystems.mastercentral.shared.business.dto.CompanyDTO;

public interface CompanyBean {
	public List<CompanyDTO> findAll();
	public Page<CompanyDTO> findAll(PageRequest pageRequest);
	public Page<CompanyDTO> findAll(CompanyDTO company, PageRequest pageRequest);
	public CompanyDTO save(CompanyDTO company);
	public void delete(CompanyDTO company);
}
