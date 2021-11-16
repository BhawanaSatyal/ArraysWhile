//9. Write a 2-D array and WAP to transpose matrix

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int [][]arr= {{1, 2, 3}, {4, 5, 6}, {2, 3, 5}};
        System.out.println(" Matrix Before Transpose");
        int i =0;
        while (i < 3){
            int j = 0;
            while (j < 3) {
                System.out.print(arr[i][j] + " " + " ");
                j++;
            }
                {
                    i++;
                }
            System.out.println("\n");

        }
        System.out.println(" Matrix After Transpose");
        i = 0;
        while (i < 3){
            int j =0;
            while (j < 3) {
                System.out.print(arr[j][i] + " " + " " );
                j++;
            }
            {
                i++;
            }
            System.out.println("\n");
    }
}}
