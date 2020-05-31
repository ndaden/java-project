package com.nabildaden.javacourse.car;

import java.util.Objects;

public class Moteur {
    private String marque;
    private int puissance;

    public Moteur(String marque, int puissance) {
        this.marque = marque;
        this.puissance = puissance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moteur moteur = (Moteur) o;
        return puissance == moteur.puissance &&
                Objects.equals(marque, moteur.marque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marque, puissance);
    }
}
