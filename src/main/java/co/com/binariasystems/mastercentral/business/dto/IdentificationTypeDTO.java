package co.com.binariasystems.mastercentral.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.business.utils.MatCentralConstants;

@Entity(table=MatCentralConstants.MAT_DBSCHEMA+"."+"MAT_TIPOS_IDENTIFICACION")
@CRUDViewConfig(
		messagesFilePath=MatCentralConstants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="identificationTypeCode", descriptionFields={"shorName", "description"})
)
public class IdentificationTypeDTO implements Serializable {
	@Key(column = "ID_TIPO_IDENTIFICACION")
    private Integer identificationTypeId;
    @Column(name = "COD_TIPO_IDENTIFICACION")
    private String identificationTypeCode;
    @Column(name = "NOMBRE_CORTO")
    private String shorName;
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
	public String getShorName() {
		return shorName;
	}
	/**
	 * @param shorName the shorName to set
	 */
	public void setShorName(String shorName) {
		this.shorName = shorName;
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
}
