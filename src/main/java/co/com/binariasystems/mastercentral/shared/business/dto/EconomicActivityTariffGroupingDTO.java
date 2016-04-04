package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.commonsmodel.enumerated.EconomicCategory;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_GRUPOS_TARIFA_ACTI_ECONOM",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="tariffGroupingCode", descriptionFields={"name"},
				gridColumnFields={"tariffGroupingCode", "name", "taxableUVT", "currentTariffValue", "economicCategory"}),
		isAuditable=true
)
public class EconomicActivityTariffGroupingDTO implements Serializable {
	@Key(column = "ID_GRUPO_TARIFARIO")
    private Integer tariffGroupingId;
    @Column(name = "COD_RUBRO_ECONOMICO")
    private EconomicCategory economicCategory;
    @Column(name = "COD_GRUPO_TARIFARIO")
    private String tariffGroupingCode;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "UVT_GRAVABLE")
    private Double taxableUVT;
    @Column(name = "VLR_TARIFA_X_MIL_VIGENTE")
    private Double currentTariffValue;
    @Column(name = "USUARIO_CREACION")
    private String creationUser;
    @Column(name = "USUARIO_MODIFICACION")
    private String modificationUser;
    @Column(name = "FEC_CREACION")
    private Date creationDate;
    @Column(name = "FEC_MODIFICACION")
    private Date modificationDate;
	/**
	 * @return the tariffGroupingId
	 */
	public Integer getTariffGroupingId() {
		return tariffGroupingId;
	}
	/**
	 * @param tariffGroupingId the tariffGroupingId to set
	 */
	public void setTariffGroupingId(Integer tariffGroupingId) {
		this.tariffGroupingId = tariffGroupingId;
	}
	/**
	 * @return the economicCategory
	 */
	public EconomicCategory getEconomicCategory() {
		return economicCategory;
	}
	/**
	 * @param economicCategory the economicCategory to set
	 */
	public void setEconomicCategory(EconomicCategory economicCategory) {
		this.economicCategory = economicCategory;
	}
	/**
	 * @return the tariffGroupingCode
	 */
	public String getTariffGroupingCode() {
		return tariffGroupingCode;
	}
	/**
	 * @param tariffGroupingCode the tariffGroupingCode to set
	 */
	public void setTariffGroupingCode(String tariffGroupingCode) {
		this.tariffGroupingCode = tariffGroupingCode;
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
	 * @return the taxableUVT
	 */
	public Double getTaxableUVT() {
		return taxableUVT;
	}
	/**
	 * @param taxableUVT the taxableUVT to set
	 */
	public void setTaxableUVT(Double taxableUVT) {
		this.taxableUVT = taxableUVT;
	}
	/**
	 * @return the currentTariffValue
	 */
	public Double getCurrentTariffValue() {
		return currentTariffValue;
	}
	/**
	 * @param currentTariffValue the currentTariffValue to set
	 */
	public void setCurrentTariffValue(Double currentTariffValue) {
		this.currentTariffValue = currentTariffValue;
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
		result = prime * result + ((economicCategory == null) ? 0 : economicCategory.hashCode());
		result = prime * result + ((tariffGroupingCode == null) ? 0 : tariffGroupingCode.hashCode());
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
		if (!(obj instanceof EconomicActivityTariffGroupingDTO))
			return false;
		EconomicActivityTariffGroupingDTO other = (EconomicActivityTariffGroupingDTO) obj;
		if (economicCategory != other.economicCategory)
			return false;
		if (tariffGroupingCode == null) {
			if (other.tariffGroupingCode != null)
				return false;
		} else if (!tariffGroupingCode.equals(other.tariffGroupingCode))
			return false;
		return true;
	}
}
