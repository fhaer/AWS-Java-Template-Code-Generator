package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.forderungvse.*;
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
public abstract class FinanzwesenVS_Abs extends VorgangsService implements FinanzwesenVS {
	
	/**
	 * @generated
	 */
	@EJB
	protected ForderungVSe forderungVSe;
	
	/**
	 * @generated
	 */
	@EJB
	protected RechnungVSe rechnungVSe;
	
	/**
	 * @generated
	 */
	protected FinanzwesenVS_MDB messageDrivenBean;
	
	
	/**
	 * @generated
	 */
	public void meldeForderung(Forderung _forderung) {
		startActivity("meldeForderung");
		forderungVSe.meldeForderung(_forderung);
		stopActivity("meldeForderung");
		this.erstelleRechnung(_forderung);
	}
	
	/**
	 * @generated
	 */
	public void erstelleRechnung(Forderung _forderung) {
		startActivity("erstelleRechnung");
		rechnungVSe.erstelleRechnung(_forderung);
		stopActivity("erstelleRechnung");
	}
	
	
}
