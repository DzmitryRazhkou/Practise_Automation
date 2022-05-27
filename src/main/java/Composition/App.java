package Composition;

public class App {
    public static void main(String[] args) {
        Address ronAddress = new Address ("1321 N 15th Street", "Philadelphia", 19121, State.PA);
        Address steveAddress = new Address("2050 Fairfax Ave A", "Cherry Hill", 80003, State.NJ);
        Person_s Ron = new Person_s ("Ron","Frieson",1987, ronAddress);
        Person_s Steve = new Person_s ("Steve","Robinson", 1987,steveAddress);
        System.out.println(ronAddress.getAddress1());

        Engine engine = new Engine("XRS-DRW");
        Liveblock liveblock = new Liveblock("LB25-S");
        Person_s[]crew = {Ron, Steve};
        Shuttle shuttle = new Shuttle(engine, liveblock, crew);
        String Street_Address_Ron = shuttle.crew[0].getAddress().getAddress1();
        String Street_Address_Steve = shuttle.crew[1].getAddress().getCity();
        System.out.println(Street_Address_Steve);
        System.out.println(Street_Address_Ron);


//        Drums

        Kick kick = new Kick("Tama Rockstar", "22x10");
        Snare snare = new Snare("Dw Collector", "14x6,5", "Oak");

        Cymbals hi_hat = new Cymbals("Zildjian A","12 in");
        Cymbals crash = new Cymbals("Paiste 2000","18 in");
        Cymbals ride = new Cymbals("Sabian HH", "21 in");

        Cymbals[] cymbals = {hi_hat, crash, ride};
        Drum_Set myDrums = new Drum_Set(kick, Toms.Top, snare, cymbals);
        String myHH = myDrums.getCymbals()[0].getBrand();
        System.out.println(myHH);
        
    }
}
