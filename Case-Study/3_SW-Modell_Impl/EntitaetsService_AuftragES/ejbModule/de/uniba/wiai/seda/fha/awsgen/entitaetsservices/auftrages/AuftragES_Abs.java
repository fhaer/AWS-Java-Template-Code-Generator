package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages;

import javax.ejb.*;
import javax.persistence.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class AuftragES_Abs extends EntitaetsService implements AuftragES {
	
	
	/**
	 * @generated
	 */
	public Bestellung createBestellung() {
		Bestellung _returnValue = null;
		_returnValue = super.create(new Bestellung());
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Bestellung readBestellung(Integer _iD) {
		Bestellung _returnValue = null;
		_returnValue = super.read(Bestellung.class, _iD);
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void updateBestellung(Bestellung _bestellung) {
		Bestellung _entity = _bestellung;
		super.update(_entity);
	}
	
	/**
	 * @generated
	 */
	public Produktionsauftrag createProduktionsauftrag() {
		Produktionsauftrag _returnValue = null;
		_returnValue = super.create(new Produktionsauftrag());
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Produktionsauftrag readProduktionsauftrag(Integer _iD) {
		Produktionsauftrag _returnValue = null;
		_returnValue = super.read(Produktionsauftrag.class, _iD);
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void updateProduktionsauftrag(Produktionsauftrag _produktionsauftrag) {
		Produktionsauftrag _entity = _produktionsauftrag;
		super.update(_entity);
	}
	
	/**
	 * @generated
	 */
	public Individualisierung createIndividualisierung() {
		Individualisierung _returnValue = null;
		_returnValue = super.create(new Individualisierung());
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Individualisierung readIndividualisierung(Integer _iD) {
		Individualisierung _returnValue = null;
		_returnValue = super.read(Individualisierung.class, _iD);
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void updateIndividualisierung(Individualisierung _individualisierung) {
		Individualisierung _entity = _individualisierung;
		super.update(_entity);
	}
	
	/**
	 * @generated
	 */
	public ECarPreisverzeichnis readECarPreisverzeichnis() {
		ECarPreisverzeichnis _returnValue = null;
		_returnValue = super.read(ECarPreisverzeichnis.class, 0);
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void updateECarPreisverzeichnis(ECarPreisverzeichnis _eCarPreisverzeichnis) {
		ECarPreisverzeichnis _entity = _eCarPreisverzeichnis;
		super.update(_entity);
	}
	
	
}
