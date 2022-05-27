package Inheritance;

import javax.security.auth.Subject;

public class Teacher extends Author{
    protected String subject;

    public Teacher(String name, String lastName, int year, String subject) {
        super(name, lastName, year);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

