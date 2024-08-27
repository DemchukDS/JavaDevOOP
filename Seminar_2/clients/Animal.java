package Seminar_2.clients;

import java.time.LocalDate;

import Seminar_2.clients.impl.Owner;

public abstract class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
    public Animal() {
        this("Default_name", 100, LocalDate.now(), new Owner());
    }

    public abstract void eat();

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("Animal's name: %s\nAnimal's weight: %s\nAnimal's date of birth: %s\nAnimal's owner: %s", name, weight, age, owner);
    }
}
