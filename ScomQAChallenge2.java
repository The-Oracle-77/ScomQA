import java.lang.Math;
import java.util.Scanner;

public class ScomQAChallenge2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int start  = myObj.nextInt();
        int b;
        int counter = 0;
        //int start = 2;
        while (counter < 1) {

            b=Integer.toString(start).length();
            if (b > 1) {
                if (isPrime(start) && isPalin(start)) {
                    System.out.print(start + " ");
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
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int x) {
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
