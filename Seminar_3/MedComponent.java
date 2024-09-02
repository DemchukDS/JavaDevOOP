package Seminar_3;

public abstract class MedComponent {
    private String name;
    private float weight;
    private int power;

    public MedComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName(String name) {
        return name;
    }
    public float getWeight(float weight) {
        return weight;
    }
    public int getPower(int power) {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Medicine: %s\nWeight: %s\nPower: %s\n", name, weight, power);
    }
}
