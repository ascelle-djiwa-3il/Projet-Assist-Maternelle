package model;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireBilan {
    private List<ObservateurBilan> observateurs = new ArrayList<>();

    public void ajouterObservateur(ObservateurBilan obs) {
        observateurs.add(obs);
    }

    public void supprimerObservateur(ObservateurBilan obs) {
        observateurs.remove(obs);
    }

    public void creerBilan(Bilan bilan) {
        // Enregistrer le bilan
        Statistique.getInstance().ajouterBilan(bilan);
        
        // Notifier les observateurs
        for (ObservateurBilan obs : observateurs) {
            obs.notifier(bilan);
        }
    }
}
