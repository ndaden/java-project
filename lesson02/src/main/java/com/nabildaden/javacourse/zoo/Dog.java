package com.nabildaden.javacourse.zoo;

import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private int age;
    private String type;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name) &&
                Objects.equals(type, dog.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type);
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating...");
    }
}
