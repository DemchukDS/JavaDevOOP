package Seminar_2.HW.Clients;

import Seminar_2.HW.Flyable;
import Seminar_2.HW.Goable;

public class Bird extends Animal implements Goable, Flyable{

    public enum isBeak {
        YES, NO;
    }
    public enum isTail {
        YES, NO;
    }
    public enum isWings {
        YES, NO;
    }
    protected isBeak beak;
    protected isTail tail;
    protected isWings wings;

    @Override
    public double fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    public double go() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'go'");
    }

    public Bird(isWings wings, isBeak beak, isTail tail) {
        this.wings = wings;
        this.beak = beak;
        this.tail = tail;
    }
}
