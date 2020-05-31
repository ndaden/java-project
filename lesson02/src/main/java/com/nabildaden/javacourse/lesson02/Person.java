package com.nabildaden.javacourse.lesson02;

import com.nabildaden.javacourse.lesson03.Name;

public class Person {

    private Name personName;
    private static int personCounter = 0;

    public Person(Name personName){
        this.personName = personName;
    }

    public Person(){
        personCounter++;
        // empty constructor
    }

    public String helloWorld() {
        return "hello world";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
