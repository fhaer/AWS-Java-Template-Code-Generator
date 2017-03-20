package de.uniba.wiai.seda.fha.awsgen.entitaetsservices;

import javax.ejb.Remote;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees.entitaeten.*;

/**
 * @generated
 */
@Remote
public interface KundeES {
	
	/**
	 * @generated
	 */
	public Kunde createKunde();
	
	/**
	 * @generated
	 */
	public Kunde readKunde(Integer _iD);
	
	/**
	 * @generated
	 */
	public void updateKunde(Kunde _kunde);
	
	/**
	 * @generated
	 */
	public void deleteKunde(Kunde _kunde);
	
}
