package com.nabildaden.javacourse.zoo;

import static org.junit.Assert.*;
import org.junit.Test;

public class ZooTest {
    @Test
    public void shouldFeedAllAnimals() {
        Zoo zooService = new Zoo();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Animal dog3 = new Dog();

        Animal[] animals = { dog1, dog2, dog3 };
        zooService.feedAnimals(animals);
    }

    @Test
    public void shouldTestEqualsAndHashCode() {
        String monNom = "Nabil";
        assertTrue("Nabil".equals(monNom));

        Dog myDog = new Dog();
        Dog myDog2 = new Dog();

        assertTrue(myDog == myDog2);
        assertTrue(myDog.equals(myDog2));

    }
}
