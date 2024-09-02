package Lecture_3.Task_3;

import java.util.Iterator;

import Lecture_3.Task_3.ingred.Beans;
import Lecture_3.Task_3.ingred.Milk;
import Lecture_3.Task_3.ingred.Water;
import Seminar_2.HW.VeterinaryClinic;
import Seminar_2.HW.Staff.Doctor;

public class Program {
    public static void main(String[] args) {
        Baverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Кофейные зерна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        VeterinaryClinic vet = new VeterinaryClinic();
        vet.addEmployee(new Doctor("Yes", "Est'", "Hirurg", 21, 30, "Vika", "Chirva", "123", "telka"));
        vet.addEmployee(new Doctor("Yes", "Est'", "LOR", 30, 50, "Vlados", "Pisos", "987", "sametc"));

        vet.outputEmployees();

        vet.deleteEmployee("Vlados", "Pisos");
        
        vet.outputEmployees();
    }
}
