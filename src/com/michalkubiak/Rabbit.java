package com.michalkubiak;

public class Rabbit implements Animal {

    int age;

    public Rabbit() {
        this.age = 0;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAge() {
        return "The rabbit is " + age + " years old.";
    }
}