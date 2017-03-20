package de.uniba.wiai.seda.fha.awsgen.entitaetsservices;

import javax.ejb.Remote;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;

/**
 * @generated
 */
@Remote
public interface AuftragES {
	
	/**
	 * @generated
	 */
	public Bestellung createBestellung();
	
	/**
	 * @generated
	 */
	public Bestellung readBestellung(Integer _iD);
	
	/**
	 * @generated
	 */
	public void updateBestellung(Bestellung _bestellung);
	
	/**
	 * @generated
	 */
	public Produktionsauftrag createProduktionsauftrag();
	
	/**
	 * @generated
	 */
	public Produktionsauftrag readProduktionsauftrag(Integer _iD);
	
	/**
	 * @generated
	 */
	public void updateProduktionsauftrag(Produktionsauftrag _produktionsauftrag);
	
	/**
	 * @generated
	 */
	public Individualisierung createIndividualisierung();
	
	/**
	 * @generated
	 */
	public Individualisierung readIndividualisierung(Integer _iD);
	
	/**
	 * @generated
	 */
	public void updateIndividualisierung(Individualisierung _individualisierung);
	
	/**
	 * @generated
	 */
	public ECarPreisverzeichnis readECarPreisverzeichnis();
	
	/**
	 * @generated
	 */
	public void updateECarPreisverzeichnis(ECarPreisverzeichnis _eCarPreisverzeichnis);
	
}
