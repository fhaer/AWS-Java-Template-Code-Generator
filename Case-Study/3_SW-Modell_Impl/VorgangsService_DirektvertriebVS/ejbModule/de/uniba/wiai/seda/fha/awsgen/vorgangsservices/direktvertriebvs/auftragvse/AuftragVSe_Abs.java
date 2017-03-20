package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.auftragvse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.webshopbestellungvse.*;
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
	protected Bestellung bestellung;
	
	
	/**
	 * @generated
	 */
	public void auftragErstellen(Bestellung _bestellung) {
	}
	
	
}
