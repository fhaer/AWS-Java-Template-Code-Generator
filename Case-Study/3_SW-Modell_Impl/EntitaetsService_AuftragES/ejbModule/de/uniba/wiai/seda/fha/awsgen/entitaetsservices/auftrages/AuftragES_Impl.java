package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;

/**
 * Stateful/Stateless Session Bean zur Realisierung eines Vorgangs-Service.
 *
 * Implementierungsklasse zur manuellen Erweiterung ("Extension Point"):
 *
 * Die Methoden der Klasse beinhalten keine Funktionalitaet, sondern rufen nur
 * generierten Code auf. Alle Methoden koennen manuell erzaengt oder
 * ueberschrieben werden. Falls Aufrufe auf generierten Code entfernt werden,
 * muss die entsprechende Funktionalitaet manuell implementiert werden.
 * 
 * Diese Klasse wird bei erneuter Generierung nicht ueberschrieben.
 */
@Stateless
public class AuftragES_Impl extends AuftragES_Abs implements AuftragES {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public AuftragES_Impl() {}  // default Konstruktor
	
	@Override
	public Bestellung createBestellung() {
		return super.createBestellung();			
	}
	
	@Override
	public Bestellung readBestellung(Integer _iD) {
		return super.readBestellung( _iD);			
	}
	
	@Override
	public void updateBestellung(Bestellung _bestellung) {
		super.updateBestellung( _bestellung);
	}
	
	@Override
	public Produktionsauftrag createProduktionsauftrag() {
		return super.createProduktionsauftrag();			
	}
	
	@Override
	public Produktionsauftrag readProduktionsauftrag(Integer _iD) {
		return super.readProduktionsauftrag( _iD);			
	}
	
	@Override
	public void updateProduktionsauftrag(Produktionsauftrag _produktionsauftrag) {
		super.updateProduktionsauftrag( _produktionsauftrag);
	}
	
	@Override
	public Individualisierung createIndividualisierung() {
		return super.createIndividualisierung();			
	}
	
	@Override
	public Individualisierung readIndividualisierung(Integer _iD) {
		return super.readIndividualisierung( _iD);			
	}
	
	@Override
	public void updateIndividualisierung(Individualisierung _individualisierung) {
		super.updateIndividualisierung( _individualisierung);
	}
	
	@Override
	public ECarPreisverzeichnis readECarPreisverzeichnis() {
		return super.readECarPreisverzeichnis();			
	}
	
	@Override
	public void updateECarPreisverzeichnis(ECarPreisverzeichnis _eCarPreisverzeichnis) {
		super.updateECarPreisverzeichnis( _eCarPreisverzeichnis);
	}
	
}
