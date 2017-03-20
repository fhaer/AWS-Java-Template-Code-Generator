package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.auslieferungsanweisungvse;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auslieferungvs.auslieferungsbestaetigungvse.*;
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
public class AuslieferungsanweisungVSe_Impl extends AuslieferungsanweisungVSe_Abs implements AuslieferungsanweisungVSe {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public AuslieferungsanweisungVSe_Impl() {}  // default Konstruktor
	
	@Override
	public void auslieferungBeauftragen(Lieferung _lieferung) {
		super.auslieferungBeauftragen( _lieferung);
	}
	
}
