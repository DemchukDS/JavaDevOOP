package Seminar_1.task_1.clients;

import java.time.LocalDate;

public class Cat extends Animals{

    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public Cat() {
        super();
    }
}
