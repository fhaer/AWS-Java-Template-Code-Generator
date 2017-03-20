package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.forderungvse;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.rechnungvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class ForderungVSe_Abs extends VorgangsService implements ForderungVSe {
	
	/**
	 * @generated
	 */
	@EJB
	protected FinanzwesenES finanzwesenES;
	
	/**
	 * @generated
	 */
	protected Forderung forderung;
	
	
	/**
	 * @generated
	 */
	public void meldeForderung(Forderung _forderung) {
	}
	
	
}
