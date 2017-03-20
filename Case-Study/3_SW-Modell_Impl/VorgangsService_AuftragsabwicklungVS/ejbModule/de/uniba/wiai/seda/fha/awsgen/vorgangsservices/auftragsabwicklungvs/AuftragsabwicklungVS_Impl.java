package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.forderungerstellenvse.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungproduktionvse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.individualisierungkundevse.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.vorgangsservices.auftragsabwicklungvs.auslieferungvse.*;
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
@Stateful
public class AuftragsabwicklungVS_Impl extends AuftragsabwicklungVS_Abs implements AuftragsabwicklungVS {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public AuftragsabwicklungVS_Impl() {}  // default Konstruktor
	
	@Override
	public void individualisierungAnnehmen(Individualisierung _individualisierung) {
		super.individualisierungAnnehmen( _individualisierung);
	}
	
	@Override
	public void auslieferungErfolgt(Lieferung _lieferung) {
		super.auslieferungErfolgt( _lieferung);
	}
	
	@Override
	public void individualisierungBearbeiten(Individualisierung _individualisierung) {
		super.individualisierungBearbeiten( _individualisierung);
	}
	
	@Override
	public void auslieferungAnweisen(Individualisierung _individualisierung) {
		super.auslieferungAnweisen( _individualisierung);
	}
	
	@Override
	public void forderungErstellen(Lieferung _lieferung) {
		super.forderungErstellen( _lieferung);
	}
	
}
