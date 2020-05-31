package com.nabildaden.javacourse.car;

import java.util.Objects;

public class Couleur {
    private String code;

    public Couleur(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Couleur couleur = (Couleur) o;
        return Objects.equals(code, couleur.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
