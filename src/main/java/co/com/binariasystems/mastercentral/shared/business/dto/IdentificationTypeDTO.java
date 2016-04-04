package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_TIPOS_IDENTIFICACION",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="identificationTypeCode", descriptionFields={"shortName", "description"})
)
public class IdentificationTypeDTO implements Serializable {
	@Key(column = "ID_TIPO_IDENTIFICACION")
    private Integer identificationTypeId;
    @Column(name = "COD_TIPO_IDENTIFICACION")
    private String identificationTypeCode;
    @Column(name = "NOMBRE_CORTO")
    private String shortName;
    @Column(name = "DESCRIPCION")
    private String description;
	/**
	 * @return the identificationTypeId
	 */
	public Integer getIdentificationTypeId() {
		return identificationTypeId;
	}
	/**
	 * @param identificationTypeId the identificationTypeId to set
	 */
	public void setIdentificationTypeId(Integer identificationTypeId) {
		this.identificationTypeId = identificationTypeId;
	}
	/**
	 * @return the identificationTypeCode
	 */
	public String getIdentificationTypeCode() {
		return identificationTypeCode;
	}
	/**
	 * @param identificationTypeCode the identificationTypeCode to set
	 */
	public void setIdentificationTypeCode(String identificationTypeCode) {
		this.identificationTypeCode = identificationTypeCode;
	}
	/**
	 * @return the shorName
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * @param shorName the shorName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identificationTypeCode == null) ? 0 : identificationTypeCode.hashCode());
		result = prime * result + ((shortName == null) ? 0 : shortName.hashCode());
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
		if (!(obj instanceof IdentificationTypeDTO))
			return false;
		IdentificationTypeDTO other = (IdentificationTypeDTO) obj;
		if (identificationTypeCode == null) {
			if (other.identificationTypeCode != null)
				return false;
		} else if (!identificationTypeCode.equals(other.identificationTypeCode))
			return false;
		if (shortName == null) {
			if (other.shortName != null)
				return false;
		} else if (!shortName.equals(other.shortName))
			return false;
		return true;
	}
}
