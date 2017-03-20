package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten;

import java.io.*;
import javax.persistence.*;

/**
 * Repraesentiert die Entitaet Individualisierung
 *
 * @generated
 */
@Entity
public class Individualisierung implements Serializable {
	
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
	private Integer produktionsauftragID;
	
	/**
	 * @generated
	 */
	private Long zeitstempel;
	
	/**
	 * @generated
	 */
	private String individualteile;
	
	
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
	public Integer getProduktionsauftragID() {
		Integer _returnValue = null;
		_returnValue = this.produktionsauftragID;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setProduktionsauftragID(Integer _integer) {
		this.produktionsauftragID = _integer;
	}
	
	/**
	 * @generated
	 */
	public void setIndividualteile(String _string) {
		this.individualteile = _string;
	}
	
	/**
	 * @generated
	 */
	public String getIndividualteile() {
		String _returnValue = null;
		_returnValue = this.individualteile;
		return _returnValue;
	}
	
}
