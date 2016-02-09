package co.com.binariasystems.mastercentral.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.Relation;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.mastercentral.business.utils.MatCentralConstants;

@Entity(table=MatCentralConstants.MAT_DBSCHEMA+"."+"MAT_ACTIVIDADES_ECONOMICAS")
@CRUDViewConfig(
		messagesFilePath=MatCentralConstants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="economicActivityCode", descriptionFields={"name"})
)
public class EconomicActivityDTO implements Serializable {
	@Key(column = "ID_ACTIVIDAD_ECONOMICA")
    private Integer economicActivityId;
    @Column(name = "COD_ACTIVIDAD_CIIU")
    private String economicActivityCode;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "DESCRIPCION")
    private String description;
    @Relation(column = "ID_GRUPO_TARIFARIO")
    private EconomicActivityTariffGroupingDTO tariffGrouping;
	/**
	 * @return the economicActivityId
	 */
	public Integer getEconomicActivityId() {
		return economicActivityId;
	}
	/**
	 * @param economicActivityId the economicActivityId to set
	 */
	public void setEconomicActivityId(Integer economicActivityId) {
		this.economicActivityId = economicActivityId;
	}
	/**
	 * @return the economicActivityCode
	 */
	public String getEconomicActivityCode() {
		return economicActivityCode;
	}
	/**
	 * @param economicActivityCode the economicActivityCode to set
	 */
	public void setEconomicActivityCode(String economicActivityCode) {
		this.economicActivityCode = economicActivityCode;
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
	 * @return the tariffGrouping
	 */
	public EconomicActivityTariffGroupingDTO getTariffGrouping() {
		return tariffGrouping;
	}
	/**
	 * @param tariffGrouping the tariffGrouping to set
	 */
	public void setTariffGrouping(EconomicActivityTariffGroupingDTO tariffGrouping) {
		this.tariffGrouping = tariffGrouping;
	}
}