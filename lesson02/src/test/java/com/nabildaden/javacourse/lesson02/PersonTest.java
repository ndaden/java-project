package com.nabildaden.javacourse.lesson02;

import com.nabildaden.javacourse.lesson10.LoggingLevel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    static final String[] MY_STATE_VALUES = { "PENDING", "PROCESSING", "PROCESSED" };

    @Test
    public void shouldReturnHelloWorld() {
        Person nabil = new Person();
        assertEquals("hello world", nabil.helloWorld());
    }

    @Test
    public void shouldReturnHelloNabil() {
        Person person = new Person();
        assertEquals("Hello Nabil", person.hello("Nabil"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();

        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void DemonstrateArrays() {
        Person[] personnes = new Person[10];
        personnes[0] = new Person();

        //boucle foreach
        for (Person person: personnes) {
            System.out.println(person);
        }

        // tableau dynamiquement alloué
        Person[] personnes2 = { personnes[0], personnes[2] };

        System.out.println(personnes2.length);

        LoggingLevel state = LoggingLevel.ERROR;
        if(state.code() == 0){
            // do something
        }

    }

    @Test
    public void DemonstrateEnums() {
        LoggingLevel state = LoggingLevel.INFO;

        switch (state) {
            case INFO:
            case DEBUG:
            case ERROR:
                // call a method
                break;
            default:
                // throw an error
        }
    }
}
