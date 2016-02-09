package co.com.binariasystems.mastercentral.business.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.commonsmodel.enumerated.Application;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.business.utils.MatCentralConstants;

@Entity(table=MatCentralConstants.MAT_DBSCHEMA+"."+"MAT_PARAMETROS_CONFIG")
@CRUDViewConfig(
		messagesFilePath=MatCentralConstants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="configParameterCode", descriptionFields={"description"}),
		isAuditable=true
)
public class ConfigParameterDTO implements Serializable {
	@Key(column = "ID_PARAM_CONFIG")
    private Integer configParameterId;
    @Column(name = "COD_PARAM_CONFIG")
    private String configParameterCode;
    @Column(name = "COD_APLICACION")
    private Application applicationCode;
    @Column(name = "DESCRIPCION")
    private String description;
    @Column(name = "VLR_NUMERICO")
    private Double numericValue;
    @Column(name = "VLR_CADENA")
    private String stringValue;
    @Column(name = "USUARIO_CREACION")
    private String creationUser;
    @Column(name = "USUARIO_MODIFICACION")
    private String modificationUser;
    @Column(name = "FEC_CREACION")
    private Date creationDate;
    @Column(name = "FEC_MODIFICACION")
    private Date modificationDate;
	/**
	 * @return the configParameterId
	 */
	public Integer getConfigParameterId() {
		return configParameterId;
	}
	/**
	 * @param configParameterId the configParameterId to set
	 */
	public void setConfigParameterId(Integer configParameterId) {
		this.configParameterId = configParameterId;
	}
	/**
	 * @return the configParameterCode
	 */
	public String getConfigParameterCode() {
		return configParameterCode;
	}
	/**
	 * @param configParameterCode the configParameterCode to set
	 */
	public void setConfigParameterCode(String configParameterCode) {
		this.configParameterCode = configParameterCode;
	}
	/**
	 * @return the applicationCode
	 */
	public Application getApplicationCode() {
		return applicationCode;
	}
	/**
	 * @param applicationCode the applicationCode to set
	 */
	public void setApplicationCode(Application applicationCode) {
		this.applicationCode = applicationCode;
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
	 * @return the numericValue
	 */
	public Double getNumericValue() {
		return numericValue;
	}
	/**
	 * @param numericValue the numericValue to set
	 */
	public void setNumericValue(Double numericValue) {
		this.numericValue = numericValue;
	}
	/**
	 * @return the stringValue
	 */
	public String getStringValue() {
		return stringValue;
	}
	/**
	 * @param stringValue the stringValue to set
	 */
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
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
}