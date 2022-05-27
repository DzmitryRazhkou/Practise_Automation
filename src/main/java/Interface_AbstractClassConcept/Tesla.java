package Interface_AbstractClassConcept;

public class Tesla implements Car{
    @Override
    public void start() {
        System.out.println("Tesla --- start");
    }

    @Override
    public void stop() {
        System.out.println("Tesla --- stop");
    }

    @Override
    public void refuel() {
        System.out.println("Tesla --- charge");
    }

//    Non-overriding methods
    public void selfDrive(){
        System.out.println("Autopilot mode");
    }
}
