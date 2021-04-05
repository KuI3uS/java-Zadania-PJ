package Podstawy.Metody;

import java.util.Scanner;

public class Potega {
    public static void main (String[] args){

        System.out.println ("podaj liczbe którą chcesz podnieść do 3 potegi: ");

        Scanner scanner = new Scanner ( System.in );

        int a = scanner.nextInt ();

        System.out.println (a*a*a);
    }
}
