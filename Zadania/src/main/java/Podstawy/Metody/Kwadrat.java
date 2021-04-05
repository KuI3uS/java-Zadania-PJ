package Podstawy.Metody;

import java.util.Scanner;

import static java.lang.Math.hypot;

public class Kwadrat {
    public static void main (String[] args){

        System.out.println ("podaj liczbe : ");

        Scanner scanner = new Scanner ( System.in );


        int a = scanner.nextInt ();

        System.out.println ( a + Math.sqrt (a));
    }
}
