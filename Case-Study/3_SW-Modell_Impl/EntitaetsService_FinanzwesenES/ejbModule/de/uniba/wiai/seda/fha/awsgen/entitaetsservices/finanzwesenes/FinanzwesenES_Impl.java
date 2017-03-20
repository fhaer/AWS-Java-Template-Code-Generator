package de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes;
import javax.ejb.*;

import de.uniba.wiai.seda.fha.awsgen.*;
import de.uniba.wiai.seda.fha.awsgen.entitaetsservices.finanzwesenes.entitaeten.*;
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
public class FinanzwesenES_Impl extends FinanzwesenES_Abs implements FinanzwesenES {
	
	// Attribute werden von der abstrakten Superklasse geerbt

	public FinanzwesenES_Impl() {}  // default Konstruktor
	
	@Override
	public Forderung createForderung() {
		return super.createForderung();			
	}
	
	@Override
	public Forderung readForderung(Integer _iD) {
		return super.readForderung( _iD);			
	}
	
	@Override
	public void updateForderung(Forderung _forderung) {
		super.updateForderung( _forderung);
	}
	
	@Override
	public RechnungZahlung createRechnungZahlung() {
		return super.createRechnungZahlung();			
	}
	
	@Override
	public RechnungZahlung readRechnungZahlung(Integer _iD) {
		return super.readRechnungZahlung( _iD);			
	}
	
	@Override
	public void updateRechnungZahlung(RechnungZahlung _rechnungZahlung) {
		super.updateRechnungZahlung( _rechnungZahlung);
	}
	
}
