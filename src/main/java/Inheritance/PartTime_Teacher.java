package Inheritance;

public class PartTime_Teacher extends Teacher{
    private String schedule;

    public PartTime_Teacher(String name, String lastName, int year, String subject, String schedule) {
        super(name, lastName, year, subject);
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "\nName: " +name+ "\nLast Name: " +lastName+
                "\nDOB: " +year+
                "\nSchedule: " +schedule+
                "\nSubject: " +subject;
    }
}
