package com.nabildaden.javacourse.car;

public class Audi implements Car, Loggable, Property, Cloneable {

    public String ownerName;

    public Audi(String owner){
        this.ownerName = owner;
    }

    @Override
    public void drive() {
        System.out.println("Audi driving ...");
    }

    @Override
    public String message() {
        return "I am Audi";
    }

    @Override
    public String owner() {
        return "Nabil";
    }

    @Override
    protected Audi clone() {
        try {
            return (Audi)super.clone();
        } catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
            throw new AssertionError();
        }
    }
}
