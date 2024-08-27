package Seminar_2;

import java.time.LocalDate;

import Seminar_2.clients.Animal;
import Seminar_2.clients.impl.Dog;
import Seminar_2.clients.impl.Owner;
import Seminar_2.clients.impl.Rat;

public class Program {
    public static void main(String[] args) {
        Animal dog = new Dog("Bobik", 12, LocalDate.of(2021, 01, 01), new Owner());
        System.out.println(dog);
        Rat rat = new Rat();
        rat.sound();
    }
}
