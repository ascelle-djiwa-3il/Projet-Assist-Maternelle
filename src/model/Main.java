package model;

public class Main {
    public static void main(String[] args) {
    	
    	Parent parent = Parent.creerParent();
        System.out.println("Parent créé : " + parent);
        
        Enfant e1 = new Enfant(1, "Martin", "Léo", "2019-03-22");
        StrategieCalcul strategie = new StrategieStandard(7.0, 3); // 7 €/h, 3 €/repas

        Bilan b1 = new Bilan(1, "Avril 2025", 160, 20, e1, strategie);
        Bilan b2 = new Bilan(2, "Mai 2025", 150, 18, e1, strategie);

        Statistique stats = Statistique.getInstance();
        stats.ajouterBilan(b1);
        stats.ajouterBilan(b2);

        System.out.println(e1);
        System.out.println(b1);
        System.out.println(b2);
        stats.afficherStatistiques();
    }
}
