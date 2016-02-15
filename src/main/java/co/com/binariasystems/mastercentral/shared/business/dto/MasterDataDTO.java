package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.Relation;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_DATOS_MAESTRAS")
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="masterDataCode", descriptionFields={"description"})
)
public class MasterDataDTO implements Serializable {
	@Key(column = "ID_DATO_MAESTRA")
    private Integer masterDataId;
    @Column(name = "COD_DATO_MAESTRA")
    private String masterDataCode;
    @Column(name = "DESCRIPCION")
    private String description;
    @Relation(column = "ID_MAESTRA")
    private MasterDTO master;
	/**
	 * @return the masterDataId
	 */
	public Integer getMasterDataId() {
		return masterDataId;
	}
	/**
	 * @param masterDataId the masterDataId to set
	 */
	public void setMasterDataId(Integer masterDataId) {
		this.masterDataId = masterDataId;
	}
	/**
	 * @return the masterDataCode
	 */
	public String getMasterDataCode() {
		return masterDataCode;
	}
	/**
	 * @param masterDataCode the masterDataCode to set
	 */
	public void setMasterDataCode(String masterDataCode) {
		this.masterDataCode = masterDataCode;
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
	 * @return the master
	 */
	public MasterDTO getMaster() {
		return master;
	}
	/**
	 * @param master the master to set
	 */
	public void setMaster(MasterDTO master) {
		this.master = master;
	}
}