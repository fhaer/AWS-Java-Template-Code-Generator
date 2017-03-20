package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.produktionsauftragvse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.auftragvse.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class ProduktionsauftragVSe_Abs extends VorgangsService implements ProduktionsauftragVSe {
	
	/**
	 * @generated
	 */
	@EJB
	protected AuftragES auftragES;
	
	/**
	 * @generated
	 */
	protected Bestellung bestellung;
	
	/**
	 * @generated
	 */
	protected Produktionsauftrag produktionsauftrag;
	
	
	/**
	 * @generated
	 */
	public void auftragErstellen(Bestellung _bestellung) {
	}
	
	
}
