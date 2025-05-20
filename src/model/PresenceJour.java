package model;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class PresenceJour {
	private Enfant enfant;
    private LocalTime heureArrivee;
    private LocalTime heureDepart;
    private JourGarde jour;
    
    
	public PresenceJour(Enfant enfant, String heureArrivee, String heureDepart) {
		super();
		this.enfant = enfant;
		
		setHeureArrivee(heureArrivee);
		this.heureArrivee = getHeureArrivee();
		
		setHeureDepart(heureDepart);
		this.heureDepart = getHeureDepart();
	}
	
	public void setHeureArrivee(String heureArriveeStr) {
		try {
            this.heureArrivee = LocalTime.parse(heureArriveeStr);
        } catch (DateTimeParseException e) {
            System.out.println("Format invalide ! Utilisez le format HH:mm:ss, ex : 08:30:00");
            this.heureArrivee = null;
        }
	}
	
	public LocalTime getHeureArrivee() {
		return heureArrivee;
	}
	
	public LocalTime getHeureDepart() {
		return heureDepart;
	}
	
	public void setHeureDepart(String heureDepartStr) {
		try {
            this.heureDepart = LocalTime.parse(heureDepartStr);
            
            //Vérifier que l'heure de départ soit supérieur à l'heure d'arrivée
            if (this.heureDepart.isBefore(this.heureArrivee)) {
                System.out.println("Erreur : l'heure de départ ne peut pas être avant l'heure d'arrivée.");
                this.heureDepart = null;
            }
        } catch (DateTimeParseException e) {
            System.out.println("Format invalide ! Utilisez le format HH:mm:ss, ex : 08:30:00");
            this.heureDepart = null;
        }
	}
      
    
}
