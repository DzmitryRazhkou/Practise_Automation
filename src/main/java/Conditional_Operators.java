public class Conditional_Operators {
    public static void main(String[] args) {

//        Booze

        int age = 20;

        if (age >= 21) {
            System.out.println("Here is your booze");
        } else {
            System.out.println("Go fuck yourself");
        }


        //    Simple

        if (20 > 18) {
            System.out.println("20 is greater 18");
        }

        int x = 18;
        int y = 15;
        if (x < y) {
            System.out.println("Shit");
        } else {
            System.out.println("Oh");
        }

        int Time = 5;
        if (Time < 6) {
            System.out.println("Oh No");
        } else {
            System.out.println("It's ok");
        }

        int Var = 20;
        String res = (Var < 25) ? "Fuck" : "Normal";
        System.out.println(res);


        int zip = 19121;
        if (zip >= 1000) {
            System.out.println("East Coast");
        } else if (zip >= 3000 || zip <= 90000) {
            System.out.println("Middle");
        } else if (zip > 90000 || zip < 91500) {
            System.out.println("X");
        } else {
            System.out.println("West Coast");
        }

        boolean x1 = 35 >= 40;
        System.out.println("x1 = " + x1);

        boolean x2 = 35 != 40;
        System.out.println("x2 = " + x2);

        boolean x3 = 35 != 40 || 74 == 90;
        System.out.println("x3 = " + x3);

        boolean allowed = 20>=21;
        if(allowed){
            System.out.println("Yeah");
        }
        else{
            System.out.println("Oh");
        }

    }


}







