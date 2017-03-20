package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten;

import java.io.*;
import javax.persistence.*;

/**
 * Repraesentiert die Entitaet ECarPreisverzeichnis
 *
 * @generated
 */
@Entity
public class ECarPreisverzeichnis implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @generated
	 */
	private Integer basispreis;
	
	/**
	 * generierter Primaerschluessel
	 * @generated
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer iD;
	
	/**
	 * @generated
	 */
	public Integer getBasispreis() {
		Integer _returnValue = null;
		_returnValue = this.basispreis;
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void setBasispreis(Integer _integer) {
		this.basispreis = _integer;
	}
	
}
