//7. WAP to test if an array contains specific value
public class SpecificValue {

        public static void main(String[] args) { // main method

            char[] value = {('A'),('B'), ('C')};  // declaring char in array
            char toFind = 'A'; // condition
            boolean a = false;

           for (int n : value) {
             if (n == toFind) {
                a = true;
                  break;
                }
            }

            if(a)
                System.out.println(toFind + " is found."); // output if condition is met
            else
                System.out.println(toFind + " is not found."); // output based on condition met
        }
    }

