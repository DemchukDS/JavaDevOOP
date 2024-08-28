package Seminar_2.HW.Staff;

public class Nurse extends Employee {
    protected String education;
    protected Doctor manager;
    protected String category;


    public Nurse(String education, Doctor manager, String category) {
        this.education = education;
        this.manager = manager;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s, Title: %s %s", firstName, lastName, getType(), category);
    }
}
