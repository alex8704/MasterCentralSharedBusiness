package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_TIPOS_IDENTIFICACION")
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
}
