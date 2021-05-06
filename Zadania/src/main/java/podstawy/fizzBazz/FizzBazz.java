package podstawy.fizzBazz;

import java.util.Scanner;

public class FizzBazz {
    public static void main (String[] args){
        System.out.println ("gra FizzBazz");
//        Scanner scanner = new Scanner ( System.in );
//        System.out.println ("podaj liczbe :");
//        int a = scanner.nextInt ();

        for (int i = 0; i <= 100 ; i++ ){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println ( "FizzBazz" );
            } else if (i % 3 == 0) {
                System.out.println ( "Fizz" );
            } else if (i % 5 == 0) {
                System.out.println ( "Bazz" );
            } else {
                System.out.println (i);
            }

        }
    }
}
