package Seminar_2.HW.Clients;

import Seminar_2.HW.Goable;
import Seminar_2.HW.Swimable;

public class Cat extends Animal implements Goable, Swimable {

    boolean paws;
    boolean tail;

    @Override
    public double swim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swim'");
    }

    @Override
    public double go() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'go'");
    }
    
}
