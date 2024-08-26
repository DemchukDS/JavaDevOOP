package Seminar_1.task_1.clients;

import java.time.LocalDate;

public class Animals {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public String getType() {
        return getClass().getSimpleName();
    }

    public Animals(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }
    public Animals() {
        this("Default_name", 100, LocalDate.now(), new Owner());
    }

    public void lifeCycle() {
        wakeUp(20);
        eat();
        play();
        sleep();
    }
    private void sleep() {
        System.out.println(getType() + "" + " sleep");
    }
    private void wakeUp() {
        System.out.println(getType() + "" + " wake up");
    }
    private void wakeUp(int time) {
        System.out.println(getType() + "" + " wake up in " + time);
    }
    private void eat() {
        System.out.println(getType() + "" + " eat");
    }
    private void play() {
        System.out.println(getType() + "" + " play");
    }
    public void toGo() {
        System.out.println("going ...");
    }
    public void fly() {
        System.out.println("flying ...");
    }
    public void swim() {
        System.out.println("swimming ...");
    }

    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }
    public LocalDate getAge() {
        return age;
    }
    public Owner getOwner() {
        return owner;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Animal's name: %s\nAnimal's weight: %s\nAnimal's date of birth: %s\nAnimal's owner: %s", name, weight, age, owner);
    }
}
