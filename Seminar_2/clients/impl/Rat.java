package Seminar_2.clients.impl;

import java.time.LocalDate;

import Seminar_2.clients.Animal;
import Seminar_2.clients.Swimable;

public class Rat extends Animal implements Swimable{
    public Rat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Rat() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Hrys-hrys");
    }

    @Override
    public boolean isSwim() {
        return true;
    }
}
