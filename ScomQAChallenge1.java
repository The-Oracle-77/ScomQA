import java.util.*;


public class ScomQAChallenge1 {

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int x  = myObj.nextInt();
        int count = 0;


        while( count < 10 ) {

            count++;
            System.out.print(x+" x  " + count+" = " + x*count );

            System.out.print("\n");
        }
    }
}


