package de.uniba.wiai.seda.fha.awsgen;

import java.util.logging.Logger;

 
/**
 * Basisklasse für Vorgangs-Services auf der Basis von Session Beans. 
 * Stellt Methoden fuer Logging, Starten und Stoppen von Aktivitaeten 
 * zur Verfuegung.
 * 
 * @generated
 */
public abstract class VorgangsService {
	
	/**
	 * loggt ausgeführte Activities
	 */
	private Logger logger = Logger.getLogger("de.uniba.wiai.seda.fha.awsgen.VorgangsService");
	
	/**
	 * Enthält die aktuell ausgeführte Methode
	 */
	private String activity;
	
	/**
	 * Gibt die aktuell ausgeführte Aktivität zurück
	 */
	public String getActivity() {
		return activity;
	}
	
	/**
	 * Setzt die übergebene Aktivität als gestartet
	 * 
	 * @param activity
	 */
	public void startActivity(String activity) {
		this.activity = activity;
		logger.info("Activity gestartet: " + activity);
	}

	/**
	 * Setzt die übergebene Aktivität als gestoppt
	 * 
	 * @param activity
	 */
	public void stopActivity(String activity) {
		this.activity = null;
		logger.info("Activity gestoppt: " + activity);
	}
	
} 
