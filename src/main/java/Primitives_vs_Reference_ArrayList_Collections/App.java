package Primitives_vs_Reference_ArrayList_Collections;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        a = 10;

//        int, char, boolean - primitive type of data. Create a new part of memory.


        System.out.println("b = " +b+ ".");

        Persona X = new Persona("Dava");
        Persona Y = X;
        X.setName("Dmitry");
        System.out.println(Y.getName());

//      Reference type creates a Reference on memory (Class).
    }
}
