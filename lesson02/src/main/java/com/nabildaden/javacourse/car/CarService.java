package com.nabildaden.javacourse.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

    public void process(String name) {
        /*
        if(log.isDebugEnabled()) {
            // if debug level is enabled
            log.debug("BEGIN PROCESSING CAR : " + name);
        }
        */

        // lighter way of logging
        log.debug("BEGIN PROCESSING CAR : {}", name);
        CarState carState = CarState.valueOf(name);
    }

    public void drive() {
        Car vw = new Volkswagen();
        Car audi = new Audi("Nabil");

        Car[] cars = { vw, audi };

        for(Car car : cars){
            car.drive();
        }
    }
}
