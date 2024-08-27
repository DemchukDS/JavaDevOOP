package Seminar_2.clients.impl;

import java.time.LocalDate;

import Seminar_2.clients.Animal;
import Seminar_2.clients.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Bird() {
        super();
    }
    
    @Override
    public void eat() {
        System.out.println("Glu-glu");
    }

    @Override
    public double fly() {
        return 4;
    }
}
