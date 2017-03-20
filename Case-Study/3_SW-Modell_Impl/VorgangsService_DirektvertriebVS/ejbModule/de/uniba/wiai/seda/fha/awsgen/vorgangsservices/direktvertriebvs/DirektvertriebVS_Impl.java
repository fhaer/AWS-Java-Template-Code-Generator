package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.auftragvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.kundees.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.webshopbestellungvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.*;

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
@Stateful
public class DirektvertriebVS_Impl extends DirektvertriebVS_Abs implements DirektvertriebVS {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public DirektvertriebVS_Impl() {}  // default Konstruktor
	
	@Override
	public void bestellungAnnehmen(Kunde _kunde) {
		super.bestellungAnnehmen( _kunde);
	}
	
	@Override
	public void auftragErstellen(Bestellung _bestellung) {
		super.auftragErstellen( _bestellung);
	}
	
}
