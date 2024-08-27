package Seminar_2.clients.impl;

import java.time.LocalDate;

import Seminar_2.clients.Animal;
import Seminar_2.clients.Flyable;
import Seminar_2.clients.Swimable;

public class Dug extends Animal implements Flyable, Swimable{

    public Dug(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Dug() {
        super();
    }

    @Override
    public void eat() {

    }

    @Override
    public double fly() {
        return 2;
    }

    @Override
    public boolean isSwim() {
        return true;
    }
    
}
