package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.auslieferungsbestaetigungvse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.auslieferungsanweisungvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class AuslieferungsbestaetigungVSe_Abs extends VorgangsService implements AuslieferungsbestaetigungVSe {
	
	/**
	 * @generated
	 */
	protected Lieferung lieferung;
	
	
	/**
	 * @generated
	 */
	public void ausliefernBestaetigen(Lieferung _lieferung) {
	}
	
	
}
