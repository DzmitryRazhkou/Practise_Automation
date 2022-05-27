package Interfaces_Polymorphism;

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(7.5);
        Shape s1 = new Circle(7.35);
        Rectangle r1 = new Rectangle(4.25, 0.75);
        Shape s2 = new Rectangle(3.95, 9.15);
        Square sq1 = new Square(7);
        Shape s3 = new Square(9);

        Shape[] shapes = {s1, s2, s3};
        for (Shape shape : shapes) {
            shape.draw();
            getInfoData(shape);

        }
    }

    public static void getInfoData(Shape xx) {
        System.out.println("\nPerimeter " +xx.getPerimeter()+ "\nArea " +xx.getArea());

    }


}

