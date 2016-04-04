/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.binariasystems.mastercentral.shared.business.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

/**
 *
 * @author Alexander
 */
@Embeddable
public class MatAddress implements Serializable {
    
    @Size(max = 15)
    @Column(name = "COD_TIPO_VIA_PPAL")
    private String mainViaType;
    @Max(value=999)
    @Column(name = "NUMERO_VIA_PPAL")
    private Integer mainViaNum;
    @Size(max = 3)
    @Column(name = "LETRAS_VIA_PPAL")
    private String mainViaLetter;
    @Size(max = 3)
    @Column(name = "BIS")
    private String mainViaBis;
    @Size(max = 3)
    @Column(name = "LETRAS_BIS")
    private String mainViaBisLetter;
    @Size(max = 10)
    @Column(name = "CUADRANTE_VIA_PPAL")
    private String mainViaQuadrant;
    @Size(max = 15)
    @Column(name = "COD_COMPLEM_VIA_PPAL")
    private String mainViaComplement;
    @Size(max = 40)
    @Column(name = "DETAL_COMPLEM_VIA_PPAL")
    private String mainViaComplementDetail;
    @Max(value=999)
    @Column(name = "NUMERO_VIA_SECUND")
    private Integer secondaryViaNum;
    @Size(max = 3)
    @Column(name = "LETRAS_VIA_SECUND")
    private String secondaryViaLetter;
    @Max(value=999)
    @Column(name = "NUMERO_VIA_COMPLEM")
    private Integer complementaryViaNum;
    @Size(max = 10)
    @Column(name = "CUADRANTE_VIA_COMPLEM")
    private String complementaryViaQuadrant;
    @Size(max = 15)
    @Column(name = "COD_COMPLEM_VIA_COMPLEM")
    private String complementaryViaComplement;
    @Size(max = 40)
    @Column(name = "DETAL_COMPLEM_VIA_COMPLEM")
    private String complementaryViaComplementDetail;
	/**
	 * @return the mainViaType
	 */
	public String getMainViaType() {
		return mainViaType;
	}
	/**
	 * @param mainViaType the mainViaType to set
	 */
	public void setMainViaType(String mainViaType) {
		this.mainViaType = mainViaType;
	}
	/**
	 * @return the mainViaNum
	 */
	public Integer getMainViaNum() {
		return mainViaNum;
	}
	/**
	 * @param mainViaNum the mainViaNum to set
	 */
	public void setMainViaNum(Integer mainViaNum) {
		this.mainViaNum = mainViaNum;
	}
	/**
	 * @return the mainViaLetter
	 */
	public String getMainViaLetter() {
		return mainViaLetter;
	}
	/**
	 * @param mainViaLetter the mainViaLetter to set
	 */
	public void setMainViaLetter(String mainViaLetter) {
		this.mainViaLetter = mainViaLetter;
	}
	/**
	 * @return the mainViaBis
	 */
	public String getMainViaBis() {
		return mainViaBis;
	}
	/**
	 * @param mainViaBis the mainViaBis to set
	 */
	public void setMainViaBis(String mainViaBis) {
		this.mainViaBis = mainViaBis;
	}
	/**
	 * @return the mainViaBisLetter
	 */
	public String getMainViaBisLetter() {
		return mainViaBisLetter;
	}
	/**
	 * @param mainViaBisLetter the mainViaBisLetter to set
	 */
	public void setMainViaBisLetter(String mainViaBisLetter) {
		this.mainViaBisLetter = mainViaBisLetter;
	}
	/**
	 * @return the mainViaQuadrant
	 */
	public String getMainViaQuadrant() {
		return mainViaQuadrant;
	}
	/**
	 * @param mainViaQuadrant the mainViaQuadrant to set
	 */
	public void setMainViaQuadrant(String mainViaQuadrant) {
		this.mainViaQuadrant = mainViaQuadrant;
	}
	/**
	 * @return the mainViaComplement
	 */
	public String getMainViaComplement() {
		return mainViaComplement;
	}
	/**
	 * @param mainViaComplement the mainViaComplement to set
	 */
	public void setMainViaComplement(String mainViaComplement) {
		this.mainViaComplement = mainViaComplement;
	}
	/**
	 * @return the mainViaComplementDetail
	 */
	public String getMainViaComplementDetail() {
		return mainViaComplementDetail;
	}
	/**
	 * @param mainViaComplementDetail the mainViaComplementDetail to set
	 */
	public void setMainViaComplementDetail(String mainViaComplementDetail) {
		this.mainViaComplementDetail = mainViaComplementDetail;
	}
	/**
	 * @return the secondaryViaNum
	 */
	public Integer getSecondaryViaNum() {
		return secondaryViaNum;
	}
	/**
	 * @param secondaryViaNum the secondaryViaNum to set
	 */
	public void setSecondaryViaNum(Integer secondaryViaNum) {
		this.secondaryViaNum = secondaryViaNum;
	}
	/**
	 * @return the secondaryViaLetter
	 */
	public String getSecondaryViaLetter() {
		return secondaryViaLetter;
	}
	/**
	 * @param secondaryViaLetter the secondaryViaLetter to set
	 */
	public void setSecondaryViaLetter(String secondaryViaLetter) {
		this.secondaryViaLetter = secondaryViaLetter;
	}
	/**
	 * @return the complementaryViaNum
	 */
	public Integer getComplementaryViaNum() {
		return complementaryViaNum;
	}
	/**
	 * @param complementaryViaNum the complementaryViaNum to set
	 */
	public void setComplementaryViaNum(Integer complementaryViaNum) {
		this.complementaryViaNum = complementaryViaNum;
	}
	/**
	 * @return the complementaryViaQuadrant
	 */
	public String getComplementaryViaQuadrant() {
		return complementaryViaQuadrant;
	}
	/**
	 * @param complementaryViaQuadrant the complementaryViaQuadrant to set
	 */
	public void setComplementaryViaQuadrant(String complementaryViaQuadrant) {
		this.complementaryViaQuadrant = complementaryViaQuadrant;
	}
	/**
	 * @return the complementaryViaComplement
	 */
	public String getComplementaryViaComplement() {
		return complementaryViaComplement;
	}
	/**
	 * @param complementaryViaComplement the complementaryViaComplement to set
	 */
	public void setComplementaryViaComplement(String complementaryViaComplement) {
		this.complementaryViaComplement = complementaryViaComplement;
	}
	/**
	 * @return the complementaryViaComplementDetail
	 */
	public String getComplementaryViaComplementDetail() {
		return complementaryViaComplementDetail;
	}
	/**
	 * @param complementaryViaComplementDetail the complementaryViaComplementDetail to set
	 */
	public void setComplementaryViaComplementDetail(String complementaryViaComplementDetail) {
		this.complementaryViaComplementDetail = complementaryViaComplementDetail;
	}
    
    

}
