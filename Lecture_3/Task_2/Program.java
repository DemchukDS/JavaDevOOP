package Lecture_3.Task_2;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Boris", "Britva", 45, 1000);
        Iterator<String> components = worker1;
        while (components.hasNext()) {
            System.out.println(worker1.next());
        }
    }
}
