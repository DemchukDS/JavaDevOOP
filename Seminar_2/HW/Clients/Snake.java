package Seminar_2.HW.Clients;

import Seminar_2.HW.Crowlable;
import Seminar_2.HW.Swimable;

public class Snake extends Animal implements Swimable, Crowlable{

    boolean tail;

    @Override
    public double crowl() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crowl'");
    }

    @Override
    public double swim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swim'");
    }
    public Snake() {
        super();
    }
}
