package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungproduktionvse;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.forderungerstellenvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungkundevse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.auslieferungvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.*;
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
public class IndividualisierungProduktionVSe_Impl extends IndividualisierungProduktionVSe_Abs implements IndividualisierungProduktionVSe {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public IndividualisierungProduktionVSe_Impl() {}  // default Konstruktor
	
	@Override
	public void individualisierungBearbeiten(Individualisierung _individualisierung) {
		super.individualisierungBearbeiten( _individualisierung);
	}
	
}
