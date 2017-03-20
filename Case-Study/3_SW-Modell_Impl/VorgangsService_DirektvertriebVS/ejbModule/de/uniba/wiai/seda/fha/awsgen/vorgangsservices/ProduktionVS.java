package de.uniba.wiai.seda.fha.awsgen.vorgangsservices;

import javax.ejb.Remote;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;

/**
 * @generated
 */
@Remote
public interface ProduktionVS {
	
	/**
	 * @generated
	 */
	public void erteileProduktionsauftrag(Produktionsauftrag _produktionsauftrag);
	
	/**
	 * @generated
	 */
	public void indivigualisierungBeauftragen(Individualisierung _individualisierung);
	
}
