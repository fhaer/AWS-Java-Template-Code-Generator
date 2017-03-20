package de.uniba.wiai.seda.fha.awsgen.vorgangsservices.produktionvs;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auftrages.entitaeten.*;
import de.uniba.wiai.seda.fha.awsgen.*;
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
public class ProduktionVS_Impl extends ProduktionVS_Abs implements ProduktionVS {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public ProduktionVS_Impl() {}  // default Konstruktor
	
	@Override
	public void erteileProduktionsauftrag(Produktionsauftrag _produktionsauftrag) {
		super.erteileProduktionsauftrag( _produktionsauftrag);
	}
	
	@Override
	public void indivigualisierungBeauftragen(Individualisierung _individualisierung) {
		super.indivigualisierungBeauftragen( _individualisierung);
	}
	
}
