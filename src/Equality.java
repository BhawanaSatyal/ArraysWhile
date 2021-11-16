
//1. Write a Java program to test the equality of two arrays. // 8. WAP to test the equality of 2 arrays
public class Equality {

        public static void main(String[] args) // main method
        {
            int[] array1 = {2, 5, 7, 9, 11}; //  comparing two arrays

            int[] array2 = {2, 5, 7, 9, 12};

            boolean equalOrNot = true; // condition
            int i =0;

            while (i < array1.length)

            {
                if (array1[i] != array2[i]) {
                    equalOrNot = false;
                    break;
                }
                i++;
            }

            if (equalOrNot)

                System.out.println("Two Arrays Are equal"); // prints this based on condition is true


            else

                System.out.println("Two Arrays Are not Equal"); // output based on condition

        }
    }












