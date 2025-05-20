package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Contrat {
	
	private int idContrat;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double tauxHoraire;
    private int nbJour;
    private String etat;

    private Parent parent; 
    private Enfant enfants;		//private List<Enfant> enfants;
    
    public Contrat(int idContrat, String dateDebutStr, String dateFinStr, double tauxHoraire, int nbJour, String etat,
			Parent parent, Enfant enfants) {
		
		this.idContrat = idContrat;
		
		setDateDebut(dateDebutStr);
		this.dateDebut = getDateDebut();
		
		setDateFin(dateFinStr);
		this.dateFin = getDateFin();
		
		this.tauxHoraire = tauxHoraire;
		this.nbJour = nbJour;
		this.etat = etat;
		this.parent = parent;
		this.enfants = enfants;
	}

	@Override
	public String toString() {
		return "Affichage du contrat N°"+ idContrat +
				"\n idContrat : " + idContrat +
				"\n Date de début : " + dateDebut + 
				"\n Date de fin : " + dateFin + 
				"\n Parent : " + parent+ 
				"\n Enfant : " + enfants +
				"\n Nombre de jours : " + nbJour + 
				"\n Taux horaire : " + tauxHoraire + 
				"\n Etat : " + etat;
	}
	
	public Contrat () {
		this.idContrat = -1;
		this.dateDebut = null;
		this.dateFin = null;
		this.etat = null;
		this.nbJour = 0;
		this.tauxHoraire = 0.0;
		this.parent = null;
		this.enfants = null;
	}



	public int getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebutStr) {
		try {
            this.dateDebut = LocalDate.parse(dateDebutStr);
        } catch (DateTimeParseException e) {
            System.out.println("Format invalide ! Utilisez le format HH:mm:ss, ex : 08:30:00");
            this.dateDebut = null;
        }
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFinStr) {
		try {
            this.dateDebut = LocalDate.parse(dateFinStr);
          //Vérifier que l'heure de fin soit supérieur à la date de début
            if (this.dateFin.isBefore(this.dateDebut)) {
                System.out.println("Erreur : la date de fin ne peut pas être avant la date de début.");
                this.dateFin = null;
                //this.dateDebut = null;
            }
        } catch (DateTimeParseException e) {
            System.out.println("Format invalide ! Utilisez le format HH:mm:ss, ex : 08:30:00");
            this.dateFin = null;
        }
	}

	public double getTauxHoraire() {
		return tauxHoraire;
	}

	public void setTauxHoraire(double tauxHoraire) {
		this.tauxHoraire = tauxHoraire;
	}

	public int getNbJour() {
		return nbJour;
	}

	public void setNbJour(int nbJour) {
		this.nbJour = nbJour;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Enfant getEnfants() {
		return enfants;
	}

	public void setEnfants(Enfant enfants) {
		this.enfants = enfants;
	}
	
}
