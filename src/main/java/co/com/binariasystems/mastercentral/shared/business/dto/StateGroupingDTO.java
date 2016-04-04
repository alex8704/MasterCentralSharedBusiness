package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_AGRUPADOR_ESTADOS",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="stateGroupingCode", descriptionFields={"name"})
)
public class StateGroupingDTO implements Serializable {
	@Key(column = "ID_AGRUPADOR")
    private Integer stateGroupingId;
    @Column(name = "COD_AGRUPADOR")
    private String stateGroupingCode;
    @Column(name = "NOMBRE")
    private String name;
	/**
	 * @return the stateGroupingId
	 */
	public Integer getStateGroupingId() {
		return stateGroupingId;
	}
	/**
	 * @param stateGroupingId the stateGroupingId to set
	 */
	public void setStateGroupingId(Integer stateGroupingId) {
		this.stateGroupingId = stateGroupingId;
	}
	/**
	 * @return the stateGroupingCode
	 */
	public String getStateGroupingCode() {
		return stateGroupingCode;
	}
	/**
	 * @param stateGroupingCode the stateGroupingCode to set
	 */
	public void setStateGroupingCode(String stateGroupingCode) {
		this.stateGroupingCode = stateGroupingCode;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stateGroupingCode == null) ? 0 : stateGroupingCode.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof StateGroupingDTO))
			return false;
		StateGroupingDTO other = (StateGroupingDTO) obj;
		if (stateGroupingCode == null) {
			if (other.stateGroupingCode != null)
				return false;
		} else if (!stateGroupingCode.equals(other.stateGroupingCode))
			return false;
		return true;
	}
}
