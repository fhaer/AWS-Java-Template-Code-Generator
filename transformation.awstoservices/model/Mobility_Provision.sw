JavaEEArchitektur: Mobility_Provision

package Vorgangsservices {

	package Buchungsservice {
		BusinessInterface BuchungsserviceI {
				buchung();
				bestaetigung();
		}
		StatefulSessionBean Buchungsservice {
			BuchungBereitstellungServiceI buchungBereitstellungService;
			 
			BuchungService buchungService;
			AnfrageService anfrageService;
			BestaetigungService bestaetigungService;
			
			buchung() {
				buchungService.buchung();
				anfrage();
			}
			anfrage() {
				anfrageService.anfrage();
				buchungBereitstellungService.anfrage();
			}
			bestaetigung() {
				bestaetigungService.bestaetigung();
			}
		}
		
		StatelessSessionBean BuchungService {
			buchung() {
			}
		}
		StatelessSessionBean AnfrageService {
			anfrage() {
			}
		}
		StatelessSessionBean BestaetigungService {
			bestaetigung() {
			}
		}
	}
	
	package Bereitstellungsservice {
		BusinessInterface BereitstellungsserviceI {
				anfrage();
		}
		StatefulSessionBean Bereitstellungsservice {
				BuchungsserviceI buchungsservice;
				
				AnfrageService anfrageService;
				BestaetigungService bestaetigungService;
				
				anfrage() {
					anfrageService.anfrage();
					bestaetigung();
				}
				bestaetigung() {
					bestaetigungService.bestaetigung();
					buchungsservice.bestaetigung();
				}
		}
		
		StatelessSessionBean AnfrageService {
			anfrage() {
			}
		}
		StatelessSessionBean BestaetigungService {
			bestaetigung() {
			}
		}
	}
}

package Entityservices {
	package KundeService {
		JPAEntity Kunde {
			int KundenNr;
			String Name;
			String Adresse;
			getName() { }
			getAdresse() { }
			setName() { }
			setAdresse() { }
		}
		BusinessInterface KundeServiceI {
				createKunde();
				getKunde();
				updateKunde();
		}
		StatelessSessionBean KundeService {
				createKunde() {}
				getKunde() {}
				updateKunde() {}
		}
	}
	package BuchungBereitstellungService {
		BusinessInterface BuchungBereitstellungServiceI {
				createBuchung();
				getBuchung();
				updateBuchung();
				createBereitstellung();
				getBereitstellung();
				updateBereitstellung();
		}
		StatelessSessionBean BuchungBereitstellungService {
				createBuchung() {}
				getBuchung() {}
				updateBuchung() {}
				createBereitstellung() {}
				getBereitstellung() {}
				updateBereitstellung() {}
		}
		JPAEntity Buchung {
				int BuchungNr;
				int KundenNr;
				Date buchungsbeginn;
				Date buchungsende;
				String bereistellungsort;
				String rueckgabeort;
				getKundeNr() {}
				getBuchungsbeginn() {}
				getBuchungsende() {}
				getBereitstellungsort() {}
				getRueckgabeort() {}
				setBuchungsbeginn() {}
				setBuchungsende() {}
				setBereitstellungsort() {}
				setRueckgabeort() {}
		}
		JPAEntity Bereitstellung {
				int BereitstellungNr;
				int BuchungNr;
				boolean BereistellungVorgemerkt;
				boolean BereistellungAusgefuehrt;
				getBereitstellungVorgemerkt() {}
				getBereitstellungAusgefuehrt() {}
				setBereitstellungVorgemerkt() {}
				setBereitstellungAusgefuehrt() {}
		}
	}
}




