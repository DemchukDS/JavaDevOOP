package Seminar_2.HW.Staff;

public class Doctor extends Employee{
    protected String education;
    protected String scientificDegree;
    protected String specialty;

    public Doctor(String education, String scientificDegree, String specialty) {
        this.education = education;
        this.scientificDegree = scientificDegree;
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return String.format(
            "Name: %s %s, Title: %s %s, Scientific: %s", 
            firstName, lastName, getType(), specialty, scientificDegree
            );
    }
}
