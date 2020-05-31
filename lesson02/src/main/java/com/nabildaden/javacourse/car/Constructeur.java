package com.nabildaden.javacourse.car;

import java.util.Objects;

public class Constructeur {
    private String nom;

    public Constructeur(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constructeur that = (Constructeur) o;
        return Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
