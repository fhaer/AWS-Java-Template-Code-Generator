package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes;

import javax.ejb.*;
import javax.persistence.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class FinanzwesenES_Abs extends EntitaetsService implements FinanzwesenES {
	
	
	/**
	 * @generated
	 */
	public Forderung createForderung() {
		Forderung _returnValue = null;
		_returnValue = super.create(new Forderung());
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Forderung readForderung(Integer _iD) {
		Forderung _returnValue = null;
		_returnValue = super.read(Forderung.class, _iD);
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void updateForderung(Forderung _forderung) {
		Forderung _entity = _forderung;
		super.update(_entity);
	}
	
	/**
	 * @generated
	 */
	public RechnungZahlung createRechnungZahlung() {
		RechnungZahlung _returnValue = null;
		_returnValue = super.create(new RechnungZahlung());
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public RechnungZahlung readRechnungZahlung(Integer _iD) {
		RechnungZahlung _returnValue = null;
		_returnValue = super.read(RechnungZahlung.class, _iD);
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void updateRechnungZahlung(RechnungZahlung _rechnungZahlung) {
		RechnungZahlung _entity = _rechnungZahlung;
		super.update(_entity);
	}
	
	
}
