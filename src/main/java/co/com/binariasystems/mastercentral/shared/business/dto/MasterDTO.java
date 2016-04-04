package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_MAESTRAS",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="masterCode", descriptionFields={"name"})
)
public class MasterDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Key(column = "ID_MAESTRA")
    private Integer masterId;
    @Column(name = "COD_MAESTRA")
    private String masterCode;
    @Column(name = "NOMBRE")
    private String name;
	/**
	 * @return the masterId
	 */
	public Integer getMasterId() {
		return masterId;
	}
	/**
	 * @param masterId the masterId to set
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
	/**
	 * @return the masterCode
	 */
	public String getMasterCode() {
		return masterCode;
	}
	/**
	 * @param masterCode the masterCode to set
	 */
	public void setMasterCode(String masterCode) {
		this.masterCode = masterCode;
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
		result = prime * result + ((masterCode == null) ? 0 : masterCode.hashCode());
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
		if (!(obj instanceof MasterDTO))
			return false;
		MasterDTO other = (MasterDTO) obj;
		if (masterCode == null) {
			if (other.masterCode != null)
				return false;
		} else if (!masterCode.equals(other.masterCode))
			return false;
		return true;
	}
}
