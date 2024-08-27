package Seminar_2.clients.impl;

import java.time.LocalDate;

import Seminar_2.clients.Animal;
import Seminar_2.clients.Swimable;

public class Cat extends Animal implements Swimable{

    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Cat() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Nyam-nyam");
    }

    @Override
    public boolean isSwim() {
        return true;
    }
}
