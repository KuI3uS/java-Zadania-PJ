package podstawy.metody;

import java.util.Scanner;
//Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,
public class Parzysta {
    public static void main (String[] args) {
        int a ;
        System.out.println ("podaj liczbe a srawdze czy jest parzysta :");
        Scanner scanner = new Scanner ( System.in );

        a = scanner.nextInt ();

        if (a % 2 > 0 ){
            System.out.println ("liczba nie jest podzielna");
        } else {
            System.out.println ("libcza jest podzielna");
        }


    }
}
