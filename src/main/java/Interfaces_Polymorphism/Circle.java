package Interfaces_Polymorphism;

public class Circle implements Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;


    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a circle with radius " +this.radius);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius;
    }
}
