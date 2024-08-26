package Lecture_1.task_2;

import java.util.ArrayList;

public class Robot {

    enum State {
        On, Off
    }
    /** Create two static fields */
    private static int defaultIndex;
    private static ArrayList<String> names;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    /** Robot's level */
    private int level;
    /** Robot's name */
    private String name;

    private State state;

    public Robot(String name, int level) {
        if (name.isEmpty() || Character.isDigit(name.charAt(0)) || Robot.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }
        Robot.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }
    public Robot(String name) {
        this(name, 1);
    }
    public Robot() {
        this("");
    }

    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        }
        else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }
    private void powerOff() {
        this.stopBIOS();
        this.stopOS();
        this.sayBye();
    }

    /** Loading BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS ...");
    }
    /** Loading OS */
    private void startOS() {
        System.out.println("Start OS ...");
    }
    /** Greetings */
    private void sayHi() {
        System.out.println("Hello world ...");
    }
    /** Stop BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS ...");
    }
    /** Stop OS */
    private void stopOS() {
        System.out.println("Stop OS ...");
    }
    /** Parting */
    private void sayBye() {
        System.out.println("Bye world ...");
    }
    public void work() {
        if (this.state == State.On) {
            System.out.println("Working ...");
        }
    }
}
