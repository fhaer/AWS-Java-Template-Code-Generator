package de.uniba.wiai.seda.fha.awsgen.vorgangsservices;

import javax.ejb.Remote;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;

/**
 * @generated
 */
@Remote
public interface AuftragsabwicklungVS {
	
	/**
	 * @generated
	 */
	public void individualisierungAnnehmen(Individualisierung _individualisierung);
	
	/**
	 * @generated
	 */
	public void auslieferungErfolgt(Lieferung _lieferung);
	
}
