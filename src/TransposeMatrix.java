//9. Write a 2-D array and WAP to transpose matrix

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) { // main method
        int [][]arr= {{1, 2, 3}, {4, 5, 6}, {2, 3, 5}};
        System.out.println(" Matrix Before Transpose"); //  initial output
        int i =0;
        while (i < 3){  // condition
            int j = 0;
            while (j < 3) {
                System.out.print(arr[i][j] + " " + " "); // output
                j++;
            }
                {
                    i++;
                }
            System.out.println("\n");

        }
        System.out.println(" Matrix After Transpose"); // output
        i = 0;       // condition
        while (i < 3){
            int j =0;
            while (j < 3) {
                System.out.print(arr[j][i] + " " + " " ); // output after transposing
                j++;
            }
            {
                i++;
            }
            System.out.println("\n"); // new line
    }
}}
