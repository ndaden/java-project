package com.nabildaden.javacourse.car;

public class CarSelector {
    public static void main(String[] arguments) {
        CarService carService = new CarService();
        for (String argument : arguments) {
            if(isValid(argument)){
                carService.process(argument);
            } else {
                System.err.println("Ignoring invalid argument : " + argument);
            }
        }
    }

    private static boolean isValid(String argument) {
        try{
            CarState.valueOf(argument);
        } catch(IllegalArgumentException e) {
            return false;
        } finally {
            // close IO resources for example
        }
        return true;
    }
}
