package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.commonsmodel.enumerated.SN2Boolean;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_TIPOS_CONTRIBUYENTE",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="taxpayerTypeCode", descriptionFields={"name"},
				gridColumnFields={"taxpayerTypeCode", "name", "isIncomeRetentionTarget", "isIVARetentionTarget", "isICARetentionTarget"
				, "isCREERetentionTarget", "responsibleOfIVA", "responsibleOfIncome", "responsibleOfICA", "responsibleOfCREE"}),
		isAuditable=true
)
public class TaxpayerTypeDTO implements Serializable {
	@Key(column = "ID_TIPO_CONTRIBUYENTE")
    private Integer taxpayerTypeId;
    @Column(name = "COD_TIPO_CONTRIBUYENTE")
    private String taxpayerTypeCode;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "DESCRIPCION")
    private String description;
    @Column(name = "RETEFUENTE_RENTA_APLICABLE")
    private SN2Boolean isIncomeRetentionTarget;
    @Column(name = "RETEFUENTE_IVA_APLICABLE")
    private SN2Boolean isIVARetentionTarget;
    @Column(name = "RETEFUENTE_ICA_APLICABLE")
    private SN2Boolean isICARetentionTarget;
    @Column(name = "RETEFUENTE_CRE_APLICABLE")
    private SN2Boolean isCREERetentionTarget;
    @Column(name = "DECLARA_IVA")
    private SN2Boolean responsibleOfIVA;
    @Column(name = "DECLARA_RENTA")
    private SN2Boolean responsibleOfIncome;
    @Column(name = "DECLARA_ICA")
    private SN2Boolean responsibleOfICA;
    @Column(name = "DECLARA_CREE")
    private SN2Boolean responsibleOfCREE;
    @Column(name = "USUARIO_CREACION")
    private String creationUser;
    @Column(name = "USUARIO_MODIFICACION")
    private String modificationUser;
    @Column(name = "FEC_CREACION")
    private Date creationDate;
    @Column(name = "FEC_MODIFICACION")
    private Date modificationDate;
	/**
	 * @return the taxpayerTypeId
	 */
	public Integer getTaxpayerTypeId() {
		return taxpayerTypeId;
	}
	/**
	 * @param taxpayerTypeId the taxpayerTypeId to set
	 */
	public void setTaxpayerTypeId(Integer taxpayerTypeId) {
		this.taxpayerTypeId = taxpayerTypeId;
	}
	/**
	 * @return the taxpayerTypeCode
	 */
	public String getTaxpayerTypeCode() {
		return taxpayerTypeCode;
	}
	/**
	 * @param taxpayerTypeCode the taxpayerTypeCode to set
	 */
	public void setTaxpayerTypeCode(String taxpayerTypeCode) {
		this.taxpayerTypeCode = taxpayerTypeCode;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the isIncomeRetentionTarget
	 */
	public SN2Boolean getIsIncomeRetentionTarget() {
		return isIncomeRetentionTarget;
	}
	/**
	 * @param isIncomeRetentionTarget the isIncomeRetentionTarget to set
	 */
	public void setIsIncomeRetentionTarget(SN2Boolean isIncomeRetentionTarget) {
		this.isIncomeRetentionTarget = isIncomeRetentionTarget;
	}
	/**
	 * @return the isIVARetentionTarget
	 */
	public SN2Boolean getIsIVARetentionTarget() {
		return isIVARetentionTarget;
	}
	/**
	 * @param isIVARetentionTarget the isIVARetentionTarget to set
	 */
	public void setIsIVARetentionTarget(SN2Boolean isIVARetentionTarget) {
		this.isIVARetentionTarget = isIVARetentionTarget;
	}
	/**
	 * @return the isICARetentionTarget
	 */
	public SN2Boolean getIsICARetentionTarget() {
		return isICARetentionTarget;
	}
	/**
	 * @param isICARetentionTarget the isICARetentionTarget to set
	 */
	public void setIsICARetentionTarget(SN2Boolean isICARetentionTarget) {
		this.isICARetentionTarget = isICARetentionTarget;
	}
	/**
	 * @return the isCREERetentionTarget
	 */
	public SN2Boolean getIsCREERetentionTarget() {
		return isCREERetentionTarget;
	}
	/**
	 * @param isCREERetentionTarget the isCREERetentionTarget to set
	 */
	public void setIsCREERetentionTarget(SN2Boolean isCREERetentionTarget) {
		this.isCREERetentionTarget = isCREERetentionTarget;
	}
	/**
	 * @return the responsibleOfIVA
	 */
	public SN2Boolean getResponsibleOfIVA() {
		return responsibleOfIVA;
	}
	/**
	 * @param responsibleOfIVA the responsibleOfIVA to set
	 */
	public void setResponsibleOfIVA(SN2Boolean responsibleOfIVA) {
		this.responsibleOfIVA = responsibleOfIVA;
	}
	/**
	 * @return the responsibleOfIncome
	 */
	public SN2Boolean getResponsibleOfIncome() {
		return responsibleOfIncome;
	}
	/**
	 * @param responsibleOfIncome the responsibleOfIncome to set
	 */
	public void setResponsibleOfIncome(SN2Boolean responsibleOfIncome) {
		this.responsibleOfIncome = responsibleOfIncome;
	}
	/**
	 * @return the responsibleOfICA
	 */
	public SN2Boolean getResponsibleOfICA() {
		return responsibleOfICA;
	}
	/**
	 * @param responsibleOfICA the responsibleOfICA to set
	 */
	public void setResponsibleOfICA(SN2Boolean responsibleOfICA) {
		this.responsibleOfICA = responsibleOfICA;
	}
	/**
	 * @return the responsibleOfCREE
	 */
	public SN2Boolean getResponsibleOfCREE() {
		return responsibleOfCREE;
	}
	/**
	 * @param responsibleOfCREE the responsibleOfCREE to set
	 */
	public void setResponsibleOfCREE(SN2Boolean responsibleOfCREE) {
		this.responsibleOfCREE = responsibleOfCREE;
	}
	/**
	 * @return the creationUser
	 */
	public String getCreationUser() {
		return creationUser;
	}
	/**
	 * @param creationUser the creationUser to set
	 */
	public void setCreationUser(String creationUser) {
		this.creationUser = creationUser;
	}
	/**
	 * @return the modificationUser
	 */
	public String getModificationUser() {
		return modificationUser;
	}
	/**
	 * @param modificationUser the modificationUser to set
	 */
	public void setModificationUser(String modificationUser) {
		this.modificationUser = modificationUser;
	}
	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}
	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	/**
	 * @return the modificationDate
	 */
	public Date getModificationDate() {
		return modificationDate;
	}
	/**
	 * @param modificationDate the modificationDate to set
	 */
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((taxpayerTypeCode == null) ? 0 : taxpayerTypeCode.hashCode());
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
		if (!(obj instanceof TaxpayerTypeDTO))
			return false;
		TaxpayerTypeDTO other = (TaxpayerTypeDTO) obj;
		if (taxpayerTypeCode == null) {
			if (other.taxpayerTypeCode != null)
				return false;
		} else if (!taxpayerTypeCode.equals(other.taxpayerTypeCode))
			return false;
		return true;
	}
}
