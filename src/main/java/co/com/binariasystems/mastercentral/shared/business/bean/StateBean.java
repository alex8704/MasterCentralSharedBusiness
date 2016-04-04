package co.com.binariasystems.mastercentral.shared.business.bean;

import java.util.List;

import co.com.binariasystems.mastercentral.shared.business.dto.StateDTO;
import co.com.binariasystems.mastercentral.shared.business.dto.StateGroupingDTO;


public interface StateBean{
	public List<StateDTO> findByGrouping(StateGroupingDTO stateGrouping);
	public List<StateDTO> findByGroupingCode(String groupingCode);
}
