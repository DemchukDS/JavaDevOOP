package Lecture_1.task_1;

public class oop_jd_l1_task1 {
    public static void main(String[] args) {
        Point2D a = new Point2D(3, 2);
        Point2D b = new Point2D();
        System.out.println(distance(a, b));
        System.out.println(a);
        System.out.println(b);
        a.setX(12);
        b.setY(3);
        System.out.println(a);
        System.out.println(b);
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}