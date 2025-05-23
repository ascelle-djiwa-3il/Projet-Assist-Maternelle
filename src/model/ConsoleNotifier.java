package model;

public class ConsoleNotifier implements ObservateurBilan {
	@Override
	public void notifier(Bilan bilan) {
	    System.out.println("[NOTIF] Nouveau bilan enregistré pour " 
	        + bilan.getEnfant().getNomComplet() 
	        + " - Montant : " + bilan.getMontant() + " €");
	}
}