
//3. WAP to enter any String and count the total number of 'a' in that String.

public class TotalACount
      {


        public static void main(String[] args) { // main method
            String string = "My name is Abraham";

            int c = 0;
            int i = 0;
            while (i < string.length())

            {
                if ((string.charAt(i) == 'a') || (string.charAt(i) == 'A'))// condition
                {
                    c++;
                }
                i++;
            }
                System.out.println("Total number of 'a' or 'A' in a sentence is : " + c);// output
            System.out.println("\n\n\n");
            }
        }
