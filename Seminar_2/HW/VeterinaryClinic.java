package Seminar_2.HW;

import java.util.List;

import Seminar_2.HW.Clients.Animal;
import Seminar_2.HW.Staff.Doctor;
import Seminar_2.HW.Staff.Employee;

public class VeterinaryClinic {
    public void getFlying(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                System.out.printf("%s %s умеет летать!\n", animal.getType(), animal.name);
            }
        }
    }

    public void getGoing(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Goable) {
                System.out.printf("%s %s умеет ходить!\n", animal.getType(), animal.name);
            }
        }
    }

    public void getSwiming(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                System.out.printf("%s %s умеет плавать!\n", animal.getType(), animal.name);
            }
        }
    }

    public void getCrowing(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Crowlable) {
                System.out.printf("%s %s умеет ползать!\n", animal.getType(), animal.name);
            }
        }
    }

    public void payroll(Employee employee) {
        cash();
    }

    public void bonus(Employee employee) {
        cash();
    }

    private double cash() {
        double money = 100.500;
        return money;
    }
}
