package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Enfant {
    private int idEnfant;
    private String nomEnfant;
    private String prenomEnfant;
    private String dateNaissance;

    public Enfant(int idEnfant, String nomEnfant, String prenomEnfant, String dateNaissance) {
        this.idEnfant = idEnfant;
        this.nomEnfant = nomEnfant;
        this.prenomEnfant = prenomEnfant;
        this.dateNaissance = dateNaissance;
    }

    public int getIdEnfant() {
        return idEnfant;
    }

    public String getNomComplet() {
        return prenomEnfant + " " + nomEnfant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enfant)) return false;
        Enfant enfant = (Enfant) o;
        return idEnfant == enfant.idEnfant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEnfant);
    }

    @Override
    public String toString() {
        return "[" + idEnfant + "] " + getNomComplet() + " - Né le " + dateNaissance;
    }
}
