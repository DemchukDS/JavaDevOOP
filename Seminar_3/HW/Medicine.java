package Seminar_3.HW;

import java.util.List;
import java.util.ArrayList;

public class Medicine implements Comparable<Medicine>{
    private List<MedComponent> components;
    private List<Medicine> medicines;
    private float medComponentMaxWeight;
    private String name;

    public Medicine(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.medicines = new ArrayList<>();
    }

    protected Medicine addComponent(MedComponent component) {
        components.add(component);
        this.components.sort(null);
        this.medComponentMaxWeight = this.components.get(0).getWeight();
        return this;
    }

    protected Medicine addMedicine(Medicine medicine) {
        medicines.add(medicine);
        return this;
    }

    @Override
    public int compareTo(Medicine o) {
        return Float.compare(this.medComponentMaxWeight, o.medComponentMaxWeight);
    }
    @Override
    public String toString() {
        return String.format("Medicine: %s, MaxWeith: %s", name, medComponentMaxWeight);
    }
}
