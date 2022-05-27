package Encapsulation;

public class App {
    public static void main(String[] args) {
        Person greg = new Person();
        greg.setName("Greg");
        greg.setLastName("McClay");
        System.out.println(greg.getName());

        greg.setYear(1993);
        greg.printInfo();
    }
}
