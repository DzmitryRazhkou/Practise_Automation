package Classes_Objects;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "McFlay";
        anna.yearOfBirth = 1987;
        System.out.println(anna.lastName);

        Vehicle myCar = new Vehicle();
        myCar.make = "Tesla";
        myCar.model = "Y";
        myCar.year = 2020;
        myCar.color = Colors.RED;
        System.out.println(myCar.make);
        myCar.getInfo();

    }



}
