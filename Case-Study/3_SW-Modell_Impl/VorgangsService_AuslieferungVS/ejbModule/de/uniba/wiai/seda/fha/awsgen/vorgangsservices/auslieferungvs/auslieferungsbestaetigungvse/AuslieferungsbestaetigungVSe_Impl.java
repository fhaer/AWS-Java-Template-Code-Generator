package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.auslieferungsbestaetigungvse;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.auslieferungsanweisungvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.*;
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
public class AuslieferungsbestaetigungVSe_Impl extends AuslieferungsbestaetigungVSe_Abs implements AuslieferungsbestaetigungVSe {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public AuslieferungsbestaetigungVSe_Impl() {}  // default Konstruktor
	
	@Override
	public void ausliefernBestaetigen(Lieferung _lieferung) {
		super.ausliefernBestaetigen( _lieferung);
	}
	
}
