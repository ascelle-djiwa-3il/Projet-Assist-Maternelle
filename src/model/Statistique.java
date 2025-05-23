package model;

import java.util.*;

public class Statistique {
    private static Statistique instance;
    private List<Bilan> bilans;
    private Set<Enfant> enfants;

    private Statistique() {
        bilans = new ArrayList<>();
        enfants = new HashSet<>();
    }

    public static Statistique getInstance() {
        if (instance == null) {
            instance = new Statistique();
        }
        return instance;
    }

    public void ajouterBilan(Bilan bilan) {
        bilans.add(bilan);
        enfants.add(bilan.getEnfant());
    }

    public void afficherStatistiques() {
        System.out.println("\n=== STATISTIQUES GLOBALES ===");
        System.out.println("Nombre de bilans : " + bilans.size());
        System.out.println("Nombre d'enfants gardés : " + enfants.size());
        System.out.println("Total heures travaillées : " + getHeuresTotales());
        System.out.println("Total repas : " + getTotalRepas());
        System.out.println("Revenu total : " + getRevenuTotal() + " €");
        System.out.println("Revenu moyen par bilan : " + getRevenuMoyen() + " €");
    }

    private double getRevenuTotal() {
        return bilans.stream().mapToDouble(Bilan::getMontant).sum();
    }

    private double getHeuresTotales() {
        return bilans.stream().mapToDouble(Bilan::getTotalHeures).sum();
    }

    private int getTotalRepas() {
        return bilans.stream().mapToInt(Bilan::getTotalRepas).sum();
    }

    private double getRevenuMoyen() {
        return bilans.isEmpty() ? 0 : getRevenuTotal() / bilans.size();
    }
}
