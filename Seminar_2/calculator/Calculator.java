package Seminar_2.calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    Map<String, Calculable> map = new HashMap<>();
    public Calculator() {
        fill();
    }

    private void fill() {
        map.put("+", new Addition());
        map.put("-", (args) -> args[0] - args[1]);
        map.put("*", (args) -> args[0] * args[1]);
        map.put("/", (args) -> args[0] / args[1]);
        // Calculable calculable = (operator, b) -> map.get(operator).calculate(operator, args[0], args[1]);
        // Calculable calculable = new Calculable() {
        //     @Override
        //     public double calculate(double... args) {
        //         return 0;
        //     }
        };

    public double calculate(String operator, int a, int b) {
        return map.get(operator).calculate(a, b);
    }
}
