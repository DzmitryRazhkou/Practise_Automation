public class Loops {
    public static void main(String[] args) {

//        While

        int x = 0;
        while (x < 5) {
            System.out.println(x);
            x++;
        }


//        Do/While

        int y = 0;
        do {
            System.out.println(y);
            y++;
        }
        while (y < 5);

//        Array Loop (for-each)

        String[] cars = {"Lexus", "BMW", "Cadillac", "Tesla"};
        cars[1] = "Chevy";

        for (String z : cars) {
            System.out.println(z);
        }


//        Hello

        for (int i = 1; i <= 4; i = i + 1) {
            System.out.println("Hello");
            System.out.println("Today is a beautiful day");
            System.out.println("Nice to meet you");

        }


//        For-each (numbers) i++ ~ i=i+1

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(i);
        }

        String[] colors = {"Red", "Pink", "Red", "Crimson", "Magenta", "Orange"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

//        for-each (___)

        for (String h : colors) {
            System.out.println(h);
        }

        for (int i = 6; i <= 50; i += 2) {       // i+=2 ~ i=i+2
            System.out.println(i);

        }


//        Boolean

        boolean ph = true;
        while (ph) {
            System.out.println("In the loop");
            ph = false;
        }


        boolean f = false;
        do {
            System.out.println("in the do-while");
        } while (f);

//            Even-numbered

        int[] numbers = {1, 5, 1, 34, 56, 78, 4, 4, 56, 2, -9, 12, 12, 4, 5, 7, 9, 0, -4, 22};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even-numbered: " + number);
//            }

//            Uneven-numbered

                for (int n : numbers) {
                    if (n % 2 == 1 || n % 2 == -1) {
                        if (n % 2 != 0) {
                            System.out.println("Uneven-numbered :" + n);
                        }
                    }
                }

//            Maximum number from array

                int max = numbers[0];
                for (int v : numbers) {
                    if (v > max) {
                        max = v;
                    }
                }
                System.out.println("max:" + max);


//             Minimum number from array

                int min = numbers[0];
                for (int w : numbers) {
                    if (w < min) {
                        min = w;
                    }
                }
                System.out.println("min: " + min);


            }
        }
    }
}
