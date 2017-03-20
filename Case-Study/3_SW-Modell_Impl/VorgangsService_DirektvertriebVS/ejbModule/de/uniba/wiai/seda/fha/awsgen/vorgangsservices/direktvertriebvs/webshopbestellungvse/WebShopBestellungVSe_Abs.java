package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.webshopbestellungvse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.auftragvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class WebShopBestellungVSe_Abs extends VorgangsService implements WebShopBestellungVSe {
	
	/**
	 * @generated
	 */
	@EJB
	protected AuftragES auftragES;
	
	/**
	 * @generated
	 */
	@EJB
	protected KundeES kundeES;
	
	/**
	 * @generated
	 */
	protected Kunde kunde;
	
	/**
	 * @generated
	 */
	protected ECarPreisverzeichnis eCarPreisverzeichnis;
	
	
	/**
	 * @generated
	 */
	public void bestellungAnnehmen(Kunde _kunde) {
	}
	
	
}
