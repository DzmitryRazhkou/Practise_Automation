package Encapsulation;

public class Person {
    private String name;
    private String lastName;
    private int year;

//        All "Set" functions all the time are "void" (there are no returning).
//        If we have type of variable is name (string), we will put into brackets type (String n).

    public void setName(String n) {
        name = n;
    }
//        All "Get" functions all the time are returning (instead void type of returning variable).

    public String getName() {
        return name;
    }

    public void setLastName(String lastname){
        this.lastName = lastname;
    }
    public String getLastName(){
        return lastName;
    }

    public void setYear(int y){
        if(y>2021 || y<1900){
            throw new IllegalArgumentException("Wrong Year");
        }

        year = y;
    }

    public int getYear(){
        return year;
    }

    public void printInfo(){
        System.out.println("\nName: " +name+ "\nLast Name: " +lastName+ "\nYear: " +year);
    }

}

