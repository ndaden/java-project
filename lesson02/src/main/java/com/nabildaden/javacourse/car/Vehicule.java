package com.nabildaden.javacourse.car;

public class Vehicule {
    private Matricule matricule;
    private Couleur couleur;
    private Moteur moteur;
    private Constructeur constructeur;
    private int NombreDeRoues;

    public Vehicule(Matricule matricule, Couleur couleur, Moteur moteur, Constructeur constructeur, int nbrRoues) {
        this.matricule = matricule;
        this.couleur = couleur;
        this.moteur = moteur;
        this.constructeur = constructeur;
        this.NombreDeRoues = nbrRoues;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Vehicule other = (Vehicule)obj;

        if(!other.constructeur.equals(constructeur)) {
            return false;
        }

        if(!other.couleur.equals(couleur)) {
            return false;
        }

        if(!other.moteur.equals(moteur)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + constructeur.hashCode();
        result = 31 * result + couleur.hashCode();
        result = 31 * result + moteur.hashCode();
        return result;
    }


}
