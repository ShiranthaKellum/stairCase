import java.util.Scanner;                                   // import scanner class java.util package to get user input

public class stairCase {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);            // create a scanner object
        System.out.println("n = ");                         // get input
        int n = input.nextInt();                            //              from user

        for (int i = 0; i < n; i++){
            for (int j = 1; j < n-i; j++){
                System.out.print(" ");

            }
            for (int k = 0; k < i+1; k++){
                System.out.print ("#");
            }
            System.out.println();                           // go to next line
            //System.out.println(n);
        }
        input.close ();                                     // close scanner object
    }
}
