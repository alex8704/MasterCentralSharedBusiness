package co.com.binariasystems.mastercentral.shared.business.bean.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.com.binariasystems.fmw.util.ObjectUtils;
import co.com.binariasystems.mastercentral.shared.business.bean.MasterDataBean;
import co.com.binariasystems.mastercentral.shared.business.dao.MasterDataDAO;
import co.com.binariasystems.mastercentral.shared.business.dto.MasterDTO;
import co.com.binariasystems.mastercentral.shared.business.dto.MasterDataDTO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatMaster;

@Service
@Transactional(readOnly=true, propagation=Propagation.SUPPORTS)
public class MasterDataBeanImpl implements MasterDataBean {
	@Autowired
	private MasterDataDAO dao;

	@Override
	public List<MasterDataDTO> findByMaster(MasterDTO master) {
		return ObjectUtils.transferProperties(dao.findByMaster(ObjectUtils.transferProperties(master, MatMaster.class)), MasterDataDTO.class);
	}

	
	@Override
	public List<MasterDataDTO> findByMasterCode(String masterCode) {
		return ObjectUtils.transferProperties(dao.findByMasterCode(masterCode), MasterDataDTO.class);
	}
}
