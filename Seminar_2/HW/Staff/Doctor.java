package Seminar_2.HW.Staff;

public class Doctor extends Employee{
    protected String education;
    protected String scientificDegree;
    protected String specialty;

    public Doctor(
        String education, 
        String scientificDegree, 
        String specialty, 
        double age, 
        int experience, 
        String firstName, 
        String lastName, 
        String phoneNumber, 
        String sex
    ) {
        this.education = education;
        this.scientificDegree = scientificDegree;
        this.specialty = specialty;
        this.age = age;
        this.experience = experience;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format(
            "Name: %s %s, Title: %s %s, Scientific: %s", 
            firstName, lastName, getType(), specialty, scientificDegree
        );
    }
}
