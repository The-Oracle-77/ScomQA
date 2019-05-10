import java.util.*;
/*
Simple program to print a product of user input and a count that goes
upto ten(10)
 */

public class ScomQAChallenge1 {

    public static void main(String args[]) {
        System.out.println("Input a number and press ENTER KEY :-");
        Scanner myObj = new Scanner(System.in);
        int x  = myObj.nextInt();
        int count = 0;

       /*System.out.print("Outputs:-");
        System.out.print("\n");*/

        while( count < 10 ) {

           if (x>2 && x < 20) {
               count++;

               System.out.print(x + " x  " + count + " = " + x * count);

               System.out.print("\n");
           }
           else{
               System.out.print("The number needs to be between 2 and 20");
               System.exit(0);
           }
        }
    }
}


