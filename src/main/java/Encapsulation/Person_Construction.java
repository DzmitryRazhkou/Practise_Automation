package Encapsulation;

public class Person_Construction {
    private String name;
    private String lastName;
    private int year;

    public Person_Construction(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        setYear(year);
    }

    public Person_Construction() {
    }

    public Person_Construction(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int y) {
        if (y > 2021 || y < 1900) {
            throw new IllegalArgumentException("Wrong Year");
        }

        year = y;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }
    public void printData(){
        System.out.println("\nName: " +name+ "\nLastName: " +lastName+ "\nYear: " +year);
    }
}
