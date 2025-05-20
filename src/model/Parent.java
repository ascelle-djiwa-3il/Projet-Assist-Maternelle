package model;

import java.util.ArrayList;
import java.util.List;

public class Parent {
	
	private int idParent;
    private String nomParent;
    private String email;
    private String telephone;
    private String adresse;

    private List<Enfant> enfants = new ArrayList<>();
    private List<Contrat> contrats = new ArrayList<>();
    
    public Parent(int idParent, String nomParent, String email, String telephone, String adresse) {
		super();
		this.idParent = idParent;
		this.nomParent = nomParent;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
	}

    @Override
	public String toString() {
		return "Affichage du parent " + idParent + 
				"\n Id : " + idParent +
				"\n Nom : " + nomParent + 
				"\n Email : " + email + 
				"\n Telephone : " + telephone + 
				"\n adresse : " + adresse + 
				"\n Enfants : " + enfants;
	}
    
    
	
	
}
