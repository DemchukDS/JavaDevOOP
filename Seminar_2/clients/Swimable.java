package Seminar_2.clients;

@FunctionalInterface
public interface Swimable {
    boolean isSwim();
    default void sound() {
        System.out.println("Я дефолтный метод");
    }
}
