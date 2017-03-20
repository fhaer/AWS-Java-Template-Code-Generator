package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten;

import java.io.*;
import javax.persistence.*;

/**
 * Repraesentiert die Entitaet Lieferung
 *
 * @generated
 */
@Entity
public class Lieferung implements Serializable {
	
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
	private Integer individualisierungID;
	
	/**
	 * @generated
	 */
	private Long zeitstempel;
	
	/**
	 * @generated
	 */
	private Boolean auslieferungErfolgt;
	
	
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
	public Integer getIndividualisierungID() {
		Integer _returnValue = null;
		_returnValue = this.individualisierungID;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setIndividualisierungID(Integer _integer) {
		this.individualisierungID = _integer;
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
	public Boolean getAuslieferungErfolgt() {
		Boolean _returnValue = null;
		_returnValue = this.auslieferungErfolgt;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setAuslieferungErfolgt(Boolean _boolean) {
		this.auslieferungErfolgt = _boolean;
	}
	
}
