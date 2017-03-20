package de.uniba.wiai.seda.fha.awsgen.entitaetsservices;

import javax.ejb.Remote;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten.*;

/**
 * @generated
 */
@Remote
public interface FinanzwesenES {
	
	/**
	 * @generated
	 */
	public Forderung createForderung();
	
	/**
	 * @generated
	 */
	public Forderung readForderung(Integer _iD);
	
	/**
	 * @generated
	 */
	public void updateForderung(Forderung _forderung);
	
	/**
	 * @generated
	 */
	public RechnungZahlung createRechnungZahlung();
	
	/**
	 * @generated
	 */
	public RechnungZahlung readRechnungZahlung(Integer _iD);
	
	/**
	 * @generated
	 */
	public void updateRechnungZahlung(RechnungZahlung _rechnungZahlung);
	
}
