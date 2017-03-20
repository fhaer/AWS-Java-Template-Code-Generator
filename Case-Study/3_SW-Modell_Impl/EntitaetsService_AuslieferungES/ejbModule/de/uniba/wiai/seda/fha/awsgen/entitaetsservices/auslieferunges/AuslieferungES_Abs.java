package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges;

import javax.ejb.*;
import javax.persistence.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class AuslieferungES_Abs extends EntitaetsService implements AuslieferungES {
	
	
	/**
	 * @generated
	 */
	public Lieferung createLieferung() {
		Lieferung _returnValue = null;
		_returnValue = super.create(new Lieferung());
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public Lieferung readLieferung(Integer _iD) {
		Lieferung _returnValue = null;
		_returnValue = super.read(Lieferung.class, _iD);
		return _returnValue;
	}
	
	/**
	 * @generated
	 */
	public void updateLieferung(Lieferung _lieferung) {
		Lieferung _entity = _lieferung;
		super.update(_entity);
	}
	
	
}
