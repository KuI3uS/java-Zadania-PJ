package podstawy.metody;

import java.util.Scanner;
//Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn
public class Iloczyn {
    public static void main (String[] args){
        int a , b;

        System.out.println ("podaj 2 liczby");
        Scanner scanner = new Scanner ( System.in );

        System.out.println ("liczba a :");
        a = scanner.nextInt ();

        System.out.println ("liczba b :");
        b = scanner.nextInt ();

        System.out.println ("suma");
        System.out.println (a + b );

        System.out.println ("różnica");
        System.out.println (a - b );

        System.out.println ("iloczyn");
        System.out.println (a * b );

    }
}
