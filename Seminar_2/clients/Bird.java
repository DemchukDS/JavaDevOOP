package Seminar_2.clients;

import java.time.LocalDate;

public class Bird extends Animals{
    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public Bird() {
        super();
    }
    @Override
    public void swim() {
        System.out.println("The Bird can't swim");
    }
}
