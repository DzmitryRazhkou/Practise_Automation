package Inheritance;

public class Student extends Author {
    private String major;

    public Student(String name, String lastName, int year, String major) {
        super(name, lastName, year);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}



