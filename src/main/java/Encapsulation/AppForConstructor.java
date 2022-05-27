package Encapsulation;

public class AppForConstructor {
    public static void main(String[] args) {
        Person_Construction karina = new Person_Construction("Karina","Gomez",1995);
        Person_Construction Edward = new Person_Construction();
        Person_Construction Anny = new Person_Construction("Anny","Jason");
        karina.printData();
    }

}
