package Lesson5.Practicums;

import java.util.ArrayList;

public class Klas {
    private final String klasCode;
    private final ArrayList<Leerling> deLeerlingen;

    public Klas(String kC) {
        this.klasCode = kC;
        this.deLeerlingen = new ArrayList<>();
    }

    public void voegLeerlingToe(Leerling l) {
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double newCijfer) {
        for (Leerling leerling : deLeerlingen) {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(newCijfer);
                return;
            }
        }
        System.out.println("Leerling " + nm + " niet gevonden.");
    }

    public ArrayList<Leerling> getLeerlingen() {
        return deLeerlingen;
    }

    public int aantalLeerlingen() {
        return deLeerlingen.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("In klas ").append(klasCode).append(" zitten de volgende leerlingen:\n");
        for (Leerling leerling : deLeerlingen) {
            sb.append(leerling).append("\n");
        }
        return sb.toString();
    }
}
