package com.nabildaden.javacourse.zoo;

public abstract class Animal {
    public abstract void eat();

    protected int age() {
        System.out.println("the age is calculated...");
        return 0;
    }
}
