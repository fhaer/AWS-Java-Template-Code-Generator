package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.bestellungvs.auftragvse.*;
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
public abstract class BestellungVS_Abs extends VorgangsService implements BestellungVS {
	
	/**
	 * @generated
	 */
	@EJB
	protected ProduktionsauftragVSe produktionsauftragVSe;
	
	/**
	 * @generated
	 */
	@EJB
	protected AuftragVSe auftragVSe;
	
	/**
	 * @generated
	 */
	protected BestellungVS_MDB messageDrivenBean;
	
	
	/**
	 * @generated
	 */
	public void bearbeiteAuftrag(Bestellung _bestellung) {
		startActivity("bearbeiteAuftrag");
		auftragVSe.bearbeiteAuftrag(_bestellung);
		stopActivity("bearbeiteAuftrag");
		this.auftragErstellen(_bestellung);
	}
	
	/**
	 * @generated
	 */
	public void auftragErstellen(Bestellung _bestellung) {
		startActivity("auftragErstellen");
		produktionsauftragVSe.auftragErstellen(_bestellung);
		stopActivity("auftragErstellen");
		messageDrivenBean.sendMessage("ProduktionVS_Queue", new Produktionsauftrag());
	}
	
	
}
