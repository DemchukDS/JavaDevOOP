package Seminar_1.task_1.clients;

import java.time.LocalDate;

public class Rat extends Animals{
    public Rat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public Rat() {
        super();
    }
    @Override
    public void fly() {
        System.out.println("The rat can't fly!");
    }
}
