package com.nabildaden.javacourse.car;

public class TestCar {
    private static TestCar _instance;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private TestCar() {
        // default constructor
    }
    public static TestCar Initialize(String name) {
        if(_instance != null) {
            return _instance;
        } else {
            _instance = new TestCar();
            _instance.setName(name);
            return _instance;
        }
    }
}
