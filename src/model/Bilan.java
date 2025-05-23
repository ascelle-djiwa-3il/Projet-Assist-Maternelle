package model;

import java.util.ArrayList;
import java.util.List;

//--- Classe Bilan.java ---
public class Bilan {
    private int idBilan;
    private String mois;
    private double totalHeures;
    private int totalRepas;
    private double montant;
    private Enfant enfant;
    private StrategieCalcul strategie;

    public Bilan(int idBilan, String mois, double totalHeures, int totalRepas, Enfant enfant, StrategieCalcul strategie) {
        this.idBilan = idBilan;
        this.mois = mois;
        this.totalHeures = totalHeures;
        this.totalRepas = totalRepas;
        this.enfant = enfant;
        this.strategie = strategie;
        this.montant = strategie.calculerMontant(totalHeures, totalRepas);
    }

    public double getMontant() {
        return montant;
    }

    public double getTotalHeures() {
        return totalHeures;
    }

    public int getTotalRepas() {
        return totalRepas;
    }

    public Enfant getEnfant() {
        return enfant;
    }

    @Override
    public String toString() {
        return "Bilan [" + mois + "] - " + enfant.getNomComplet() + ": " + totalHeures + "h, " + totalRepas + " repas, " + montant + " €";
    }
}
