package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.forderungerstellenvse;

import javax.ejb.Remote;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;

/**
 * @generated
 */
@Remote
public interface ForderungErstellenVSe {
	
	/**
	 * @generated
	 */
	public void forderungErstellen(Lieferung _lieferung);
	
}
