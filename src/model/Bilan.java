package model;

import java.util.ArrayList;
import java.util.List;

public class Bilan {
	
	public int idBilan;
	public String mois;
	public double totalHeures;
	public int totalRepas;
	public double montant;
	public int nbreJourGarde;
	private List<JourGarde> joursGarde = new ArrayList<>();
	
	public int getIdBilan() {
		return idBilan;
	}
	public void setIdBilan(int idBilan) {
		this.idBilan = idBilan;
	}
	public String getMois() {
		return mois;
	}
	public void setMois(String mois) {
		this.mois = mois;
	}
	public double getTotalHeures() {
		return totalHeures;
	}
	public void setTotalHeures(float totalHeures) {
		this.totalHeures = totalHeures;
	}
	public int getTotalRepas() {
		return totalRepas;
	}
	public void setTotalRepas(int totalRepas) {
		this.totalRepas = totalRepas;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public int getNbreJourGarde() {
		return nbreJourGarde;
	}
	public void setNbreJourGarde(int nbreJourGarde) {
		this.nbreJourGarde = nbreJourGarde;
	}
	
	public Bilan(int idBilan, String mois, double totalHeures, int totalRepas, double montant, int nbreJourGarde) {
		super();
		this.idBilan = idBilan;
		this.mois = mois;
		this.totalHeures = totalHeures;
		this.totalRepas = totalRepas;
		this.montant = montant;
		this.nbreJourGarde = nbreJourGarde;
		this.joursGarde = new ArrayList<>();
	}
	
	public void ajouterJour(JourGarde J) {
		joursGarde.add(J);
	}
	
}
