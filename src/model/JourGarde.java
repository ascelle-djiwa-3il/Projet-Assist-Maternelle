package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JourGarde {
	Scanner scanner = new Scanner(System.in);

	private int idJour;
	private LocalDate dateJour;
	private List<PresenceJour> enfantsPresents;
	
	// Constructeur par défaut
    public JourGarde() {
        this.idJour = 0;
        this.dateJour = null;
        this.enfantsPresents = new ArrayList<>();
    }
	
	public JourGarde(int idJour, Enfant E, String dateJourStr, String heureArriveeStr, String heureDepartStr) {
		this.idJour = idJour;
		this.enfantsPresents = new ArrayList<>();
		
		try {
			this.dateJour = LocalDate.parse(dateJourStr);
		}catch (DateTimeParseException e) {
			System.out.println("Format invalide ! Ecrivez l'heure au format YYYY-MM-DD");
			this.dateJour = null;
		}
          
	}
	
	public int getIdJour() {
		return idJour;
	}
	public void setIdJour(int idJour) {
		this.idJour = idJour;
	}
	public LocalDate getDateJour() {
		return dateJour;
	}
	public void setDateJour(LocalDate dateJour) {
		this.dateJour = dateJour;
	}
	
}
