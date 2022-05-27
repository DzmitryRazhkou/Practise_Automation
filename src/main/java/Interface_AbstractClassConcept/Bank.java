package Interface_AbstractClassConcept;

public abstract class Bank {

    public abstract void loan();

//    abstract method ____ no method body

//    Partial Abstraction
//    Hiding the Implementation logic - is called abstraction.
//    Abs class can have abs methods and non-abs methods
//    Can not create an object of abstract class

    public void credit(){
        System.out.println("Bank --- Credit");
    }

    public void debit(){
        System.out.println("Bank --- Debit");
    }

}
