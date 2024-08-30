package Lecture_3.Task_3;

public abstract class Ingredient {

    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}
