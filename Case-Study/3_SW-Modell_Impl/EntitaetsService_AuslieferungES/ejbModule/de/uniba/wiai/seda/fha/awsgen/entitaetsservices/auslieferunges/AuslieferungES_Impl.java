package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.auslieferunges.entitaeten.*;
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
public class AuslieferungES_Impl extends AuslieferungES_Abs implements AuslieferungES {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public AuslieferungES_Impl() {}  // default Konstruktor
	
	@Override
	public Lieferung createLieferung() {
		return super.createLieferung();			
	}
	
	@Override
	public Lieferung readLieferung(Integer _iD) {
		return super.readLieferung( _iD);			
	}
	
	@Override
	public void updateLieferung(Lieferung _lieferung) {
		super.updateLieferung( _lieferung);
	}
	
}
