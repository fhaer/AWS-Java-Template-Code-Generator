package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten;

import java.io.*;
import javax.persistence.*;

/**
 * Repraesentiert die Entitaet RechnungZahlung
 *
 * @generated
 */
@Entity
public class RechnungZahlung implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @generated
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iD;
	
	/**
	 * @generated
	 */
	private Integer forderungID;
	
	/**
	 * @generated
	 */
	private Long zeitstempel;
	
	/**
	 * @generated
	 */
	private Integer betrag;
	
	/**
	 * @generated
	 */
	private Boolean bezahlungErfolgt;
	
	
	/**
	 * @generated
	 */
	public Integer getID() {
		Integer _returnValue = null;
		_returnValue = this.iD;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Long getZeitstempel() {
		Long _returnValue = null;
		_returnValue = this.zeitstempel;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setZeitstempel(Long _long) {
		this.zeitstempel = _long;
	}
	
	/**
	 * @generated
	 */
	public Integer getForderungID() {
		Integer _returnValue = null;
		_returnValue = this.forderungID;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setForderungID(Integer _integer) {
		this.forderungID = _integer;
	}
	
	/**
	 * @generated
	 */
	public Integer getBetrag() {
		Integer _returnValue = null;
		_returnValue = this.betrag;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setBetrag(Integer _integer) {
		this.betrag = _integer;
	}
	
	/**
	 * @generated
	 */
	public void setBezahlungErfolgt(Boolean _boolean) {
		this.bezahlungErfolgt = _boolean;
	}
	
	/**
	 * @generated
	 */
	public Boolean getBezahlungErfolgt() {
		Boolean _returnValue = null;
		_returnValue = this.bezahlungErfolgt;
		return _returnValue;
	}
	
}
