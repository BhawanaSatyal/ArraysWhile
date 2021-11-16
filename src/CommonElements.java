//5. Write a Java program to find the common elements between two arrays (string values).

public class CommonElements {
    public static void main(String[] args) { // main method

        String[] arr1 = {"Car", "House", "Office", "Animals"}; // declaring string array variables

        String[] arr2 = {"Rice", "Pasta", "Car", "Office"};

        System.out.println("The common elements are :"); // prints statement
        int i =0;
        while (i<arr1.length){    // condition

            int j =0;
            while (j<arr2.length){

             if(arr1[i].equals(arr2[j]))
                 System.out.println(arr1[i]); // output based on condition
                        j++;
            }

                    i++;
        }
    }
}





