package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.commonsmodel.enumerated.SN2Boolean;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_EPSS")
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="healthAdminCompanyCode", descriptionFields={"name"})
)
public class HealthAdminCompanyDTO implements Serializable {
	@Key(column = "ID_EPS")
    private Integer healthAdminCompanyId;
    @Column(name = "COD_EPS")
    private String healthAdminCompanyCode;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "ES_VIGENTE")
    private SN2Boolean isActive;
	/**
	 * @return the healthAdminCompanyId
	 */
	public Integer getHealthAdminCompanyId() {
		return healthAdminCompanyId;
	}
	/**
	 * @param healthAdminCompanyId the healthAdminCompanyId to set
	 */
	public void setHealthAdminCompanyId(Integer healthAdminCompanyId) {
		this.healthAdminCompanyId = healthAdminCompanyId;
	}
	/**
	 * @return the healthAdminCompanyCode
	 */
	public String getHealthAdminCompanyCode() {
		return healthAdminCompanyCode;
	}
	/**
	 * @param healthAdminCompanyCode the healthAdminCompanyCode to set
	 */
	public void setHealthAdminCompanyCode(String healthAdminCompanyCode) {
		this.healthAdminCompanyCode = healthAdminCompanyCode;
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
