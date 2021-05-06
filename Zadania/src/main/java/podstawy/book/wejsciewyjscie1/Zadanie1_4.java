package podstawy.book.wejsciewyjscie1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie1_4 {
    public static void main (String[] args)
    throws IOException
    {
        double r , objętosc;

        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

        System.out.println ("program oblicz objetość kuli");
        System.out.println ("podja promien r = ");
        r = Double.parseDouble ( br.readLine () );

        objętosc = 4 * Math.PI * r * r * r/3;

        System.out.printf ("Objetość kuli o promieniu r = " + "%2.2f" , r);
        System.out.println ();
        System.out.printf ("objetość = " + "%2.2f" , objętosc);

    }
}
