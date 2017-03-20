package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees.entitaeten.*;
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
public class KundeES_Impl extends KundeES_Abs implements KundeES {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public KundeES_Impl() {}  // default Konstruktor
	
	@Override
	public Kunde createKunde() {
		return super.createKunde();			
	}
	
	@Override
	public Kunde readKunde(Integer _iD) {
		return super.readKunde( _iD);			
	}
	
	@Override
	public void updateKunde(Kunde _kunde) {
		super.updateKunde( _kunde);
	}
	
	@Override
	public void deleteKunde(Kunde _kunde) {
		super.deleteKunde( _kunde);
	}
	
}
