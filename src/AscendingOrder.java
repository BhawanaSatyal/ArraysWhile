//2. WAP to enter array and sort the values in ascending order

public class AscendingOrder {
    public static void main(String[] args) { // main method

        int[] arr = {10, 12, 6, 3, 5, -1}; // int array declaration

        System.out.println("The below Numbers are in Ascending order"); // output
        for (int i =0; i < arr.length; i++)
        {
            for (int j = i+1; j< arr.length; j++)
       {
                int temp =0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }}
                    System.out.println(arr[i] + " "); // output based on condition
        }
    }
}






