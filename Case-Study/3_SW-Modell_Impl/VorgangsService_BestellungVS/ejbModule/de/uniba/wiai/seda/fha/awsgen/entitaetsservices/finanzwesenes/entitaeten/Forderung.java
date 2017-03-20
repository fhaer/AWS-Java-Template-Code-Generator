package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten;

import java.io.*;
import javax.persistence.*;

/**
 * Repraesentiert die Entitaet Forderung
 *
 * @generated
 */
@Entity
public class Forderung implements Serializable {
	
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
	private Integer auslieferungID;
	
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
	public Integer getAuslieferungID() {
		Integer _returnValue = null;
		_returnValue = this.auslieferungID;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setAuslieferungID(Integer _integer) {
		this.auslieferungID = _integer;
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
	
}
