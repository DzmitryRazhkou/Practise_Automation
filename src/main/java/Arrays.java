public class Arrays {
    public static void main(String[] args) {

        int[]average_TemperatureInHouston = {72, 80, 82, 85};
        System.out.println("September 1th - " +average_TemperatureInHouston[0]+ " F.");
        System.out.println("September 5th - " +average_TemperatureInHouston[2]+ " F.");
        System.out.println(average_TemperatureInHouston.length);

        average_TemperatureInHouston[0]=50;
        System.out.println(average_TemperatureInHouston[0]);

        String[]cars={"Opel", "Cadi","Chevy","Tesla"};
        System.out.println(cars.length);
        System.out.println(cars[cars.length-1]);

        boolean[]xy = {true,false};
        System.out.println(xy[0]);


        }
    }
