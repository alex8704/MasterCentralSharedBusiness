package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.commonsmodel.enumerated.PersonType;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Ignore;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.Relation;
import co.com.binariasystems.fmw.util.ObjectUtils.UpperTransform;

public abstract class ThirdPersonDTO implements Serializable {
	@Key(column = "ID_TERCERO")
    private Integer thirdPersonId;
	@Ignore
    @Column(name = "NUM_TELEFONO1")
    private String phoneNumber1;
	@Ignore
    @Column(name = "NUM_TELEFONO2")
    private String phoneNumber2;
	@Ignore
    @Column(name = "COD_TIPO_PERSONA")
    private PersonType personType;
    @Column(name = "NUM_IDENTIFICACION")
    private String identificationNumber;
    @UpperTransform
    @Column(name = "RAZON_SOCIAL")
    private String businessName;
    @UpperTransform
    @Column(name = "PRIMER_NOMBRE")
    private String firstName;
    @UpperTransform
    @Column(name = "SEGUNDO_NOMBRE")
    private String middleName;
    @UpperTransform
    @Column(name = "PRIMER_APELLIDO")
    private String lastName;
    @UpperTransform
    @Column(name = "SEGUNDO_APELLIDO")
    private String secondLasName;
    @Ignore
    @Column(name = "CORREO_ELECTRONICO")
    private String emailAddress;
    @Column(name = "USUARIO_CREACION")
    private String creationUser;
    @Column(name = "USUARIO_MODIFICACION")
    private String modificationUser;
    @Column(name = "FEC_CREACION")
    private Date creationDate;
    @Column(name = "FEC_MODIFICACION")
    private Date modificationDate;
    @Relation(column = "ID_TIPO_IDENTIFICACION")
    private IdentificationTypeDTO identificationType;
    @Ignore
    @Relation(column = "ID_TIPO_CONTRIBUYENTE")
    private TaxpayerTypeDTO taxpayerType;
    @Ignore
    private AddressDTO address;
    @Ignore
    @Relation(column = "ID_CIUDAD")
    private CityDTO city;
    @Ignore
    @Relation(column = "ID_ACTIVIDAD_ECONOMICA")
    private EconomicActivityDTO economicActivity;
	/**
	 * @return the thirdPersonId
	 */
	public Integer getThirdPersonId() {
		return thirdPersonId;
	}
	/**
	 * @param thirdPersonId the thirdPersonId to set
	 */
	public void setThirdPersonId(Integer thirdPersonId) {
		this.thirdPersonId = thirdPersonId;
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
	 * @return the identificationNumber
	 */
	public String getIdentificationNumber() {
		return identificationNumber;
	}
	/**
	 * @param identificationNumber the identificationNumber to set
	 */
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the secondLasName
	 */
	public String getSecondLasName() {
		return secondLasName;
	}
	/**
	 * @param secondLasName the secondLasName to set
	 */
	public void setSecondLasName(String secondLasName) {
		this.secondLasName = secondLasName;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	 * @return the identificationType
	 */
	public IdentificationTypeDTO getIdentificationType() {
		return identificationType;
	}
	/**
	 * @param identificationType the identificationType to set
	 */
	public void setIdentificationType(IdentificationTypeDTO identificationType) {
		this.identificationType = identificationType;
	}
	/**
	 * @return the taxpayerType
	 */
	public TaxpayerTypeDTO getTaxpayerType() {
		return taxpayerType;
	}
	/**
	 * @param taxpayerType the taxpayerType to set
	 */
	public void setTaxpayerType(TaxpayerTypeDTO taxpayerType) {
		this.taxpayerType = taxpayerType;
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
	/**
	 * @return the economicActivity
	 */
	public EconomicActivityDTO getEconomicActivity() {
		return economicActivity;
	}
	/**
	 * @param economicActivity the economicActivity to set
	 */
	public void setEconomicActivity(EconomicActivityDTO economicActivity) {
		this.economicActivity = economicActivity;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((economicActivity == null) ? 0 : economicActivity.hashCode());
		result = prime * result + ((identificationNumber == null) ? 0 : identificationNumber.hashCode());
		result = prime * result + ((identificationType == null) ? 0 : identificationType.hashCode());
		result = prime * result + ((personType == null) ? 0 : personType.hashCode());
		result = prime * result + ((taxpayerType == null) ? 0 : taxpayerType.hashCode());
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
		if (!(obj instanceof ThirdPersonDTO))
			return false;
		ThirdPersonDTO other = (ThirdPersonDTO) obj;
		if (economicActivity == null) {
			if (other.economicActivity != null)
				return false;
		} else if (!economicActivity.equals(other.economicActivity))
			return false;
		if (identificationNumber == null) {
			if (other.identificationNumber != null)
				return false;
		} else if (!identificationNumber.equals(other.identificationNumber))
			return false;
		if (identificationType == null) {
			if (other.identificationType != null)
				return false;
		} else if (!identificationType.equals(other.identificationType))
			return false;
		if (personType != other.personType)
			return false;
		if (taxpayerType == null) {
			if (other.taxpayerType != null)
				return false;
		} else if (!taxpayerType.equals(other.taxpayerType))
			return false;
		return true;
	}
}
