package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class JourGarde {

	private int idJour;
	private LocalDate dateJour;
	private LocalTime heureArrivee;
	private LocalTime heureDepart;
	
	private Enfant E;
	
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
	public LocalTime getHeureArrivee() {
		return heureArrivee;
	}
	public void setHeureArrivee(LocalTime heureArrivee) {
		this.heureArrivee = heureArrivee;
	}
	public LocalTime getHeureDepart() {
		return heureDepart;
	}
	public void setHeureDepart(LocalTime heureDepart) {
		this.heureDepart = heureDepart;
	}
	public JourGarde(int idJour, Enfant E, LocalDate dateJour, LocalTime heureArrivee, LocalTime heureDepart) {
		this.idJour = idJour;
		this.E = E;
		this.dateJour = dateJour;
		this.heureArrivee = heureArrivee;
		this.heureDepart = heureDepart;
	}
	
	
}
