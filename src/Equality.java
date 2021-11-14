
//1. Write a Java program to test the equality of two arrays.
public class Equality {

        public static void main(String[] args)
        {
            int[] array1 = {2, 5, 7, 9, 11};

            int[] array2 = {2, 3, 4, 5, 6};

            boolean equalOrNot = true;
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

                System.out.println("Two Arrays Are Not equal");


            else

                System.out.println("Two Arrays Are Equal");

        }
    }












