package Inheritance;

public class Author {
    protected String name;
    protected String lastName;
    protected int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;

    }
}
