package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.auftragvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
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
public abstract class DirektvertriebVS_Abs extends VorgangsService implements DirektvertriebVS {
	
	/**
	 * @generated
	 */
	@EJB
	protected WebShopBestellungVSe webShopBestellungVSe;
	
	/**
	 * @generated
	 */
	@EJB
	protected AuftragVSe auftragVSe;
	
	/**
	 * @generated
	 */
	protected DirektvertriebVS_MDB messageDrivenBean;
	
	
	/**
	 * @generated
	 */
	public void bestellungAnnehmen(Kunde _kunde) {
		startActivity("bestellungAnnehmen");
		webShopBestellungVSe.bestellungAnnehmen(_kunde);
		stopActivity("bestellungAnnehmen");
		this.auftragErstellen(new Bestellung());
	}
	
	/**
	 * @generated
	 */
	public void auftragErstellen(Bestellung _bestellung) {
		startActivity("auftragErstellen");
		auftragVSe.auftragErstellen(_bestellung);
		stopActivity("auftragErstellen");
		messageDrivenBean.sendMessage("BestellungVS_Queue", _bestellung);
	}
	
	
}
