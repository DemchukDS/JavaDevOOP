package Seminar_3.HW;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Medicine implements Iterator<MedComponent>{
    private List<MedComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    protected Medicine addComponent(MedComponent component) {
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < components.size(); // = return components.iterator().hasNext;
    }

    @Override
    public MedComponent next() {
        // return components.iterator().next();
        return components.get(index++);
    }
}
