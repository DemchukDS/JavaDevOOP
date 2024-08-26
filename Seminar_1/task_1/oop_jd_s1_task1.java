package Seminar_1.task_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Seminar_1.task_1.clients.Animals;
import Seminar_1.task_1.clients.Cat;
import Seminar_1.task_1.clients.Dog;
import Seminar_1.task_1.clients.Owner;

public class oop_jd_s1_task1 {
    public static void main(String[] args) {
        Dog lexi = new Dog("Lexi", (float)16.1, LocalDate.of(2019, 8, 12), new Owner());
        Cat barsiq = new Cat("Barsik", (float)6, LocalDate.of(2012, 12, 6), new Owner());
        Animals test = new Cat();
        System.out.println(lexi.getWeight());

        lexi.lifeCycle();

        List<Animals> animals = new ArrayList<>();
        animals.add(lexi);
        animals.add(barsiq);
        animals.add(test);

        System.out.println(animals);
    }
}
