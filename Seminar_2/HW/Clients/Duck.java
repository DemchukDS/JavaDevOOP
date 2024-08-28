package Seminar_2.HW.Clients;

import Seminar_2.HW.Swimable;

public class Duck extends Bird implements Swimable{

    public Duck(isWings wings, isBeak beak, isTail tail) {
        super(wings, beak, tail);
    }

    @Override
    public double swim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swim'");
    }
}
