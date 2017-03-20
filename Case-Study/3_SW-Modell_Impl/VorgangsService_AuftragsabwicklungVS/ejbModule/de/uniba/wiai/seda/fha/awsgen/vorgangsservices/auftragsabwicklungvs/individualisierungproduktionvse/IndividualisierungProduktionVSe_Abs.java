package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungproduktionvse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.forderungerstellenvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungkundevse.*;
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
public abstract class IndividualisierungProduktionVSe_Abs extends VorgangsService implements IndividualisierungProduktionVSe {
	
	/**
	 * @generated
	 */
	protected Individualisierung individualisierung;
	
	
	/**
	 * @generated
	 */
	public void individualisierungBearbeiten(Individualisierung _individualisierung) {
	}
	
	
}
