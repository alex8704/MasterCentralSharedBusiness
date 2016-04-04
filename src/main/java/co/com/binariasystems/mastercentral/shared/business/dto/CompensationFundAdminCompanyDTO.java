package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.commonsmodel.enumerated.SN2Boolean;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_CCFS",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="compensationFundAdminCompanyCode", descriptionFields={"name"})
)
public class CompensationFundAdminCompanyDTO implements Serializable {
	@Key(column = "ID_CCF")
    private Integer compensationFundAdminCompanyId;
    @Column(name = "COD_CCF")
    private String compensationFundAdminCompanyCode;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "ES_VIGENTE")
    private SN2Boolean isActive;
	/**
	 * @return the compensationFundAdminCompanyId
	 */
	public Integer getCompensationFundAdminCompanyId() {
		return compensationFundAdminCompanyId;
	}
	/**
	 * @param compensationFundAdminCompanyId the compensationFundAdminCompanyId to set
	 */
	public void setCompensationFundAdminCompanyId(Integer compensationFundAdminCompanyId) {
		this.compensationFundAdminCompanyId = compensationFundAdminCompanyId;
	}
	/**
	 * @return the compensationFundAdminCompanyCode
	 */
	public String getCompensationFundAdminCompanyCode() {
		return compensationFundAdminCompanyCode;
	}
	/**
	 * @param compensationFundAdminCompanyCode the compensationFundAdminCompanyCode to set
	 */
	public void setCompensationFundAdminCompanyCode(String compensationFundAdminCompanyCode) {
		this.compensationFundAdminCompanyCode = compensationFundAdminCompanyCode;
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
	/**
	 * @return the isActive
	 */
	public SN2Boolean getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(SN2Boolean isActive) {
		this.isActive = isActive;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((compensationFundAdminCompanyCode == null) ? 0 : compensationFundAdminCompanyCode.hashCode());
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
		if (!(obj instanceof CompensationFundAdminCompanyDTO))
			return false;
		CompensationFundAdminCompanyDTO other = (CompensationFundAdminCompanyDTO) obj;
		if (compensationFundAdminCompanyCode == null) {
			if (other.compensationFundAdminCompanyCode != null)
				return false;
		} else if (!compensationFundAdminCompanyCode.equals(other.compensationFundAdminCompanyCode))
			return false;
		return true;
	}
}
