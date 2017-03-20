package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungkundevse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.forderungerstellenvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungproduktionvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.auslieferungvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.*;
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
public abstract class IndividualisierungKundeVSe_Abs extends VorgangsService implements IndividualisierungKundeVSe {
	
	/**
	 * @generated
	 */
	@EJB
	protected AuftragES auftragES;
	
	/**
	 * @generated
	 */
	protected Individualisierung individualisierung;
	
	
	/**
	 * @generated
	 */
	public void individualisierungAnnehmen(Individualisierung _individualisierung) {
	}
	
	
}
