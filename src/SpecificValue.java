//7. WAP to test if an array contains specific value 8. WAP to test the equality of 2 arrays
public class SpecificValue {

        public static void main(String[] args) {

           // int[] num = {1, 2, 3, 4, 5};
            char[] value = {('A'),('B'), ('C')};
            char toFind = 'A';
            boolean a = false;

           for (int n : value) {
             if (n == toFind) {
                a = true;
                  break;
                }
            }

            if(a)
                System.out.println(toFind + " is found.");
            else
                System.out.println(toFind + " is not found.");
        }
    }

