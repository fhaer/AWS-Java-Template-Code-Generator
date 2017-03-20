package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.auftragvse;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.direktvertriebvs.*;
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
@Stateless
public class AuftragVSe_Impl extends AuftragVSe_Abs implements AuftragVSe {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public AuftragVSe_Impl() {}  // default Konstruktor
	
	@Override
	public void auftragErstellen(Bestellung _bestellung) {
		super.auftragErstellen( _bestellung);
	}
	
}
