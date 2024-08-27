package Seminar_2.calculator;

public class Addition implements Calculable{

    @Override
    public double calculate(double... args) {
        if (args.length < 2) {
            throw new RuntimeException("Not enougth arguments!");
        }
        return args[0] + args[1];
    }
}
