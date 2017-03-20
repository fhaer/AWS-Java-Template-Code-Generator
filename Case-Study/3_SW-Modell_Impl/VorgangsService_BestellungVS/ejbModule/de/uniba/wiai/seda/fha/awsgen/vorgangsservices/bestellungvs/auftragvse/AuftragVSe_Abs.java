package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.auftragvse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.produktionsauftragvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class AuftragVSe_Abs extends VorgangsService implements AuftragVSe {
	
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
	public void bearbeiteAuftrag(Bestellung _bestellung) {
	}
	
	
}
