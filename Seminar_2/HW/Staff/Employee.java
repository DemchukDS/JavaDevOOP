package Seminar_2.HW.Staff;

public abstract class Employee {
    public double age;
    public int experience;
    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String sex;

    public Employee(double age, int experience, String firstName, String lastName, String phoneNumber, String sex) {
        this.age = age;
        this.experience = experience;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public Employee() {
        this(0, 0, "Default_name", "Default_Lastname", null, null);
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("%s %s, sex: %s, phone: %s", firstName, lastName, sex, phoneNumber);
    }
}
