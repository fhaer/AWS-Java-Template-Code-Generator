package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.auslieferungsanweisungvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.auslieferungsbestaetigungvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class AuslieferungVS_Abs extends VorgangsService implements AuslieferungVS {
	
	/**
	 * @generated
	 */
	@EJB
	protected AuslieferungsanweisungVSe auslieferungsanweisungVSe;
	
	/**
	 * @generated
	 */
	@EJB
	protected AuslieferungsbestaetigungVSe auslieferungsbestaetigungVSe;
	
	/**
	 * @generated
	 */
	protected AuslieferungVS_MDB messageDrivenBean;
	
	
	/**
	 * @generated
	 */
	public void auslieferungBeauftragen(Lieferung _lieferung) {
		startActivity("auslieferungBeauftragen");
		auslieferungsanweisungVSe.auslieferungBeauftragen(_lieferung);
		stopActivity("auslieferungBeauftragen");
		this.ausliefernBestaetigen(_lieferung);
	}
	
	/**
	 * @generated
	 */
	public void ausliefernBestaetigen(Lieferung _lieferung) {
		startActivity("ausliefernBestaetigen");
		auslieferungsbestaetigungVSe.ausliefernBestaetigen(_lieferung);
		stopActivity("ausliefernBestaetigen");
		messageDrivenBean.sendMessage("AuftragsabwicklungVS_Queue", _lieferung);
	}
	
	
}
