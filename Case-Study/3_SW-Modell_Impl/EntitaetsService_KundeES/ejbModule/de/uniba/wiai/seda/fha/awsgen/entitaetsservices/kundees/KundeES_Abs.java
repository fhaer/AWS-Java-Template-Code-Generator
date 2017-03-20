package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees;

import javax.ejb.*;
import javax.persistence.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class KundeES_Abs extends EntitaetsService implements KundeES {
	
	
	/**
	 * @generated
	 */
	public Kunde createKunde() {
		Kunde _returnValue = null;
		_returnValue = super.create(new Kunde());
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Kunde readKunde(Integer _iD) {
		Kunde _returnValue = null;
		_returnValue = super.read(Kunde.class, _iD);
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void updateKunde(Kunde _kunde) {
		Kunde _entity = _kunde;
		super.update(_entity);
	}
	
	/**
	 * @generated
	 */
	public void deleteKunde(Kunde _kunde) {
		Kunde _entity = _kunde;
		super.delete(_entity);
	}
	
	
}
