package com.nabildaden.javacourse.car;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class CarServiceTest {
    private final int INITIAL_SIZE = 10;

    @Test
    public void shouldDemonstrateLogging() {
        CarService carService = new CarService();
        carService.process("BMW");
    }

    @Test
    public void shouldDemonstrateInterface() {
        CarService carService = new CarService();
        carService.drive();

       // Byte b = Byte.valueOf((byte)120);
    }

    @Test
    public void shouldDemonstrateClone() {
        Audi audi = new Audi("Nabil");
        Audi otherAudi = audi.clone();
        otherAudi.ownerName = "someone";
        System.out.println(otherAudi.ownerName);
        System.out.println(audi.ownerName);
        assertNotSame(audi, otherAudi);
    }

    @Test
    public void shouldDemonstrateEqualsHashCode() {
        Vehicule vehicule = new Vehicule(new Matricule(), new Couleur("FFFFFF"), new Moteur("x1", 100), new Constructeur("renault"), 4);
        Vehicule vehicule1 = new Vehicule(new Matricule(), new Couleur("FFFF0F"), new Moteur("x1", 100), new Constructeur("renault"), 4);
        Vehicule vehicule2 = new Vehicule(new Matricule(), new Couleur("FFFFFF"), new Moteur("x1", 100), new Constructeur("renault"), 4);

        System.out.println(vehicule.hashCode());
        System.out.println(vehicule1.hashCode());
        System.out.println(vehicule2.hashCode());

        System.out.println(vehicule.equals(vehicule1));
        System.out.println(vehicule1.equals(vehicule1));
        System.out.println(vehicule2.equals(vehicule));

        assertTrue(vehicule.hashCode() != 0);

    }

    @Test
    public void shouldDemonstrateCollections(){
        Collection<String> example = new ArrayList<>(INITIAL_SIZE);
        example.add("D");
        example.add("A");
        example.add("D");
        example.add("E");
        example.add("N");
        example.add("A");
        System.out.println(example);
    }
}
