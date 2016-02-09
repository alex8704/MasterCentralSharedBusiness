package co.com.binariasystems.mastercentral.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.business.utils.MatCentralConstants;

@Entity(table=MatCentralConstants.MAT_DBSCHEMA+"."+"MAT_MAESTRAS")
@CRUDViewConfig(
		messagesFilePath=MatCentralConstants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="masterCode", descriptionFields={"name"})
)
public class MasterDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Key(column = "ID_MAESTRA")
    private Integer masterId;
    @Column(name = "COD_MAESTRA")
    private String masterCode;
    @Column(name = "NOMBRE")
    private String name;
	/**
	 * @return the masterId
	 */
	public Integer getMasterId() {
		return masterId;
	}
	/**
	 * @param masterId the masterId to set
	 */
	public void setMasterId(Integer masterId) {
		this.masterId = masterId;
	}
	/**
	 * @return the masterCode
	 */
	public String getMasterCode() {
		return masterCode;
	}
	/**
	 * @param masterCode the masterCode to set
	 */
	public void setMasterCode(String masterCode) {
		this.masterCode = masterCode;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
