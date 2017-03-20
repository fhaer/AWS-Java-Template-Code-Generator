package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.auslieferungvse;

import javax.ejb.Remote;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;

/**
 * @generated
 */
@Remote
public interface AuslieferungVSe {
	
	/**
	 * @generated
	 */
	public void auslieferungAnweisen(Individualisierung _individualisierung);
	
	/**
	 * @generated
	 */
	public void auslieferungErfolgt(Lieferung _lieferung);
	
}
