package de.uniba.wiai.seda.fha.awsgen.entitaetsservices;

import javax.ejb.Remote;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;

/**
 * @generated
 */
@Remote
public interface AuslieferungES {
	
	/**
	 * @generated
	 */
	public Lieferung createLieferung();
	
	/**
	 * @generated
	 */
	public Lieferung readLieferung(Integer _iD);
	
	/**
	 * @generated
	 */
	public void updateLieferung(Lieferung _lieferung);
	
}
