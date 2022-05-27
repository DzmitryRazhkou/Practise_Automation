package Function_1;

public class ReturnInsteadVoid {
    public static void main(String[] args) {
        int res = ThreeNumbers(8,12,35);
        System.out.println("a" + " + b" + " + c = "+ res);
        double vol = Volume(5.95,14.88);
        System.out.println("Vc = " +vol+ " mm^2.");

    }
    public static int ThreeNumbers (int a, int b, int c) {
        int result = a+b+c;
        return result;
    }

    public static double Volume (double r, double h) {
        double Vc = 2*3.14*r*h;
        return Vc;
    }
}
