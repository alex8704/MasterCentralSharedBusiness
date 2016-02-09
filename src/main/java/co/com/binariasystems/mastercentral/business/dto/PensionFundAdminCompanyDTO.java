package co.com.binariasystems.mastercentral.business.dto;

import java.io.Serializable;

import co.com.binariasystems.commonsmodel.enumerated.SN2Boolean;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.business.utils.MatCentralConstants;

@Entity(table=MatCentralConstants.MAT_DBSCHEMA+"."+"MAT_AFPS")
@CRUDViewConfig(
		messagesFilePath=MatCentralConstants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="pensionFundAdminCompanyCode", descriptionFields={"name"})
)
public class PensionFundAdminCompanyDTO implements Serializable {
	@Key(column = "ID_AFP")
    private Integer pensionFundAdminCompanyId;
    @Column(name = "COD_AFP")
    private String pensionFundAdminCompanyCode;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "ES_VIGENTE")
    private SN2Boolean isActive;
	/**
	 * @return the pensionFundAdminCompanyId
	 */
	public Integer getPensionFundAdminCompanyId() {
		return pensionFundAdminCompanyId;
	}
	/**
	 * @param pensionFundAdminCompanyId the pensionFundAdminCompanyId to set
	 */
	public void setPensionFundAdminCompanyId(Integer pensionFundAdminCompanyId) {
		this.pensionFundAdminCompanyId = pensionFundAdminCompanyId;
	}
	/**
	 * @return the pensionFundAdminCompanyCode
	 */
	public String getPensionFundAdminCompanyCode() {
		return pensionFundAdminCompanyCode;
	}
	/**
	 * @param pensionFundAdminCompanyCode the pensionFundAdminCompanyCode to set
	 */
	public void setPensionFundAdminCompanyCode(String pensionFundAdminCompanyCode) {
		this.pensionFundAdminCompanyCode = pensionFundAdminCompanyCode;
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
