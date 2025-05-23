package model;

public class StrategieStandard implements StrategieCalcul {
    private double tauxHoraire;
    private double prixRepas;

    public StrategieStandard(double tauxHoraire, double prixRepas) {
        this.tauxHoraire = tauxHoraire;
        this.prixRepas = prixRepas;
    }

    @Override
    public double calculerMontant(double heures, int nbRepas) {
        return (heures * tauxHoraire) + (nbRepas * prixRepas);
    }
}