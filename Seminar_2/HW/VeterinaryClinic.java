package Seminar_2.HW;

import java.util.List;
import java.util.ArrayList;

import Seminar_2.HW.Clients.Animal;
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

    public List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void outputEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void deleteEmployee(String firstName, String lastName) {
        for (Employee employee : employees) {
            if (employee.firstName == firstName && employee.lastName == lastName) {
                employees.remove(employee);
                break;
            }
        }
    }
}
