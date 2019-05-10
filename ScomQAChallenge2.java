import java.lang.Math;
import java.util.Scanner;

public class ScomQAChallenge2 {

    /*
    This program returns the least palindrome number
    that is greater than the imputed figure by the user
     */
    public static void main(String[] args) {
        System.out.println("Input a number and press ENTER KEY :-");
        Scanner myObj = new Scanner(System.in);
        int start  = myObj.nextInt();
        int b;
        int base = start;
        int counter = 0;
        //int start = 2;
        while (counter < 1) {

            b=Integer.toString(start).length();

            //validate that the entry qualifies to be a palindrome by at least being two digit number

            if (b > 1 && base != start) {
                if (isPrime(start) && isPalin(start)) {
                    System.out.print("The nearest Prime Number Palindrome  to "+base+" is "+start + ".");
                    counter++;
                    if (counter % 10 == 0) {
                        System.out.println();
                    }
                }
            }
            start++;
        }
    }

    public static boolean isPalin(int x) {
        String s = Integer.toString(x);

        for(int i = 0; i < s.length()/2; i++) {
            /*
            after converting to string, check that the characters at opposite
            positions match
            If they do, return true, else return false
             */
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int x) {
        //prime number validation
        //apart from 2, all other prime numbers are odd numbers
        //below, check for prime numbers
        if (x % 2 == 0 && x != 2) {
            return false;
        }

        int sqr = (int)Math.sqrt(x);
        for (int i = 3; i <= sqr; i += 2) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }

}
