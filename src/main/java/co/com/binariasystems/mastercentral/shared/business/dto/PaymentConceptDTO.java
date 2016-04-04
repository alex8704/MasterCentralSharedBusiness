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

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_CONCEPTOS_PAGO",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="paymentConceptId", descriptionFields={"name"},
				gridColumnFields={"name", "forEmployees", "forProviders"}),
		isAuditable=true
)
public class PaymentConceptDTO implements Serializable {
	@Key(column = "ID_CONCEPTO_PAGO")
    private Integer paymentConceptId;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "DESCRIPCION")
    private String description;
    @Column(name = "APLICA_EMPLEADOS")
    private SN2Boolean forEmployees;
    @Column(name = "APLICA_PROVEEDORES")
    private SN2Boolean forProviders;
    @Column(name = "USUARIO_CREACION")
    private String creationUser;
    @Column(name = "USUARIO_MODIFICACION")
    private String modificationUser;
    @Column(name = "FEC_CREACION")
    private Date creationDate;
    @Column(name = "FEC_MODIFICACION")
    private Date modificationDate;
	/**
	 * @return the paymentConceptId
	 */
	public Integer getPaymentConceptId() {
		return paymentConceptId;
	}
	/**
	 * @param paymentConceptId the paymentConceptId to set
	 */
	public void setPaymentConceptId(Integer paymentConceptId) {
		this.paymentConceptId = paymentConceptId;
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
	 * @return the forEmployees
	 */
	public SN2Boolean getForEmployees() {
		return forEmployees;
	}
	/**
	 * @param forEmployees the forEmployees to set
	 */
	public void setForEmployees(SN2Boolean forEmployees) {
		this.forEmployees = forEmployees;
	}
	/**
	 * @return the forProviders
	 */
	public SN2Boolean getForProviders() {
		return forProviders;
	}
	/**
	 * @param forProviders the forProviders to set
	 */
	public void setForProviders(SN2Boolean forProviders) {
		this.forProviders = forProviders;
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
		result = prime * result + ((forEmployees == null) ? 0 : forEmployees.hashCode());
		result = prime * result + ((forProviders == null) ? 0 : forProviders.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof PaymentConceptDTO))
			return false;
		PaymentConceptDTO other = (PaymentConceptDTO) obj;
		if (forEmployees != other.forEmployees)
			return false;
		if (forProviders != other.forProviders)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
