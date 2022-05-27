package Function_1;

public class App_Sum_Int_Double {
    public static int Sum(int a, int b) {
        return a + b;
    }

    public static double Sum1(double c, double d) {
        return c + d;
    }

    public static void main(String[] args) {
        System.out.println(Sum(9, 92));

        double x = Sum1(2.5, 5.7);
        System.out.println(x);
    }
}


