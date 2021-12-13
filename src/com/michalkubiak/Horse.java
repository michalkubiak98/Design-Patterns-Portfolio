package com.michalkubiak;

public class Horse implements Animal {

    int age;

    public Horse() {
        this.age = 0;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAge() {
        return "The horse has " + age + " years old.";
    }
}