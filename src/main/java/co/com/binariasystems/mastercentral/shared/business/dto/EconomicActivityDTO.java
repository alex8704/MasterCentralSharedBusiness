package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.Relation;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.mastercentral.shared.business.utils.Constants;

@Entity(table=Constants.MAT_DBSCHEMA+"."+"MAT_ACTIVIDADES_ECONOMICAS",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(
		messagesFilePath=Constants.ENTITY_CRUDS_MESSAGES,
		deleteEnabled=false,
		searcherConfig=@SearcherConfig(searchField="economicActivityCode", descriptionFields={"name"},
		gridColumnFields={"economicActivityCode", "name", "tariffGrouping"})
)
public class EconomicActivityDTO implements Serializable {
	@Key(column = "ID_ACTIVIDAD_ECONOMICA")
    private Integer economicActivityId;
	@Relation(column = "ID_GRUPO_TARIFARIO")
    private EconomicActivityTariffGroupingDTO tariffGrouping;
    @Column(name = "COD_ACTIVIDAD_CIIU")
    private String economicActivityCode;
    @Column(name = "NOMBRE")
    private String name;
    @Column(name = "DESCRIPCION")
    private String description;
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((economicActivityCode == null) ? 0 : economicActivityCode.hashCode());
		result = prime * result + ((tariffGrouping == null) ? 0 : tariffGrouping.hashCode());
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
		if (!(obj instanceof EconomicActivityDTO))
			return false;
		EconomicActivityDTO other = (EconomicActivityDTO) obj;
		if (economicActivityCode == null) {
			if (other.economicActivityCode != null)
				return false;
		} else if (!economicActivityCode.equals(other.economicActivityCode))
			return false;
		if (tariffGrouping == null) {
			if (other.tariffGrouping != null)
				return false;
		} else if (!tariffGrouping.equals(other.tariffGrouping))
			return false;
		return true;
	}
}
