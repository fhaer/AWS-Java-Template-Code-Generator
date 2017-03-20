package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten;

import java.io.*;
import javax.persistence.*;

/**
 * Repraesentiert die Entitaet Bestellung
 *
 * @generated
 */
@Entity
public class Bestellung implements Serializable {
	
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
	private Integer kundeID;
	
	/**
	 * @generated
	 */
	private Long zeitstempel;
	
	
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
	public Integer getKundeID() {
		Integer _returnValue = null;
		_returnValue = this.kundeID;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setKundeID(Integer _integer) {
		this.kundeID = _integer;
	}
	
}
