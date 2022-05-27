package EveryDayPractise;

public class Loops {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        boolean res;
        res = !(x>y);
        System.out.println(res);

       int t=7;
       while (t>=0){
           System.out.println(t);
           t--;
       }
        System.out.println("Loop while");

       for (int i = 0; i<10; i++){
           if (i>5){
               break;
           }
           System.out.println(i);
       }
        System.out.println("Stop");

       for (int z = 0; z < 10; z++){
           if(z==5){
               continue;
           }
           System.out.println(z);
       }
        System.out.println("Continue after z = 5.");

       for (int c = 0; c <=5; c++){
           int r = 0;
           while (r<3){
               System.out.println(c);
               r++;
           }
       }


    }



}
