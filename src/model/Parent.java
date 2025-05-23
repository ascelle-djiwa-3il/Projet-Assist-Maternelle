package model;

import java.util.Scanner;

public class Parent {
    private int idParent;
    private String nomParent;
    private String telephone;
    private String email;
    private String adresse;

    public Parent(int idParent, String nomParent, String telephone, String email, String adresse) {
        this.idParent = idParent;
        this.nomParent = nomParent;
        this.telephone = telephone;
        this.email = email;
        this.adresse = adresse;
    }

    public int getIdParent() {
        return idParent;
    }

    @Override
    public String toString() {
        return "[" + idParent + "] " + nomParent + " | " + telephone + " | " + email + " | " + adresse;
    }

    // 🔽 Nouvelle méthode pour créer un parent via le clavier
    public static Parent creerParent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID du parent : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // vider le buffer

        System.out.print("Nom du parent : ");
        String nom = scanner.nextLine();

        System.out.print("Téléphone : ");
        String tel = scanner.nextLine();

        System.out.print("Email : ");
        String email = scanner.nextLine();

        System.out.print("Adresse : ");
        String adresse = scanner.nextLine();

        return new Parent(id, nom, tel, email, adresse);
    }
}
