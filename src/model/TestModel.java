package model;

import java.time.LocalDate;
import java.time.LocalTime;
import model.*; // ou importe tes classes une à une si pas dans un seul package

public class TestModel {

	

	    public static void main(String[] args) {

	        // Création d’un parent
	        Parent parent1 = new Parent(1, "Dupont Sophie", "dupont.sophie@email.com", "06.00.00.00.00", "43 Rue de Sainte Anne");

	        // Création d’un enfant
	        Enfant enfant1 = new Enfant(1, "Dupont", "Lucas", LocalDate.of(2020, 5, 10), 1);

	        // Création d’un contrat
	        Contrat contrat1 = new Contrat(1,"2023-01-01","2025-01-01",25.0, 5, "EC",parent1, enfant1);

	        // Création d’un jour de garde
	        JourGarde jour1 = new JourGarde(1, enfant1, "2025-05-20", "08:30:00", "17:00:00");

	        // Création d’un récap mensuel
	        Bilan recap1 = new Bilan(1,"mai", 188.5, 100, 1999.1, 22);

	        // Ajouter un jour de garde au récap
	        recap1.ajouterJour(jour1);

	        // Affichage pour vérification
	        System.out.println("---- INFOS PARENT ----");
	        System.out.println(parent1);

	        System.out.println("\n---- INFOS ENFANT ----");
	        System.out.println(enfant1);

	        System.out.println("\n---- INFOS CONTRAT ----");
	        System.out.println(contrat1);

	        /*System.out.println("\n---- JOUR DE GARDE ----");
	        System.out.println(jour1);

	        System.out.println("\n---- RÉCAP MENSUEL ----");
	        System.out.println(recap1);*/

	        // Exemple de calcul (si tu as déjà codé une méthode pour ça)
	        // System.out.println("Total heures travaillées : " + recap1.calculerHeuresTotal());
	    
	}


}
