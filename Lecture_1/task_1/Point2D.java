package Lecture_1.task_1;

public class Point2D {
    private int x, y;

    /**
     * Заведение переменных через конструктор Point2D
     * @param valueX Координата X точки
     * @param valueY Координата Y точки
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    /**
     * Заведение переменных через конструктор Point2D
     * @param value При вводе 1 значения координаты X и Y примут одно значение
     */
    public Point2D(int value) {
        this(value, value);
    }
    /**
     * Заведение переменных через конструктор Point2D. При заведение пустой переменной по дефолту будет заводиться значение 0
     */
    public Point2D() {
        this(0);
    }
    /**
     * Выводит значение Х. В классе Point2D значение имеет тип private
     * @return 
     */
    public int getX() {
        return x;
    }
    /**
     * Выводит значение Х. В классе Point2D значение имеет тип private
     * @return 
     */
    public int getY() {
        return y;
    }
    /**
     * Меняет значение переменной Х
     * @param value
     */
    public void setX(int value) {
        this.x = value;
    }
    /**
     * Меняет значение переменной Y
     * @param value
     */
    public void setY(int value) {
        this.y = value;
    }

    @Override
    public String toString() {
        return String.format("x: %d; y: %d", x, y);
    }
}
