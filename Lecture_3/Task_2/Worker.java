package Lecture_3.Task_2;

import java.util.Iterator;

public class Worker implements Iterator<String>{
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s , %s years old", firstName, lastName, age);
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("First name: %s", firstName);
            case 2:
                return String.format("Last name: %s", lastName);
            case 3:
                return String.format("Age: %s", age);
            default:
                return String.format("Salary: %s", salary);
        }
    }
}
