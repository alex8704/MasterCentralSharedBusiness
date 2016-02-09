package co.com.binariasystems.mastercentral.business.dto;

import java.io.Serializable;

import co.com.binariasystems.commonsmodel.enumerated.SN2Boolean;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.business.utils.MatCentralConstants;

@Entity(table=MatCentralConstants.MAT_DBSCHEMA+"."+"MAT_CCFS")
@CRUDViewConfig(
		messagesFilePath=MatCentralConstants.ENTITY_CRUDS_MESSAGES,
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
}
