package co.com.binariasystems.mastercentral.shared.business.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import co.com.binariasystems.fmw.dataaccess.JPABasedDAO;
import co.com.binariasystems.mastercentral.shared.business.entity.MatState;
import co.com.binariasystems.mastercentral.shared.business.entity.MatStateGrouping;

public interface StateDAO extends JPABasedDAO<MatState, Integer> {
	public List<MatState> findByStateGrouping(MatStateGrouping stateGrouping);
	@Query(name="MatState.findByGroupingCode")
	public List<MatState> findByGroupingCode(String groupingCode);
}
