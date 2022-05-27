package Interface_AbstractClassConcept;

public interface Car {
//    Only final and static vars
    final int wheels = 4;

//    Always define only abstract methods
//    No methods body (We are not going to define any business logic inside the interface. Interface means simple prototype
//    blueprint yu are defining a particular class without any implementation logic
//    Only method Declaration
//    We achieve 100% of Abstraction
//    Can not create the object of interface

    public void start();
    public void stop();
    public void refuel();

}
