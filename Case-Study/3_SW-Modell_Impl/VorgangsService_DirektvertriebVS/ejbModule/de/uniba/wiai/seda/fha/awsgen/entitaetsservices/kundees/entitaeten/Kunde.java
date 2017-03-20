package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees.entitaeten;

import java.io.*;
import javax.persistence.*;

/**
 * Repraesentiert die Entitaet Kunde
 *
 * @generated
 */
@Entity
public class Kunde implements Serializable {
	
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
	private String name;
	
	/**
	 * @generated
	 */
	private String vorname;
	
	/**
	 * @generated
	 */
	private String strasse;
	
	/**
	 * @generated
	 */
	private Integer hausnummer;
	
	/**
	 * @generated
	 */
	private Integer pLZ;
	
	/**
	 * @generated
	 */
	private String ort;
	
	/**
	 * @generated
	 */
	private String email;
	
	/**
	 * @generated
	 */
	private Long telefonnr;
	
	
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
	public String getName() {
		String _returnValue = null;
		_returnValue = this.name;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public String getVorname() {
		String _returnValue = null;
		_returnValue = this.vorname;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public String getStrasse() {
		String _returnValue = null;
		_returnValue = this.strasse;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Integer getHausnummer() {
		Integer _returnValue = null;
		_returnValue = this.hausnummer;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Integer getPLZ() {
		Integer _returnValue = null;
		_returnValue = this.pLZ;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public String getOrt() {
		String _returnValue = null;
		_returnValue = this.ort;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public String getEmail() {
		String _returnValue = null;
		_returnValue = this.email;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Long getTelefonnr() {
		Long _returnValue = null;
		_returnValue = this.telefonnr;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setName(String _string) {
		this.name = _string;
	}
	
	/**
	 * @generated
	 */
	public void setVorname(String _string) {
		this.vorname = _string;
	}
	
	/**
	 * @generated
	 */
	public void setStrasse(String _string) {
		this.strasse = _string;
	}
	
	/**
	 * @generated
	 */
	public void setHausnummer(Integer _integer) {
		this.hausnummer = _integer;
	}
	
	/**
	 * @generated
	 */
	public void setPLZ(Integer _integer) {
		this.pLZ = _integer;
	}
	
	/**
	 * @generated
	 */
	public void setOrt(String _string) {
		this.ort = _string;
	}
	
	/**
	 * @generated
	 */
	public void setEmail(String _string) {
		this.email = _string;
	}
	
	/**
	 * @generated
	 */
	public void setTelefonnr(Long _long) {
		this.telefonnr = _long;
	}
	
}
