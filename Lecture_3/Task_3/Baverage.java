package Lecture_3.Task_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Baverage implements Iterator<Ingredient> {
    List<Ingredient> componets;
    int index;

    public Baverage() {
        componets = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component) {
        componets.add(component);
    }

    @Override
    public boolean hasNext() {
        return index < componets.size();
    }

    @Override
    public Ingredient next() {
        return componets.get(index++);
    }
}
