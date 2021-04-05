package Podstawy.Metody;

import java.util.Scanner;
//Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,
public class Podzielne {
    public static void main (String[] args){

        Scanner scanner = new Scanner ( System.in );
        System.out.println ("podaj liczbe podzielna przez 3 , 5");
        int a = scanner.nextInt ();

        if (a % 3 > 0 || a % 5 > 0){
            System.out.println ("nie jest podzielna przez 3 i przez 5 ");
        } else{
            System.out.println ("jest podzielna przez 3 i przez 5");
        }



    }
}
