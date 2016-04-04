package co.com.binariasystems.mastercentral.shared.business.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import co.com.binariasystems.fmw.dataaccess.JPABasedDAO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatMaster;
import co.com.binariasystems.mastercentral.shared.business.entity.MatMasterData;

public interface MasterDataDAO extends JPABasedDAO<MatMasterData, Integer> {
	public List<MatMasterData> findByMaster(MatMaster master);
	@Query(name="MatMasterData.findByMasterCode")
	public List<MatMasterData> findByMasterCode(String masterCode);
}
