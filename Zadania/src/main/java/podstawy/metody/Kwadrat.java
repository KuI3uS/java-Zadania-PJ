package podstawy.metody;

import java.util.Scanner;

public class Kwadrat {
    public static void main (String[] args){

        System.out.println ("podaj liczbe : ");

        Scanner scanner = new Scanner ( System.in );


        int a = scanner.nextInt ();

        System.out.println ( a + Math.sqrt (a));
    }
}
