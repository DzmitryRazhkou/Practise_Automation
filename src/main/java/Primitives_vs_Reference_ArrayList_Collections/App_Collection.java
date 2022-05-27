package Primitives_vs_Reference_ArrayList_Collections;

import java.util.ArrayList;
import java.util.List;

public class App_Collection {
    public static void main(String[] args) {

//        Its Wrapper around an Array. We use here methods (encapsulation). ArrayList is dynamical and relate to Collection.

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Red");
        System.out.println(colors);
        System.out.println(colors.size());
        colors.set(1,"Yellow");



//        We may catch an element (Red) which we are going to replace on (Black).

        String lost = colors.set(2, "Black");
        System.out.println(lost);

        //        Add on the exact position.

        colors.add(3,"Green");
        System.out.println(colors.get(3));

//        Check availability of z.

        boolean z = colors.contains("Sea");
        System.out.println(z);







        List<String> guitars = new ArrayList<>();

//        Left - interface, which implements ArrayList.

        guitars.add("Fender");
        guitars.add("Gibson");

        Persona x1 = new Persona("Steve");
        Persona x2 = new Persona("Steve");

        if (x1 == x2){
            System.out.println("Shit");

//            There are two different objects.
        }

        }



    }

