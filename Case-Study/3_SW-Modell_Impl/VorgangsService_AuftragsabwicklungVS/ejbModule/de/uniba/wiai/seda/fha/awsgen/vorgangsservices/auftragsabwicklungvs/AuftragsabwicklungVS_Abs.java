package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.forderungerstellenvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungproduktionvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungkundevse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.auslieferungvse.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class AuftragsabwicklungVS_Abs extends VorgangsService implements AuftragsabwicklungVS {
	
	/**
	 * @generated
	 */
	@EJB
	protected IndividualisierungKundeVSe individualisierungKundeVSe;
	
	/**
	 * @generated
	 */
	@EJB
	protected IndividualisierungProduktionVSe individualisierungProduktionVSe;
	
	/**
	 * @generated
	 */
	@EJB
	protected ForderungErstellenVSe forderungErstellenVSe;
	
	/**
	 * @generated
	 */
	@EJB
	protected AuslieferungVSe auslieferungVSe;
	
	/**
	 * @generated
	 */
	protected AuftragsabwicklungVS_MDB messageDrivenBean;
	
	
	/**
	 * @generated
	 */
	public void individualisierungAnnehmen(Individualisierung _individualisierung) {
		startActivity("individualisierungAnnehmen");
		individualisierungKundeVSe.individualisierungAnnehmen(_individualisierung);
		stopActivity("individualisierungAnnehmen");
		this.individualisierungBearbeiten(_individualisierung);
	}
	
	/**
	 * @generated
	 */
	public void auslieferungErfolgt(Lieferung _lieferung) {
		startActivity("auslieferungErfolgt");
		auslieferungVSe.auslieferungErfolgt(_lieferung);
		stopActivity("auslieferungErfolgt");
		this.forderungErstellen(_lieferung);
	}
	
	/**
	 * @generated
	 */
	public void individualisierungBearbeiten(Individualisierung _individualisierung) {
		startActivity("individualisierungBearbeiten");
		individualisierungProduktionVSe.individualisierungBearbeiten(_individualisierung);
		stopActivity("individualisierungBearbeiten");
		messageDrivenBean.sendMessage("ProduktionVS_Queue", _individualisierung);
		this.auslieferungAnweisen(_individualisierung);
	}
	
	/**
	 * @generated
	 */
	public void auslieferungAnweisen(Individualisierung _individualisierung) {
		startActivity("auslieferungAnweisen");
		auslieferungVSe.auslieferungAnweisen(_individualisierung);
		stopActivity("auslieferungAnweisen");
		messageDrivenBean.sendMessage("AuslieferungVS_Queue", new Lieferung());
	}
	
	/**
	 * @generated
	 */
	public void forderungErstellen(Lieferung _lieferung) {
		startActivity("forderungErstellen");
		forderungErstellenVSe.forderungErstellen(_lieferung);
		stopActivity("forderungErstellen");
		messageDrivenBean.sendMessage("FinanzwesenVS_Queue", new Forderung());
	}
	
	
}
