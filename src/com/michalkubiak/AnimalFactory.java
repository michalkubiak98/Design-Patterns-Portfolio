package com.michalkubiak;

public class AnimalFactory {

    public Animal getAnimal(String animalType) {

        if(animalType.equals("rabbit")){
            return new Rabbit();

        } else if(animalType.equals("horse")){
            return new Horse();
        }

        return null;

    }

}
