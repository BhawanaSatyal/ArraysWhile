//7. WAP to test if an array contains specific value
public class SpecificValue {

        public static void main(String[] args) {

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

