package Function_1;

public class Weather {
    public static void main(String[] args) {
        Weather("Los Angles",72);
        Weather("Philadelphia",75);
        Weather("Boston",69);

    }

    public static void Weather(String city, int temp){
        System.out.println(" in " +city+ " temperature is " +temp+ " F.");

    }
}
