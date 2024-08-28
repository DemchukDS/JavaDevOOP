package Seminar_2.HW.Clients;

public abstract class Animal {
    protected double age;
    protected float weight;
    protected String sex;
    protected Owner owner;
    protected boolean vactinations;
    protected String breed;
    public String name;

    public Animal(double age, float weight, String sex, Owner owner, boolean vactinations, String breed, String name) {
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.owner = owner;
        this.vactinations = vactinations;
        this.breed = breed;
        this.name = name;
    }

    public Animal() {
        this(0, 0, "no sex", new Owner(), false, "no breed", "Default_name");
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format(
            "Animal: %s, Name: %s, Sex: %s, Weight: %s, Breed: %s, Age: %s, Vactinatios: %s, Owner: %s", 
            getType(), name, sex, weight, breed, age, vactinations, owner
        );
    }
}
