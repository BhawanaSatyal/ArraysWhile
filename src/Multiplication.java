//4. Printing multiplication table using do while loop 1 2 3 2 4 6 3 6 9

public class Multiplication {


         public static void multi(int n) {
            int i = 1;

            do{
                System.out.print(n * i + " \t");

                i ++;
            } while(i <= 3);
        }

        public static void main(String[] args) {
            int i = 1;
            do{
                multi(i);
                i++;

            } while (i <= 3);
            System.out.println("\n \n \n \n \n");
        }
    }