package Seminar_2.HW.Staff;

public abstract class Employee {
    public double age;
    public int experience;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String sex;

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("%s %s, sex: %s, phone: %s", firstName, lastName, sex, phoneNumber);
    }
}
