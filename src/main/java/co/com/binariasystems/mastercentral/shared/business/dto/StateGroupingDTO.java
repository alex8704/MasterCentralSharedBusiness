package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_AGRUPADOR_ESTADOS")
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="stateGroupingCode", descriptionFields={"name"})
)
public class StateGroupingDTO implements Serializable {
	@Key(column = "ID_AGRUPADOR")
    private Integer stateGroupingId;
    @Column(name = "COD_AGRUPADOR")
    private String stateGroupingCode;
    @Column(name = "NOMBRE")
    private String name;
	/**
	 * @return the stateGroupingId
	 */
	public Integer getStateGroupingId() {
		return stateGroupingId;
	}
	/**
	 * @param stateGroupingId the stateGroupingId to set
	 */
	public void setStateGroupingId(Integer stateGroupingId) {
		this.stateGroupingId = stateGroupingId;
	}
	/**
	 * @return the stateGroupingCode
	 */
	public String getStateGroupingCode() {
		return stateGroupingCode;
	}
	/**
	 * @param stateGroupingCode the stateGroupingCode to set
	 */
	public void setStateGroupingCode(String stateGroupingCode) {
		this.stateGroupingCode = stateGroupingCode;
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
}
