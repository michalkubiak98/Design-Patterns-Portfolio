package com.michalkubiak;

public class Main {

    public static void main(String[] args) {

        AnimalFactory animalsFactory = new AnimalFactory();

        Animal animal = animalsFactory.getAnimal("rabbit");
        animal.setAge(2);

        Animal animal2 = animalsFactory.getAnimal("horse");
        animal2.setAge(4);

        System.out.println(animal.getAge());
        System.out.println(animal2.getAge());
    }

}

