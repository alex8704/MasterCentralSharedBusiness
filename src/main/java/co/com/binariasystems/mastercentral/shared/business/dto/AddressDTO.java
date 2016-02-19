package co.com.binariasystems.mastercentral.shared.business.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.util.ObjectUtils.UpperTransform;

public class AddressDTO implements Serializable {
    private String mainViaType;
    private Integer mainViaNum;
    @UpperTransform
    private String mainViaLetter;
    private String mainViaBis;
    @UpperTransform
    private String mainViaBisLetter;
    private String mainViaQuadrant;
    private String mainViaComplement;
    @UpperTransform
    private String mainViaComplementDetail;
    private Integer secondaryViaNum;
    @UpperTransform
    private String secondaryViaLetter;
    private Integer complementaryViaNum;
    private String complementaryViaQuadrant;
    private String complementaryViaComplement;
    @UpperTransform
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddressDTO [mainViaType=" + mainViaType + ", mainViaNum=" + mainViaNum + ", mainViaLetter=" + mainViaLetter + ", mainViaBis=" + mainViaBis + ", mainViaBisLetter=" + mainViaBisLetter + ", mainViaQuadrant=" + mainViaQuadrant + ", mainViaComplement=" + mainViaComplement + ", mainViaComplementDetail=" + mainViaComplementDetail + ", secondaryViaNum=" + secondaryViaNum + ", secondaryViaLetter=" + secondaryViaLetter + ", complementaryViaNum=" + complementaryViaNum + ", complementaryViaQuadrant=" + complementaryViaQuadrant + ", complementaryViaComplement=" + complementaryViaComplement + ", complementaryViaComplementDetail=" + complementaryViaComplementDetail + "]";
	}
	
	
}
