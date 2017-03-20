package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.auslieferungvse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.forderungerstellenvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungproduktionvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungkundevse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
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
public abstract class AuslieferungVSe_Abs extends VorgangsService implements AuslieferungVSe {
	
	/**
	 * @generated
	 */
	@EJB
	protected AuslieferungES auslieferungES;
	
	/**
	 * @generated
	 */
	protected Individualisierung individualisierung;
	
	/**
	 * @generated
	 */
	protected Lieferung lieferung;
	
	
	/**
	 * @generated
	 */
	public void auslieferungAnweisen(Individualisierung _individualisierung) {
	}
	
	/**
	 * @generated
	 */
	public void auslieferungErfolgt(Lieferung _lieferung) {
	}
	
	
}
