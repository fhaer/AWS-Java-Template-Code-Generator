package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.rechnungvse;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.forderungvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.finanzwesenvs.*;
import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten.*;
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
public class RechnungVSe_Impl extends RechnungVSe_Abs implements RechnungVSe {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public RechnungVSe_Impl() {}  // default Konstruktor
	
	@Override
	public void erstelleRechnung(Forderung _forderung) {
		super.erstelleRechnung( _forderung);
	}
	
}
