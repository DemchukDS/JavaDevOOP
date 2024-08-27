package Seminar_2.clients;

import java.time.LocalDate;

public class Dog extends Animals{
    
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public Dog() {
        super();
    }
    @Override
    public void fly() {
        System.out.println("The dog can't fly!");
    }
}
