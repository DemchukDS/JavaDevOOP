package Lecture_3.Task_3;

import java.util.Iterator;

import Lecture_3.Task_3.ingred.Beans;
import Lecture_3.Task_3.ingred.Milk;
import Lecture_3.Task_3.ingred.Water;

public class Program {
    public static void main(String[] args) {
        Baverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Кофейные зерна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
