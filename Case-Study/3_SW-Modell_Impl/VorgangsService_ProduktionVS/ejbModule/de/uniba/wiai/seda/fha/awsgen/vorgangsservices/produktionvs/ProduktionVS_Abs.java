package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.produktionvs;

import javax.ejb.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

/**
 * Abstrakte Klasse einer Stateful/Stateless Session Bean. Wird von
 * einer Implementierungsklasse mit entsprechender Annotation erweitert.
 * 
 * @generated
 */
@SuppressWarnings("all")
public abstract class ProduktionVS_Abs extends VorgangsService implements ProduktionVS {
	
	/**
	 * @generated
	 */
	protected ProduktionVS_MDB messageDrivenBean;
	
	
	/**
	 * @generated
	 */
	public void erteileProduktionsauftrag(Produktionsauftrag _produktionsauftrag) {
	}
	
	/**
	 * @generated
	 */
	public void indivigualisierungBeauftragen(Individualisierung _individualisierung) {
	}
	
	
}
