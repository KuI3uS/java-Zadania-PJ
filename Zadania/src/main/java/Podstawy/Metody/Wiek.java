package Podstawy.Metody;

import java.util.Scanner;
// Napisz metodę, która zwróci Twój aktualny wiek.
public class Wiek {
    public static void main (String[] args){

        System.out.println ("podaj wiek :");
        Scanner scanner = new Scanner ( System.in );

        int wiek = scanner.nextInt ();

        if (wiek >= 100 ){
            System.out.println ("nieprawidłowy wiek ");
        } else if (wiek >= 18) {
            System.out.println ("jesteś pełnoletni");
        } else {
            System.out.println ("nie jesteś pełnoletni");
        }

    }
}
