package co.com.binariasystems.mastercentral.business.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.commonsmodel.enumerated.PersonType;
import co.com.binariasystems.commonsmodel.enumerated.RetentionTaxtType;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.Relation;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.business.utils.MatCentralConstants;

@Entity(table=MatCentralConstants.MAT_DBSCHEMA+"."+"MAT_CONFIG_RETENCIONES")
@CRUDViewConfig(
		messagesFilePath=MatCentralConstants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="retentionConfigId", descriptionFields={"retentionTaxtType", "personType", "tariffValue"}),
		isAuditable=true
)
public class RetentionConfigDTO implements Serializable {
	@Key(column = "ID_CONFIG_RETENCION")
    private Integer retentionConfigId;
    @Column(name = "COD_TIPO_RETENCION")
    private RetentionTaxtType retentionTaxtType;
    @Column(name = "COD_TIPO_PERSONA")
    private PersonType personType;
    @Column(name = "UVT_GRAVABLE")
    private Double taxableUVT;
    @Column(name = "VLR_TARIFA")
    private Double tariffValue;
    @Column(name = "USUARIO_CREACION")
    private String creationUser;
    @Column(name = "USUARIO_MODIFICACION")
    private String modificationUser;
    @Column(name = "FEC_CREACION")
    private Date creationDate;
    @Column(name = "FEC_MODIFICACION")
    private Date modificationDate;
    @Relation(column = "ID_CONCEPTO_PAGO")
    private PaymentConceptDTO paymentConcept;
	/**
	 * @return the retentionConfigId
	 */
	public Integer getRetentionConfigId() {
		return retentionConfigId;
	}
	/**
	 * @param retentionConfigId the retentionConfigId to set
	 */
	public void setRetentionConfigId(Integer retentionConfigId) {
		this.retentionConfigId = retentionConfigId;
	}
	/**
	 * @return the retentionTaxtType
	 */
	public RetentionTaxtType getRetentionTaxtType() {
		return retentionTaxtType;
	}
	/**
	 * @param retentionTaxtType the retentionTaxtType to set
	 */
	public void setRetentionTaxtType(RetentionTaxtType retentionTaxtType) {
		this.retentionTaxtType = retentionTaxtType;
	}
	/**
	 * @return the personType
	 */
	public PersonType getPersonType() {
		return personType;
	}
	/**
	 * @param personType the personType to set
	 */
	public void setPersonType(PersonType personType) {
		this.personType = personType;
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
	 * @return the tariffValue
	 */
	public Double getTariffValue() {
		return tariffValue;
	}
	/**
	 * @param tariffValue the tariffValue to set
	 */
	public void setTariffValue(Double tariffValue) {
		this.tariffValue = tariffValue;
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
	/**
	 * @return the paymentConcept
	 */
	public PaymentConceptDTO getPaymentConcept() {
		return paymentConcept;
	}
	/**
	 * @param paymentConcept the paymentConcept to set
	 */
	public void setPaymentConcept(PaymentConceptDTO paymentConcept) {
		this.paymentConcept = paymentConcept;
	}
}
