package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.commonsmodel.enumerated.SN2Boolean;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_ARLS")
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="occupationalRiskAdminCompanyCode", descriptionFields={"name"})
)
public class OccupationalRiskAdminCompanyDTO implements Serializable {
	@Key(column = "ID_ARL")
    private Integer occupationalRiskAdminCompanyId;
    @Column(name = "COD_ARL")
    private String occupationalRiskAdminCompanyCode;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "ES_VIGENTE")
    private SN2Boolean isActive;
	/**
	 * @return the occupationalRiskAdminCompanyId
	 */
	public Integer getOccupationalRiskAdminCompanyId() {
		return occupationalRiskAdminCompanyId;
	}
	/**
	 * @param occupationalRiskAdminCompanyId the occupationalRiskAdminCompanyId to set
	 */
	public void setOccupationalRiskAdminCompanyId(Integer occupationalRiskAdminCompanyId) {
		this.occupationalRiskAdminCompanyId = occupationalRiskAdminCompanyId;
	}
	/**
	 * @return the occupationalRiskAdminCompanyCode
	 */
	public String getOccupationalRiskAdminCompanyCode() {
		return occupationalRiskAdminCompanyCode;
	}
	/**
	 * @param occupationalRiskAdminCompanyCode the occupationalRiskAdminCompanyCode to set
	 */
	public void setOccupationalRiskAdminCompanyCode(String occupationalRiskAdminCompanyCode) {
		this.occupationalRiskAdminCompanyCode = occupationalRiskAdminCompanyCode;
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
}
