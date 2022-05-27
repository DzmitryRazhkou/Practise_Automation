package Interfaces_Polymorphism;

public class Square extends Rectangle{
    public Square(int side){
        super(side, side);
    }

    @Override
    public void draw(){
        System.out.println("I'm drawing a square with side " +this.length);
    }
}
