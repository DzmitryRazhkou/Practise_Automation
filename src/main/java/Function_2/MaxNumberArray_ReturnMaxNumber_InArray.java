package Function_2;

public class MaxNumberArray_ReturnMaxNumber_InArray {

    public static void main(String[] args) {

        //    We have to get a maximum number from array and put into another array.

        int[] numbers = {1, 5, 4, 2, 5, 7, 2, 1, 7, 9, 6, 6, 4, 3};

//        2) From line 22 --->

        int biggest = Max(numbers);
        System.out.println(biggest);

//        3) Let create another array for double-checking function
        int[] arr_check = {1, 5};
        biggest = Max(arr_check);
        System.out.println(biggest);


        int[] ev = EvenNumbers(numbers);
        for (int v : ev) {
            System.out.println(v);
        }

    }
//      This function return only max number from array.

    public static int Max(int[] arr) {
        int max_number = arr[0];
        for (int number : arr) {
            if (number > max_number) {
                max_number = number;
            }
        }
        return max_number;

    }

    public static int[] EvenNumbers(int[] arr_ev) {

//        we have to run array one time

        int count = 0;
        for (int v : arr_ev) {
            if (v % 2 == 0) {
                count++;

//                In variable "count" we've got quantity of even numbers.
            }
        }

//                We are creating new array.

        int[] evens = new int[count];

        int index = 0;
        for (int v : arr_ev) {
            if (v % 2 == 0) {
                evens[index] = v;
                index++;
            }
        }
        return evens;


    }

}
