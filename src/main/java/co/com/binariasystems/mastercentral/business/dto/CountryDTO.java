package co.com.binariasystems.mastercentral.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.business.utils.MatCentralConstants;

@Entity(table=MatCentralConstants.MAT_DBSCHEMA+"."+"MAT_PAISES")
@CRUDViewConfig(
		messagesFilePath=MatCentralConstants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="contryCode", descriptionFields={"name"})
)
public class CountryDTO implements Serializable{
	@Key(column = "ID_PAIS")
    private Integer countryId;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "COD_DANE")
    private String contryCode;
	/**
	 * @return the countryId
	 */
	public Integer getCountryId() {
		return countryId;
	}
	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
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
	 * @return the contryCode
	 */
	public String getContryCode() {
		return contryCode;
	}
	/**
	 * @param contryCode the contryCode to set
	 */
	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}
}
