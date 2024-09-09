package Seminar_3.HW;

public abstract class MedComponent implements Comparable<MedComponent>{
    private String name;
    private float weight;
    private int power;

    public MedComponent(String name, float weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }
    public int getPower() {
        return power;
    }

    @Override
    public int compareTo(MedComponent o) {
        return Float.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return String.format("Medicine: %s, Weight: %s, Power: %s", name, weight, power);
    }
}
