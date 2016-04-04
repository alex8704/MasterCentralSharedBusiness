package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Ignore;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.Relation;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.fmw.util.ObjectUtils.UpperTransform;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_GRUPOS_EMPRESARIALES",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="taxIdentification", 
		descriptionFields={"businessName"},
		gridColumnFields={"taxIdentification", "businessName", "pbxNumber", "city"}),
		isAuditable=true
)
public class BusinessGroupDTO implements Serializable {
	@Key(column = "ID_GRUPO_EMPRESARIAL")
    private Integer businessGroupId;
	@UpperTransform
    @Column(name = "RAZON_SOCIAL")
    private String businessName;
    @Column(name = "IDENTIFICACION_TRIBUTARIA")
    private String taxIdentification;
    @Column(name = "DIGITO_VERIFICACION")
    private Short checkDigit;
    @Column(name = "NUM_PBX")
    private String pbxNumber;
    @Column(name = "NUM_TELEFONO1")
    private String phoneNumber1;
    @Column(name = "NUM_TELEFONO2")
    private String phoneNumber2;
    @Column(name = "USUARIO_CREACION")
    private String creationUser;
    @Column(name = "USUARIO_MODIFICACION")
    private String modificationUser;
    @Column(name = "FEC_CREACION")
    private Date creationDate;
    @Column(name = "FEC_MODIFICACION")
    private Date modificationDate;
    @Ignore
    private AddressDTO address;
    @Relation(column="ID_CIUDAD")
    private CityDTO city;
	/**
	 * @return the businessGroupId
	 */
	public Integer getBusinessGroupId() {
		return businessGroupId;
	}
	/**
	 * @param businessGroupId the businessGroupId to set
	 */
	public void setBusinessGroupId(Integer businessGroupId) {
		this.businessGroupId = businessGroupId;
	}
	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}
	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	/**
	 * @return the taxIdentification
	 */
	public String getTaxIdentification() {
		return taxIdentification;
	}
	/**
	 * @param taxIdentification the taxIdentification to set
	 */
	public void setTaxIdentification(String taxIdentification) {
		this.taxIdentification = taxIdentification;
	}
	/**
	 * @return the checkDigit
	 */
	public Short getCheckDigit() {
		return checkDigit;
	}
	/**
	 * @param checkDigit the checkDigit to set
	 */
	public void setCheckDigit(Short checkDigit) {
		this.checkDigit = checkDigit;
	}
	/**
	 * @return the pbxNumber
	 */
	public String getPbxNumber() {
		return pbxNumber;
	}
	/**
	 * @param pbxNumber the pbxNumber to set
	 */
	public void setPbxNumber(String pbxNumber) {
		this.pbxNumber = pbxNumber;
	}
	/**
	 * @return the phoneNumber1
	 */
	public String getPhoneNumber1() {
		return phoneNumber1;
	}
	/**
	 * @param phoneNumber1 the phoneNumber1 to set
	 */
	public void setPhoneNumber1(String phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}
	/**
	 * @return the phoneNumber2
	 */
	public String getPhoneNumber2() {
		return phoneNumber2;
	}
	/**
	 * @param phoneNumber2 the phoneNumber2 to set
	 */
	public void setPhoneNumber2(String phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
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
	 * @return the address
	 */
	public AddressDTO getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public CityDTO getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(CityDTO city) {
		this.city = city;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkDigit == null) ? 0 : checkDigit.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((taxIdentification == null) ? 0 : taxIdentification.hashCode());
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
		if (!(obj instanceof BusinessGroupDTO))
			return false;
		BusinessGroupDTO other = (BusinessGroupDTO) obj;
		if (checkDigit == null) {
			if (other.checkDigit != null)
				return false;
		} else if (!checkDigit.equals(other.checkDigit))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (taxIdentification == null) {
			if (other.taxIdentification != null)
				return false;
		} else if (!taxIdentification.equals(other.taxIdentification))
			return false;
		return true;
	}
}
