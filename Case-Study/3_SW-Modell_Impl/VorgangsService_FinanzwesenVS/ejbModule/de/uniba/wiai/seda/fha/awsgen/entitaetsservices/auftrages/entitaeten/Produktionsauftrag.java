package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten;

import java.io.*;
import javax.persistence.*;

/**
 * Repraesentiert die Entitaet Produktionsauftrag
 *
 * @generated
 */
@Entity
public class Produktionsauftrag implements Serializable {
	
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
	private Integer bestellungID;
	
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
	public Integer getBestellungID() {
		Integer _returnValue = null;
		_returnValue = this.bestellungID;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setBestellungID(Integer _integer) {
		this.bestellungID = _integer;
	}
	
}
