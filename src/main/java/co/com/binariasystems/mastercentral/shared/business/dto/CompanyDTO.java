package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;
import java.util.Date;

import co.com.binariasystems.commonsmodel.enumerated.PayrollPeriodType;
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

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_EMPRESAS",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="taxIdentification", descriptionFields={"businessName"},
				gridColumnFields={"taxIdentification", "businessName", "pbxNumber", "emailAdress", "businessGroup", "city"}),
		isAuditable=true
)
public class CompanyDTO implements Serializable {
	@Key(column = "ID_EMPRESA")
    private Integer companyId;
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
    @Column(name = "CORREO_ELECTRONICO")
    private String emailAdress;
    @Column(name = "COD_TIPO_PERIODO_NOMINA")
    private PayrollPeriodType payrollPeriodType;
    @Column(name = "USUARIO_CREACION")
    private String creationUser;
    @Column(name = "USUARIO_MODIFICACION")
    private String modificationUser;
    @Column(name = "FEC_CREACION")
    private Date creationDate;
    @Column(name = "FEC_MODIFICACION")
    private Date modificationDate;
    @Relation(column = "ID_TIPO_CONTRIBUYENTE")
    private TaxpayerTypeDTO taxpayerType;
    @Relation(column = "ID_GRUPO_EMPRESARIAL")
    private BusinessGroupDTO businessGroup;
    @Ignore
    private AddressDTO address;
    @Relation(column = "ID_CIUDAD")
    private CityDTO city;
    @Relation(column = "ID_BANCO_CONVENIO_NOMINA")
    private BankDTO payrollBank;
    @Relation(column = "ID_ACTIVIDAD_ECONOMICA")
    private EconomicActivityDTO economicActivity;
	/**
	 * @return the companyId
	 */
	public Integer getCompanyId() {
		return companyId;
	}
	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
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
	 * @param digitoVerificacion the checkDigit to set
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
	 * @return the emailAdress
	 */
	public String getEmailAdress() {
		return emailAdress;
	}
	/**
	 * @param emailAdress the emailAdress to set
	 */
	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}
	/**
	 * @return the payrollPeriodType
	 */
	public PayrollPeriodType getPayrollPeriodType() {
		return payrollPeriodType;
	}
	/**
	 * @param payrollPeriodType the payrollPeriodType to set
	 */
	public void setPayrollPeriodType(PayrollPeriodType payrollPeriodType) {
		this.payrollPeriodType = payrollPeriodType;
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
	 * @return the businessGroup
	 */
	public BusinessGroupDTO getBusinessGroup() {
		return businessGroup;
	}
	/**
	 * @param businessGroup the businessGroup to set
	 */
	public void setBusinessGroup(BusinessGroupDTO businessGroup) {
		this.businessGroup = businessGroup;
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
	 * @return the payrollBank
	 */
	public BankDTO getPayrollBank() {
		return payrollBank;
	}
	/**
	 * @param payrollBank the payrollBank to set
	 */
	public void setPayrollBank(BankDTO payrollBank) {
		this.payrollBank = payrollBank;
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
		result = prime * result + ((businessGroup == null) ? 0 : businessGroup.hashCode());
		result = prime * result + ((checkDigit == null) ? 0 : checkDigit.hashCode());
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
		if (!(obj instanceof CompanyDTO))
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		if (businessGroup == null) {
			if (other.businessGroup != null)
				return false;
		} else if (!businessGroup.equals(other.businessGroup))
			return false;
		if (checkDigit == null) {
			if (other.checkDigit != null)
				return false;
		} else if (!checkDigit.equals(other.checkDigit))
			return false;
		if (taxIdentification == null) {
			if (other.taxIdentification != null)
				return false;
		} else if (!taxIdentification.equals(other.taxIdentification))
			return false;
		return true;
	}
}
