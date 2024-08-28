package Seminar_2.HW;

import Seminar_2.HW.Clients.Animal;
import Seminar_2.HW.Clients.Dog;
import Seminar_2.HW.Clients.Duck;
import Seminar_2.HW.Clients.Snake;
import Seminar_2.HW.Clients.Bird.isBeak;
import Seminar_2.HW.Clients.Bird.isTail;
import Seminar_2.HW.Clients.Bird.isWings;
import Seminar_2.HW.Staff.Doctor;
import Seminar_2.HW.Staff.Employee;

import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        VeterinaryClinic vet = new VeterinaryClinic();
        Animal dog = new Dog();
        dog.name = "Besya";
        Animal duck = new Duck(isWings.YES, isBeak.YES, isTail.YES);
        duck.name = "Vika";
        Animal snake = new Snake();
        snake.name = "Piton";

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(duck);
        animals.add(snake);

        vet.getFlying(animals);
        vet.getCrowing(animals);
        vet.getGoing(animals);
        vet.getSwiming(animals);

        Employee doc = new Doctor("Coledge", "Aspirant", "Surgeon");
        doc.sex = "male";
        doc.experience = 10;
        doc.age = 45;
        doc.firstName = "Boris";
        doc.lastName = "Britva";
        doc.phoneNumber = "+375(29)1234567";

        System.out.println(doc);

    }
}
