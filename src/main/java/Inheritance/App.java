package Inheritance;

public class App {
    public static void main(String[] args) {

        Author Edward = new Author("Edward","Wilson",1989);
        Teacher Mr_Jones = new Teacher("Tom","Jones",1978, "Physic");
        PartTime_Teacher Dr_Alien = new PartTime_Teacher("John","Lesson",1967,"Math","Monday-Wednesday-Friday");
        System.out.println(Mr_Jones.getLastName());
        System.out.println(Dr_Alien);

    }
}
