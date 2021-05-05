package podstawy.book.wejsciewyjscie1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie1_1 {
    // napisz program który obliczy pole prostokąta

    public static void main (String[] args)
    throws IOException
    {
        double a , b , pole;

        BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );

        System.out.println ("podaj pole prostokąta");
        System.out.println ("podaj pole A: ");
        a = Double.parseDouble ( br.readLine () );
        System.out.println ("podaj pole B: ");
        b = Double.parseDouble ( br.readLine () );

        pole = a * b ;

        System.out.println ("pole prostokąta o boku a = " + a + "i boku b " + b );
        System.out.println ("wynosi" + pole);
    }
}
