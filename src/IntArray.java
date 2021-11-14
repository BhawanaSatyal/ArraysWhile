//6. WAP to sum values of an int array

import java.util.stream.IntStream;

public class IntArray {

        public static void main(String[] args) {


                int[] a = {5, 10, 15, 20, 25};
                int sum = IntStream.of(a).sum();
                System.out.println("The sum is " + sum);
                System.out.println("\n\n\n");


        }
}
