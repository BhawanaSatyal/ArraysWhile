// 10. WAP to input any file digit number and then reverse the number



public class ReverseNumber {


    public static void main(String[] args) {
        int a = 123456;
        int b =0;
        int c;


        while (a !=0){

            c = a %10;
            b = b * 10 + c;
            a = a/10;
        }


        System.out.println("Reverse Number is: " +b);// output
        System.out.println("\n\n\n");
    }

}

